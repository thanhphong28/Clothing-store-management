package GUI;

import BUS.ChiTietKhuyenMaiBUS;
import BUS.KhuyenMaiBUS;
import static BUS.KhuyenMaiBUS.danhsach;
import BUS.SanPhamBUS;
import static BUS.SanPhamBUS.list;
import DAO.CTKMDAO;
import DTO.CTKMDTO;
import DTO.KhuyenMaiDTO;
import DTO.SanPhamDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelChiTietKhuyenMai extends javax.swing.JPanel {

    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    ChiTietKhuyenMaiBUS bus2 = new ChiTietKhuyenMaiBUS();
ArrayList<CTKMDTO> arr2 = new ArrayList<CTKMDTO>();
    public PanelChiTietKhuyenMai() {
        initComponents();
        addItemsToComboBox(cb_maKM);
        addItemsToComboBoxKhac(cb_MaHang);
        initData();
        load();
        initEvent();
        load3();
        loadinCbox();
        btn_back.setVisible(false);
    }

    public void reset() {

        txt_ptgg.setText("");

    }

    public CTKMDTO getText() {
        CTKMDTO ctkm = new CTKMDTO();
        ctkm.setMaKm(cb_maKM.getSelectedItem().toString());
        ctkm.setMaHang(cb_MaHang.getSelectedItem().toString());
        ctkm.setPhanTramGGCT(Double.valueOf(txt_ptgg.getText().trim()));

        return ctkm;
    }

    private void initData() {
        cb_MaHang.setEnabled(false);
        cb_maKM.setEnabled(false);
        txt_ptgg.setEnabled(false);
        btn_back.setVisible(false);
        cb_MaHang.setSelectedIndex(0);
        cb_maKM.setSelectedIndex(0);
        txt_ptgg.setText("");

    }

    private Vector setVector(CTKMDTO ctkm) {
        Vector row = new Vector();
        row.add(ctkm.getMaKm());
        row.add(ctkm.getMaHang());
        row.add(ctkm.getPhanTramGGCT());
        return row;
    }

    private void setModelValue(CTKMDTO ctkm, int i) {
        model1.setValueAt(ctkm.getMaKm(), i, 0);
        model1.setValueAt(ctkm.getMaHang(), i, 1);
        model1.setValueAt(ctkm.getPhanTramGGCT(), i, 2);

        tbl_ctkm.setModel(model1);
    }

    public void load() {
        ChiTietKhuyenMaiBUS bus1 = new ChiTietKhuyenMaiBUS();
        try {
            bus1.getCTKM();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
            return;
        }
        Vector header1 = new Vector();
        header1.add("makm");
        header1.add("mahang");
        header1.add("%chitiet");

        model1 = new DefaultTableModel(header1, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        showOnTable(ChiTietKhuyenMaiBUS.CTKM);
    }

    private void showOnTable(ArrayList<CTKMDTO> CTKM) {
        model1.setRowCount(0);
        for (CTKMDTO ctkm : CTKM) {
            Vector data1 = setVector(ctkm);
            model1.addRow(data1);
        }
        tbl_ctkm.setModel(model1);
    }

    public void loadinCbox() {

    }

    public void loadSanpham(String masach) {

    }
        private Vector setVector3(KhuyenMaiDTO km) {
        Vector row = new Vector();
        row.add(km.getMaKm());
        row.add(km.getTenCT());
        row.add(km.getLoaiCT());
        row.add(km.getNgayBDKM());
        row.add(km.getNgayKTKM());
        row.add(km.getPhanTramGG());
        return row;
    }
 public void load3() {
        KhuyenMaiBUS bus1 = new KhuyenMaiBUS();
        try {
            bus1.docKm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
            return;
        }
        Vector header3 = new Vector();
        header3.add("MaKm");
        header3.add("TenCT");
        header3.add("LoaiCT");
        header3.add("Ngaybatdaukm");
        header3.add("Ngayketthuckm");
        header3.add("phantramgiamgia");
        model2 = new DefaultTableModel(header3, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        showOnTable3(KhuyenMaiBUS.danhsach);
    }

    private void setModelValue3(KhuyenMaiDTO km, int i) {
        model2.setValueAt(km.getMaKm(), i, 0);
        model2.setValueAt(km.getTenCT(), i, 1);
        model2.setValueAt(km.getLoaiCT(), i, 2);
        model2.setValueAt(km.getNgayBDKM(), i, 3);
        model2.setValueAt(km.getNgayKTKM(), i, 4);
        model2.setValueAt(km.getPhanTramGG(), i, 5);
        tbl_sanpham.setModel(model2);
    }

    private void showOnTable3(ArrayList<KhuyenMaiDTO> danhsach) {
        model2.setRowCount(0);
        for (KhuyenMaiDTO km : danhsach) {
            Vector data3 = setVector3(km);
            model2.addRow(data3);
        }
        tbl_sanpham.setModel(model2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ptgg = new javax.swing.JTextField();
        cb_MaHang = new javax.swing.JComboBox<>();
        cb_maKM = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        cb_tk = new javax.swing.JComboBox<>();
        txt_tk = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        pn_sanpham = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();
        pn_ctkm = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ctkm = new javax.swing.JTable();

        pn_all.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel1.setText("Mã khuyến mãi");

        jLabel2.setText("Mã hàng:");

        jLabel3.setText("Phần trăm giảm giá:");

        txt_ptgg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ptggKeyReleased(evt);
            }
        });

        cb_MaHang.setToolTipText("");
        cb_MaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_MaHangActionPerformed(evt);
            }
        });

        cb_maKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_maKMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_MaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_maKM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_ptgg))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_maKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_MaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ptgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thực hiện", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        btn_them.setBackground(new java.awt.Color(204, 204, 204));
        btn_them.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(204, 204, 204));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_sua.setBackground(new java.awt.Color(204, 204, 204));
        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setMaximumSize(new java.awt.Dimension(65, 23));
        btn_sua.setMinimumSize(new java.awt.Dimension(65, 23));
        btn_sua.setPreferredSize(new java.awt.Dimension(65, 23));
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        cb_tk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khuyến mãi", "Mã hàng" }));

        btn_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimKiemMouseClicked(evt);
            }
        });
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(204, 204, 204));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cb_tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tk)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_tk, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txt_tk))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_sanpham.setBackground(new java.awt.Color(255, 255, 255));

        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_sanpham);

        javax.swing.GroupLayout pn_sanphamLayout = new javax.swing.GroupLayout(pn_sanpham);
        pn_sanpham.setLayout(pn_sanphamLayout);
        pn_sanphamLayout.setHorizontalGroup(
            pn_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        pn_sanphamLayout.setVerticalGroup(
            pn_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
        tbl_ctkm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ctkmMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_ctkm);

        javax.swing.GroupLayout pn_ctkmLayout = new javax.swing.GroupLayout(pn_ctkm);
        pn_ctkm.setLayout(pn_ctkmLayout);
        pn_ctkmLayout.setHorizontalGroup(
            pn_ctkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        pn_ctkmLayout.setVerticalGroup(
            pn_ctkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_allLayout = new javax.swing.GroupLayout(pn_all);
        pn_all.setLayout(pn_allLayout);
        pn_allLayout.setHorizontalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_ctkm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_allLayout.createSequentialGroup()
                        .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pn_allLayout.setVerticalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_ctkm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_all, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addItemsToComboBox(JComboBox<String> cb_maKM) {
        KhuyenMaiDTO km = new KhuyenMaiDTO();
        KhuyenMaiBUS.docKm();

        for (KhuyenMaiDTO km1 : danhsach) {
            cb_maKM.addItem(km1.getMaKm());
        }
    }

    public void addItemsToComboBoxKhac(JComboBox<String> cb_maHang) {
        SanPhamBUS bus=new SanPhamBUS();
        for (SanPhamDTO sp1 : bus.docSp() ) {
            cb_maHang.addItem(sp1.getMaHang());
        }
    }  private void initEvent() {
        tbl_ctkm.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            try {
            CTKMDTO ctkm = new CTKMDTO();
            ctkm.setMaKm(arr2.get(tbl_ctkm.getSelectedRow()).getMaKm());
            ctkm.setMaHang(arr2.get(tbl_ctkm.getSelectedRow()).getMaHang());
            ctkm.setPhanTramGGCT(arr2.get(tbl_ctkm.getSelectedRow()).getPhanTramGGCT());
           
            }catch (Exception e) {
            }
        }
        });
    } 

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (btn_them.getText().toString().equals("Thêm")) {
            cb_MaHang.setEnabled(true);
            cb_maKM.setEnabled(true);
            txt_ptgg.setEnabled(true);
            btn_them.setText("Xác nhận");
            reset();
        } else {
            if (txt_ptgg.getText().length() != 0) {
                btn_them.setText("Thêm");
                int k = JOptionPane.showConfirmDialog(null, "Xác nhận thêm", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                if (k == 1) {
                    initData();
                    return;
                }
                if (k == 2) {
                    btn_themActionPerformed(evt);
                    return;
                }
                CTKMDTO ctkm = getText();
                Vector head1 = setVector(ctkm);
                int check = bus2.themKm(ctkm);
                if (check == 1) {
                    model1.addRow(head1);
                    tbl_ctkm.setModel(model1);
                    cb_MaHang.setEnabled(false);
                    cb_maKM.setEnabled(false);
                    txt_ptgg.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");
            }
        }


    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        initData();
        load();
        loadSanpham(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (btn_sua.getText().toString().equals("Sửa")) {

            cb_MaHang.setEnabled(true);
            cb_maKM.setEnabled(true);
            txt_ptgg.setEnabled(true);

            btn_sua.setText("Xác nhận");
        } else {
            if (txt_ptgg.getText().length() != 0) {
                btn_sua.setText("Sửa");
                int i = tbl_ctkm.getSelectedRow();
                if (i >= 0) {
                    int k = JOptionPane.showConfirmDialog(null, "Xác nhận sửa", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (k == 1) {
                        initData();
                        return;
                    }
                    if (k == 2) {
                        btn_suaActionPerformed(evt);
                        return;
                    }
                    CTKMDTO ctkm = getText();
                    int check = bus2.suaKm(ctkm, i);
                    if (check == 1) {
                        setModelValue(ctkm, i);
                        cb_MaHang.setEnabled(false);
                        cb_maKM.setEnabled(false);
                        txt_ptgg.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Sửa thành công");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sửa thất bại");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        initData();
        load();
        loadSanpham(null);
        btn_them.setText("Thêm");
        btn_sua.setText("Sửa");
        btn_back.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimKiemMouseClicked

    }//GEN-LAST:event_btn_TimKiemMouseClicked

    private void tbl_ctkmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ctkmMouseClicked
 int i = tbl_ctkm.getSelectedRow();
        if(i>=0){
            cb_maKM.setSelectedItem(tbl_ctkm.getModel().getValueAt(i, 0).toString());
            cb_MaHang.setSelectedItem(tbl_ctkm.getModel().getValueAt(i, 1).toString());
            txt_ptgg.setText(tbl_ctkm.getModel().getValueAt(i, 2).toString());   
        }String query = cb_maKM.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model2);
        tbl_sanpham.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_tbl_ctkmMouseClicked

    private void txt_ptggKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ptggKeyReleased

    }//GEN-LAST:event_txt_ptggKeyReleased

    private void cb_MaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_MaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_MaHangActionPerformed

    private void cb_maKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_maKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_maKMActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        try {
            String selectedOption = cb_tk.getSelectedItem().toString();
            String searchText = txt_tk.getText().trim();
            ArrayList<CTKMDTO> searchResult;
            searchResult = ChiTietKhuyenMaiBUS.timKiem(selectedOption, searchText);

            if (searchResult.size() > 0) {

                model1.setRowCount(0);
                for (CTKMDTO ctkm : searchResult) {
                    Vector<Object> row = new Vector<>();
                    row.add(ctkm.getMaKm());
                    row.add(ctkm.getMaHang());
                    row.add(ctkm.getPhanTramGGCT());
                    model1.addRow(row);
                }
                tbl_ctkm.setModel(model1);
                btn_back.setVisible(true);}
                else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả phù hợp!");
            }
            }
         catch (Exception ex) {
        }
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int selectedRow = tbl_ctkm.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }
    CTKMDTO ctkm=ChiTietKhuyenMaiBUS.getCTKM().get(selectedRow);
  
        int deleteSuccess = ChiTietKhuyenMaiBUS.xoaCTKM(ctkm.getMaHang());
    if (deleteSuccess == 0) {
      return;
    }
    model1.removeRow(selectedRow);
     
    arr2.remove(ctkm);
    for (int i = selectedRow; i < arr2.size(); i++) {
        model1.setValueAt(i + 1, i, 0);
        setModelValue(ctkm, i);
    }       tbl_ctkm.setModel(model1);
  
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JComboBox<String> cb_MaHang;
    private javax.swing.JComboBox<String> cb_maKM;
    private javax.swing.JComboBox<String> cb_tk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_ctkm;
    private javax.swing.JPanel pn_sanpham;
    private javax.swing.JTable tbl_ctkm;
    private javax.swing.JTable tbl_sanpham;
    private javax.swing.JTextField txt_ptgg;
    private javax.swing.JTextField txt_tk;
    // End of variables declaration//GEN-END:variables
}
