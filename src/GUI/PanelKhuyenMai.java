package GUI;

import BUS.ChiTietKhuyenMaiBUS;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import BUS.KhuyenMaiBUS;
import DTO.KhuyenMaiDTO;
import DTO.CTKMDTO;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelKhuyenMai extends javax.swing.JPanel {

    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    KhuyenMaiBUS bus1 = new KhuyenMaiBUS();
    ArrayList<KhuyenMaiDTO> arr = new ArrayList<KhuyenMaiDTO>();
    SimpleDateFormat formatofDate = new SimpleDateFormat("yyyy-MM-dd");

    public void reset() {
        txt_maKM.setText("");
        txt_loaiKM.setText("");
        txt_tenKM.setText("");
        txt_phantramKM.setText("");
        date_bd.setDate(null);
        date_kt.setDate(null);
    }

    private Vector setVector(KhuyenMaiDTO km) {
        Vector row = new Vector();
        row.add(km.getMaKm());
        row.add(km.getTenCT());
        row.add(km.getLoaiCT());
        row.add(km.getNgayBDKM());
        row.add(km.getNgayKTKM());
        row.add(km.getPhanTramGG());
        return row;
    }

    public KhuyenMaiDTO getText() {
        KhuyenMaiDTO km = new KhuyenMaiDTO();
        km.setMaKm(txt_maKM.getText().trim());
        km.setLoaiCT(txt_loaiKM.getText().trim());
        km.setTenCT(txt_tenKM.getText().trim());
        km.setNgayBDKM(date_bd.getDate());
        km.setNgayKTKM(date_kt.getDate());
        km.setPhanTramGG(Double.valueOf(txt_phantramKM.getText().trim()));

        return km;
    }

    public PanelKhuyenMai() {
        initComponents();
        initData();
        initEvent();
        load();
        load1();
        btn_backKM.setVisible(false);
        model1 = (DefaultTableModel) tbl_km.getModel();
        model2 = (DefaultTableModel) tbl_ctkm.getModel();
    }

    public void initData() {
        txt_maKM.setEnabled(false);
        txt_loaiKM.setEnabled(false);
        date_bd.setEnabled(false);
        date_kt.setEnabled(false);
        txt_phantramKM.setEnabled(false);
        txt_tenKM.setEnabled(false);
        btn_backKM.setVisible(false);
    }

    public void auto_increaseMaKm() {
        String i = null;
        KhuyenMaiDTO km = bus1.docKm().get(bus1.docKm().size() - 1);
        String b = "00";
        String c = "0";
        int a = Integer.parseInt(km.getMaKm().substring(2, 5));
        a++;
        if (a < 10) {
            i = "KM" + b + a;
        }
        if (10 <= a && a <= 99) {
            i = "KM" + c + a;
        }
        if (a > 100) {
            i = "KM" + a;
        }
        txt_maKM.setText(i);
    }

    public void load() {
        KhuyenMaiBUS bus1 = new KhuyenMaiBUS();
        try {
            bus1.docKm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
            return;
        }
        Vector header1 = new Vector();
        header1.add("MaKm");
        header1.add("TenCT");
        header1.add("LoaiCT");
        header1.add("Ngaybatdaukm");
        header1.add("Ngayketthuckm");
        header1.add("phantramgiamgia");
        model1 = new DefaultTableModel(header1, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        showOnTable(KhuyenMaiBUS.danhsach);
    }

    private void setModelValue(KhuyenMaiDTO km, int i) {
        model1.setValueAt(km.getMaKm(), i, 0);
        model1.setValueAt(km.getTenCT(), i, 1);
        model1.setValueAt(km.getLoaiCT(), i, 2);
        model1.setValueAt(km.getNgayBDKM(), i, 3);
        model1.setValueAt(km.getNgayKTKM(), i, 4);
        model1.setValueAt(km.getPhanTramGG(), i, 5);
        tbl_km.setModel(model1);
    }

    private void showOnTable(ArrayList<KhuyenMaiDTO> danhsach) {
        model1.setRowCount(0);
        for (KhuyenMaiDTO km : danhsach) {
            Vector data1 = setVector(km);
            model1.addRow(data1);
        }
        tbl_km.setModel(model1);
    }

    public void load1() {
        ChiTietKhuyenMaiBUS bus2 = new ChiTietKhuyenMaiBUS();
        try {
            bus2.getCTKM();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
            return;
        }
        Vector header2 = new Vector();
        header2.add("MaKm");
        header2.add("MaHang");

        header2.add("PhanTramGGCT");
        model2 = new DefaultTableModel(header2, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        showOnTable1(ChiTietKhuyenMaiBUS.CTKM);
    }

    private void setModelValue1(CTKMDTO CTKM, int i) {
        model2.setValueAt(CTKM.getMaKm(), i, 0);
        model2.setValueAt(CTKM.getMaHang(), i, 1);
        model2.setValueAt(CTKM.getPhanTramGGCT(), i, 2);

        tbl_ctkm.setModel(model2);
    }

    private void showOnTable1(ArrayList<CTKMDTO> CTKM) {
        model2.setRowCount(0);
        for (CTKMDTO ctkm : CTKM) {
            Vector data1 = setVector1(ctkm);
            model2.addRow(data1);
        }
        tbl_ctkm.setModel(model2);
    }

    private Vector setVector1(CTKMDTO ctkm) {
        Vector row = new Vector();
        row.add(ctkm.getMaKm());
        row.add(ctkm.getMaHang());
        row.add(ctkm.getPhanTramGGCT());
        return row;
    }

    private void initEvent() {
        tbl_km.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                try {
                    KhuyenMaiDTO km = new KhuyenMaiDTO();
                    km.setMaKm(arr.get(tbl_km.getSelectedRow()).getMaKm());
                    km.setTenCT(arr.get(tbl_km.getSelectedRow()).getTenCT());
                    km.setLoaiCT(arr.get(tbl_km.getSelectedRow()).getLoaiCT());
                    km.setNgayBDKM(arr.get(tbl_km.getSelectedRow()).getNgayBDKM());
                    km.setNgayKTKM(arr.get(tbl_km.getSelectedRow()).getNgayKTKM());
                    km.setPhanTramGG(arr.get(tbl_km.getSelectedRow()).getPhanTramGG());
                } catch (Exception e) {
                }
            }
        });
    }

    public void loadCTKM(String MaKM) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pn_all = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_tenKM = new javax.swing.JTextField();
        txt_loaiKM = new javax.swing.JTextField();
        txt_phantramKM = new javax.swing.JTextField();
        date_bd = new com.toedter.calendar.JDateChooser();
        date_kt = new com.toedter.calendar.JDateChooser();
        txt_maKM = new javax.swing.JTextField();
        btn_resetKM = new javax.swing.JPanel();
        btn_editKM = new javax.swing.JButton();
        btn_addKM = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_taofile = new javax.swing.JButton();
        btn_nhapfile = new javax.swing.JButton();
        btn_backKM = new javax.swing.JButton();
        pn_ctkm = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ctkm = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cb_timkiemKM = new javax.swing.JComboBox<>();
        txt_timkiem = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        pb_tknc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date_tkbd = new com.toedter.calendar.JDateChooser();
        date_tkkt = new com.toedter.calendar.JDateChooser();
        btn_find1 = new javax.swing.JButton();
        pn_km = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_km = new javax.swing.JTable();

        pn_all.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        jLabel1.setText("Mã khuyến mãi:");

        jLabel3.setText("Tên chương trình: ");

        jLabel4.setText("Loại chương trình: ");

        jLabel5.setText("Ngày bắt đầu: ");

        jLabel6.setText("Ngày kết thúc: ");

        jLabel7.setText("Phần trăm giảm giá:");

        txt_phantramKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phantramKMKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_maKM, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_phantramKM))
                            .addComponent(txt_tenKM)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(date_kt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_loaiKM)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_phantramKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_loaiKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date_bd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_kt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_resetKM.setBackground(new java.awt.Color(255, 255, 255));
        btn_resetKM.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));
        btn_resetKM.setPreferredSize(new java.awt.Dimension(395, 160));

        btn_editKM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_editKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        btn_editKM.setText("Sửa");
        btn_editKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editKMMouseClicked(evt);
            }
        });
        btn_editKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editKMActionPerformed(evt);
            }
        });

        btn_addKM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_addKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btn_addKM.setText("Thêm");
        btn_addKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addKMMouseClicked(evt);
            }
        });
        btn_addKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addKMActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
        });

        btn_taofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/export.png"))); // NOI18N
        btn_taofile.setText("Tạo file");
        btn_taofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_taofileMouseClicked(evt);
            }
        });

        btn_nhapfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/import.png"))); // NOI18N
        btn_nhapfile.setText("Nhập từ file");
        btn_nhapfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nhapfileMouseClicked(evt);
            }
        });

        btn_backKM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_backKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btn_backKM.setText("Back");
        btn_backKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backKMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_resetKMLayout = new javax.swing.GroupLayout(btn_resetKM);
        btn_resetKM.setLayout(btn_resetKMLayout);
        btn_resetKMLayout.setHorizontalGroup(
            btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_resetKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addKM, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_backKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nhapfile, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_taofile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        btn_resetKMLayout.setVerticalGroup(
            btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_resetKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addKM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editKM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nhapfile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(btn_resetKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_taofile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_backKM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbl_ctkm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbl_ctkm);

        javax.swing.GroupLayout pn_ctkmLayout = new javax.swing.GroupLayout(pn_ctkm);
        pn_ctkm.setLayout(pn_ctkmLayout);
        pn_ctkmLayout.setHorizontalGroup(
            pn_ctkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        pn_ctkmLayout.setVerticalGroup(
            pn_ctkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 51, 255))); // NOI18N

        cb_timkiemKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khuyến mãi", "Tên Chương Trình", "Loại chương trình" }));
        cb_timkiemKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_timkiemKMActionPerformed(evt);
            }
        });

        btn_find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btn_find.setText("Tìm kiếm");
        btn_find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_findMouseClicked(evt);
            }
        });
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_timkiemKM, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_find))
                    .addComponent(cb_timkiemKM, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        pb_tknc.setBackground(new java.awt.Color(255, 255, 255));
        pb_tknc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm nâng cao", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setText("Ngày bắt đầu:");

        jLabel8.setText("Ngày kết thúc:");

        btn_find1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_find1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btn_find1.setText("Tìm kiếm");
        btn_find1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_find1MouseClicked(evt);
            }
        });
        btn_find1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pb_tkncLayout = new javax.swing.GroupLayout(pb_tknc);
        pb_tknc.setLayout(pb_tkncLayout);
        pb_tkncLayout.setHorizontalGroup(
            pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pb_tkncLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pb_tkncLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_tkkt, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(date_tkbd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_find1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pb_tkncLayout.setVerticalGroup(
            pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pb_tkncLayout.createSequentialGroup()
                .addGroup(pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pb_tkncLayout.createSequentialGroup()
                        .addGroup(pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_tkbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pb_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_tkkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pb_tkncLayout.createSequentialGroup()
                        .addComponent(btn_find1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tbl_km.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_km.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_km);

        javax.swing.GroupLayout pn_kmLayout = new javax.swing.GroupLayout(pn_km);
        pn_km.setLayout(pn_kmLayout);
        pn_kmLayout.setHorizontalGroup(
            pn_kmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        pn_kmLayout.setVerticalGroup(
            pn_kmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_allLayout = new javax.swing.GroupLayout(pn_all);
        pn_all.setLayout(pn_allLayout);
        pn_allLayout.setHorizontalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_allLayout.createSequentialGroup()
                        .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_resetKM, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_ctkm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pb_tknc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pn_allLayout.setVerticalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_allLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_resetKM, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_allLayout.createSequentialGroup()
                        .addComponent(pn_ctkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pb_tknc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_all, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editKMMouseClicked

    }//GEN-LAST:event_btn_editKMMouseClicked

    private void btn_addKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addKMMouseClicked

    }//GEN-LAST:event_btn_addKMMouseClicked

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        initData();
        load();
        loadCTKM(null);
           txt_maKM.setText("");
        txt_loaiKM.setText("");
        txt_tenKM.setText("");
        txt_phantramKM.setText("");
        date_bd.setDate(null);
        date_kt.setDate(null);
        date_tkbd.setDate(null);
        date_tkkt.setDate(null);
    }//GEN-LAST:event_btn_resetMouseClicked

    private void btn_taofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_taofileMouseClicked

    }//GEN-LAST:event_btn_taofileMouseClicked

    private void btn_nhapfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nhapfileMouseClicked


    }//GEN-LAST:event_btn_nhapfileMouseClicked

    private void btn_backKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backKMMouseClicked
        initData();
        load();
        loadCTKM(null);
        btn_addKM.setText("Thêm");
        btn_editKM.setText("Sửa");
        btn_backKM.setVisible(false);
    }//GEN-LAST:event_btn_backKMMouseClicked

    private void btn_findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_findMouseClicked

    }//GEN-LAST:event_btn_findMouseClicked

    private void btn_find1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_find1MouseClicked

    }//GEN-LAST:event_btn_find1MouseClicked

    private void tbl_kmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kmMouseClicked
        int i = tbl_km.getSelectedRow();
        if (i >= 0) {
            txt_maKM.setText(tbl_km.getModel().getValueAt(i, 0).toString());
            txt_tenKM.setText(tbl_km.getModel().getValueAt(i, 1).toString());
            txt_loaiKM.setText(tbl_km.getModel().getValueAt(i, 2).toString());
            date_bd.setDate((Date) tbl_km.getModel().getValueAt(i, 3));
            date_kt.setDate((Date) tbl_km.getModel().getValueAt(i, 4));
            txt_phantramKM.setText(tbl_km.getModel().getValueAt(i, 5).toString());
        }    String query = txt_maKM.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model2);
        tbl_ctkm.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_tbl_kmMouseClicked

    private void txt_phantramKMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phantramKMKeyReleased

    }//GEN-LAST:event_txt_phantramKMKeyReleased

    private void cb_timkiemKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_timkiemKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_timkiemKMActionPerformed

    private void btn_addKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addKMActionPerformed
        if (btn_addKM.getText().toString().equals("Thêm")) {
            txt_maKM.setEnabled(true);
            txt_maKM.setEditable(false);
            txt_phantramKM.setEnabled(true);
            txt_tenKM.setEnabled(true);
            txt_loaiKM.setEnabled(true);
            date_bd.setEnabled(true);
            date_kt.setEnabled(true);
            btn_addKM.setText("Xác nhận");
            reset();
        } else {
            if (txt_maKM.getText().length() != 0 && txt_phantramKM.getText().length() != 0
                    && txt_tenKM.getText().length() != 0 && txt_loaiKM.getText().length() != 0
                    && date_bd.getDate() != null && date_kt.getDate() != null) {
                btn_addKM.setText("Thêm");
                int k = JOptionPane.showConfirmDialog(null, "Xác nhận thêm", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                if (k == 1) {
                    initData();
                    return;
                }
                if (k == 2) {
                    btn_addKMActionPerformed(evt);
                    return;
                }
                KhuyenMaiDTO km = getText();
                Vector head1 = setVector(km);
                int check = bus1.themKm(km);
                if (check == 1) {
                    model1.addRow(head1);
                    tbl_km.setModel(model1);
                    txt_maKM.setEnabled(false);
                    txt_tenKM.setEnabled(false);
                    txt_phantramKM.setEnabled(false);
                    txt_loaiKM.setEnabled(false);
                    date_bd.setEnabled(false);
                    date_kt.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");
            }
        }
        auto_increaseMaKm();
    }//GEN-LAST:event_btn_addKMActionPerformed

    private void btn_editKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editKMActionPerformed
        if (btn_editKM.getText().toString().equals("Sửa")) {

            txt_phantramKM.setEnabled(true);
            txt_tenKM.setEnabled(true);
            txt_loaiKM.setEnabled(true);
            date_bd.setEnabled(true);
            date_kt.setEnabled(true);
            btn_editKM.setText("Xác nhận");
        } else {
            if (txt_tenKM.getText().length() != 0 && txt_loaiKM.getText().length() != 0
                    && txt_phantramKM.getText().length() != 0 && date_bd.getDate() != null
                    && date_kt.getDate() != null) {
                btn_editKM.setText("Sửa");
                int i = tbl_km.getSelectedRow();
                if (i >= 0) {
                    int k = JOptionPane.showConfirmDialog(null, "Xác nhận sửa", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (k == 1) {
                        initData();
                        return;
                    }
                    if (k == 2) {
                        btn_editKMActionPerformed(evt);
                        return;
                    }
                    KhuyenMaiDTO km = getText();
                    int check = bus1.suaKm(km, i);
                    if (check == 1) {
                        setModelValue(km, i);
                        txt_maKM.setEnabled(false);
                    txt_tenKM.setEnabled(false);
                    txt_phantramKM.setEnabled(false);
                    txt_loaiKM.setEnabled(false);
                    date_bd.setEnabled(false);
                    date_kt.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Sửa thành công");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sửa thất bại");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");
            }
        }
    }//GEN-LAST:event_btn_editKMActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed

        try {

            String selectedOption = cb_timkiemKM.getSelectedItem().toString();

            String searchText = txt_timkiem.getText();

            List<KhuyenMaiDTO> searchResult = KhuyenMaiBUS.timKiem(selectedOption, searchText);

            if (searchResult.size() > 0) {

                model1.setRowCount(0);
                for (KhuyenMaiDTO km : searchResult) {
                    Vector<Object> row = new Vector<>();
                    row.add(km.getMaKm());
                    row.add(km.getTenCT());
                    row.add(km.getLoaiCT());
                    row.add(km.getNgayBDKM());
                    row.add(km.getNgayKTKM());
                    row.add(km.getPhanTramGG());
                    model1.addRow(row);
                }
                tbl_km.setModel(model1);

                
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả phù hợp!");
            }
        } catch (Exception ex) {
            Logger.getLogger(PanelKhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_find1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find1ActionPerformed
        Date batdau = date_tkbd.getDate();
        Date ketthuc = date_tkkt.getDate();
        List<KhuyenMaiDTO> searchResults = KhuyenMaiBUS.timKiemTheoNgay(batdau, ketthuc);
        if (searchResults.size() > 0) {
            model1.setRowCount(0);
            for (KhuyenMaiDTO km : searchResults) {
                Vector<Object> row = new Vector<>();
                row.add(km.getMaKm());
                row.add(km.getTenCT());
                row.add(km.getLoaiCT());
                row.add(km.getNgayBDKM());
                row.add(km.getNgayKTKM());
                row.add(km.getPhanTramGG());
                model1.addRow(row);
            }
            tbl_km.setModel(model1);
            
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả phù hợp!");
        }


    }//GEN-LAST:event_btn_find1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addKM;
    private javax.swing.JButton btn_backKM;
    private javax.swing.JButton btn_editKM;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_find1;
    private javax.swing.JButton btn_nhapfile;
    private javax.swing.JButton btn_reset;
    private javax.swing.JPanel btn_resetKM;
    private javax.swing.JButton btn_taofile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cb_timkiemKM;
    private com.toedter.calendar.JDateChooser date_bd;
    private com.toedter.calendar.JDateChooser date_kt;
    private com.toedter.calendar.JDateChooser date_tkbd;
    private com.toedter.calendar.JDateChooser date_tkkt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pb_tknc;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_ctkm;
    private javax.swing.JPanel pn_km;
    private javax.swing.JTable tbl_ctkm;
    private javax.swing.JTable tbl_km;
    private javax.swing.JTextField txt_loaiKM;
    private javax.swing.JTextField txt_maKM;
    private javax.swing.JTextField txt_phantramKM;
    private javax.swing.JTextField txt_tenKM;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
