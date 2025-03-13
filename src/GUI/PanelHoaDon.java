package GUI;


import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.DocumentException;

import BUS.ChiTietHoaDonBUS;
import BUS.HoaDonBUS;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;

public class PanelHoaDon extends javax.swing.JPanel {
    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    
	ArrayList<HoaDonDTO> ar = new ArrayList<HoaDonDTO>();
	ArrayList<ChiTietHoaDonDTO> ar_cthd = new ArrayList<ChiTietHoaDonDTO>();
	ArrayList<String> maKh = new ArrayList<String>();
	ArrayList<String> maNv = new ArrayList<String>();
	ArrayList<String> maKm = new ArrayList<String>();
	HoaDonBUS bus = new HoaDonBUS();
	ChiTietHoaDonBUS bus_cthd = new ChiTietHoaDonBUS();
    SimpleDateFormat formatofDate;
    public static String maHDafterclick;

    public PanelHoaDon() {
        initComponents();
        model1 = (DefaultTableModel) tb_HoaDon.getModel();
        model2 = (DefaultTableModel) tb_cthd.getModel();        
        formatofDate = new SimpleDateFormat("yyyy-MM-dd");       
        initData();
        load();  
        btn_Back.setVisible(false);
    }
    private void initData() {
        txt_mhd.setEnabled(false);
        cb_kh.setEnabled(false);
        cb_km.setEnabled(false);
        cb_nv.setEnabled(false);
        date_ngay.setEnabled(false);
        txt_ttien.setEnabled(false);
        txt_tonggg.setEnabled(false);
        txt_tongtien.setEnabled(false);
        btn_Back.setVisible(false);
        pn_fromto.setVisible(false);
    }
    public void load() {
    	try {
    		ar_cthd = bus_cthd.docCTHD();
    		ar = bus.docHD();
    		maNv = bus.docMaNv();
    		maKh = bus.docMaKh(); 		
    	} catch(Exception e) {
    		e.printStackTrace();
    		return;
    	}
    	for (int i = 0; i < maKh.size(); i++)
			cb_kh.addItem(maKh.get(i));
    	for (int i = 0; i < maNv.size(); i++)
    		cb_nv.addItem(maNv.get(i));
    	loadTable(ar);
    	
    }
    public void loadMaKm(String date) {
    	try {
    		maKm = bus.docMaKm(date);
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    	for (int i = 0; i < maKm.size(); i++)
    		cb_km.addItem(maKm.get(i));
    	//cb_km.setEnabled(false);
    }
    public void auto_increaseMaHD(){
        String i = null;
        HoaDonDTO hd= bus.docHD().get(bus.docHD().size()-1);
        String b="00";
        String c="0";
        int a= Integer.parseInt(hd.getMaHd().substring(2,5));
        a++;
        if(a<10){ i="HD"+b+a; }
        if(10<=a && a<=99) {  i ="HD"+c+a; }
        if(a>100){  i="HD"+a; }
        txt_mhd.setText(i);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_tthd = new javax.swing.JPanel();
        lb_mhd = new javax.swing.JLabel();
        txt_mhd = new javax.swing.JTextField();
        lb_nv = new javax.swing.JLabel();
        lb_nxb = new javax.swing.JLabel();
        lb_ttien = new javax.swing.JLabel();
        txt_ttien = new javax.swing.JTextField();
        cb_nv = new javax.swing.JComboBox<>();
        cb_kh = new javax.swing.JComboBox<>();
        lb_km = new javax.swing.JLabel();
        cb_km = new javax.swing.JComboBox<>();
        	cb_km.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                	cb_changeMaKm(evt);
                }

				private void cb_changeMaKm(ActionEvent evt) {
					if(cb_km.getSelectedItem() != null) {
					double tonggg = bus.tinhGG(Double.parseDouble(txt_tongtien.getText()), cb_km.getSelectedItem().toString());
					txt_tonggg.setText(String.valueOf(tonggg));
					double ttien = bus.tinhTT(Double.parseDouble(txt_tongtien.getText()), tonggg);
					txt_ttien.setText(String.valueOf(ttien));
					}}
            });
        ngay_xuat = new javax.swing.JLabel();
        date_ngay = new com.toedter.calendar.JDateChooser();
        date_ngay.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                // Kiểm tra xem sự kiện thay đổi có phải là ngày không
                if ("date".equals(evt.getPropertyName())) {
                    // Thực hiện hàm handleDateChooserChange() khi giá trị trong JDateChooser thay đổi
                    handleDateChooserChange();
                }
            }
        });
        lb_tonggg = new javax.swing.JLabel();
        txt_tonggg = new javax.swing.JTextField();
        lb_tongtien = new javax.swing.JLabel();
        txt_tongtien = new javax.swing.JTextField();
        pn_cthd = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_cthd = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };
        pn_find = new javax.swing.JPanel();
        cb_TimKiem = new javax.swing.JComboBox<>();
        txt_TimKiem = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        pn_tknc = new javax.swing.JPanel();
        cb_tknc = new javax.swing.JComboBox<>();
        txt_tknc1 = new javax.swing.JTextField();
        txt_tknc2 = new javax.swing.JTextField();
        btn_tknc = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        pn_fromto = new javax.swing.JPanel();
        date_from = new com.toedter.calendar.JDateChooser();
        date_to = new com.toedter.calendar.JDateChooser();  
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_hd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_HoaDon = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };
        jPanel1 = new javax.swing.JPanel();
        btn_themHD = new javax.swing.JButton();
        btn_suaHD = new javax.swing.JButton();
        btn_resetHD = new javax.swing.JButton();
        btn_xuatfile = new javax.swing.JButton();
        btn_docfile = new javax.swing.JButton();
        btn_xuathd = new javax.swing.JButton();

        pn_all.setBackground(new java.awt.Color(204, 204, 255));
        pn_all.setPreferredSize(new java.awt.Dimension(931, 680));

        pn_tthd.setBackground(new java.awt.Color(255, 255, 255));
        pn_tthd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        lb_mhd.setText("Mã hóa đơn:");

        lb_nv.setText("Mã nhân viên:");

        lb_nxb.setText("Mã khách hàng:");

        lb_ttien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_ttien.setText("Thành tiền:");

        lb_km.setText("Mã khuyến mãi:");

        ngay_xuat.setText("Ngày xuất:");

        date_ngay.setDateFormatString("yyyy-MM-dd");

        lb_tonggg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_tonggg.setText("Tổng giảm giá:");

        lb_tongtien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_tongtien.setText("Tổng tiền:");

        javax.swing.GroupLayout pn_tthdLayout = new javax.swing.GroupLayout(pn_tthd);
        pn_tthd.setLayout(pn_tthdLayout);
        pn_tthdLayout.setHorizontalGroup(
            pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tthdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_tthdLayout.createSequentialGroup()
                        .addComponent(lb_km)
                        .addGap(10, 10, 10)
                        .addComponent(cb_km, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_tthdLayout.createSequentialGroup()
                        .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_tthdLayout.createSequentialGroup()
                                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nv)
                                    .addComponent(lb_mhd))
                                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_tthdLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn_tthdLayout.createSequentialGroup()
                                                .addComponent(ngay_xuat)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(date_ngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pn_tthdLayout.createSequentialGroup()
                                                .addComponent(lb_nxb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cb_kh, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pn_tthdLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txt_mhd))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_tthdLayout.createSequentialGroup()
                                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_tonggg)
                                    .addComponent(lb_tongtien)
                                    .addComponent(lb_ttien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_tonggg, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txt_tongtien)
                                    .addComponent(txt_ttien))))
                        .addContainerGap())))
        );
        pn_tthdLayout.setVerticalGroup(
            pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tthdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_mhd)
                    .addComponent(txt_mhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_nv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nxb)
                    .addComponent(lb_nv)
                    .addComponent(cb_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_km)
                        .addComponent(cb_km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ngay_xuat))
                    .addComponent(date_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tongtien)
                    .addComponent(txt_tongtien))
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_tthdLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tonggg, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                    .addGroup(pn_tthdLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lb_tonggg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_tthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ttien, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_ttien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_cthd.setBackground(new java.awt.Color(255, 255, 255));
        pn_cthd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        tb_cthd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {"Mã hàng", "Đơn giá", "Số lượng", "Thành tiền", "Tiền giảm"

            }
        ));
        jScrollPane2.setViewportView(tb_cthd);

        javax.swing.GroupLayout pn_cthdLayout = new javax.swing.GroupLayout(pn_cthd);
        pn_cthd.setLayout(pn_cthdLayout);
        pn_cthdLayout.setHorizontalGroup(
            pn_cthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        pn_cthdLayout.setVerticalGroup(
            pn_cthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pn_find.setBackground(new java.awt.Color(255, 255, 255));
        pn_find.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        cb_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cb_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Mã khuyến mãi" }));

        btn_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_findLayout = new javax.swing.GroupLayout(pn_find);
        pn_find.setLayout(pn_findLayout);
        pn_findLayout.setHorizontalGroup(
            pn_findLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_findLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_TimKiem)
                .addContainerGap())
        );
        pn_findLayout.setVerticalGroup(
            pn_findLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_findLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cb_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn_tknc.setBackground(new java.awt.Color(255, 255, 204));
        pn_tknc.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm nâng cao"));

        cb_tknc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cb_tknc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng tiền", "Tiền giảm giá", "Ngày" }));
        cb_tknc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tkncActionPerformed(evt);
            }
        });

        btn_tknc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_tknc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        btn_tknc.setText("Tìm kiếm");
        btn_tknc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tkncActionPerformed(evt);
            }
        });

        btn_Back.setBackground(new java.awt.Color(204, 204, 204));
        btn_Back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        pn_fromto.setBackground(new java.awt.Color(255, 255, 204));

        date_from.setDateFormatString("yyyy-MM-dd");
        date_to.setDateFormatString("yyyy-MM-dd");

        jLabel1.setText("Từ:");

        jLabel2.setText("đến:");

        javax.swing.GroupLayout pn_fromtoLayout = new javax.swing.GroupLayout(pn_fromto);
        pn_fromto.setLayout(pn_fromtoLayout);
        pn_fromtoLayout.setHorizontalGroup(
            pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_fromtoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_from, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(date_to, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_fromtoLayout.setVerticalGroup(
            pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_fromtoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_tkncLayout = new javax.swing.GroupLayout(pn_tknc);
        pn_tknc.setLayout(pn_tkncLayout);
        pn_tkncLayout.setHorizontalGroup(
            pn_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tkncLayout.createSequentialGroup()
                .addGroup(pn_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_tkncLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_tknc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_tknc1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tknc2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pn_fromto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tknc, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_tkncLayout.setVerticalGroup(
            pn_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tkncLayout.createSequentialGroup()
                .addGroup(pn_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tknc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tknc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tknc))
                .addGroup(pn_tkncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_tkncLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pn_fromto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_tkncLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_tknc)))
                .addContainerGap())
        );

        pn_hd.setBackground(new java.awt.Color(255, 255, 255));
        pn_hd.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));

        tb_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {"Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Mã khuyến mãi", "Ngày xuất", "Tổng tiền", "Giảm giá", "Thành tiền"

            }
        ));
        tb_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_HoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_HoaDon);

        javax.swing.GroupLayout pn_hdLayout = new javax.swing.GroupLayout(pn_hd);
        pn_hd.setLayout(pn_hdLayout);
        pn_hdLayout.setHorizontalGroup(
            pn_hdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        pn_hdLayout.setVerticalGroup(
            pn_hdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));

        btn_themHD.setBackground(new java.awt.Color(204, 204, 204));
        btn_themHD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_themHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btn_themHD.setText("Thêm");
        btn_themHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btn_themHDActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btn_suaHD.setBackground(new java.awt.Color(204, 204, 204));
        btn_suaHD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_suaHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        btn_suaHD.setText("Sửa");
        btn_suaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (txt_mhd.getText().isEmpty())
            		JOptionPane.showMessageDialog(null, "Chọn hóa đơn cần sửa");
            	else btn_suaHDActionPerformed(evt);
            }
        });

        btn_resetHD.setBackground(new java.awt.Color(204, 204, 204));
        btn_resetHD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_resetHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btn_resetHD.setText("Reset");
        btn_resetHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetHDMouseClicked(evt);
            }
        });

        btn_xuatfile.setBackground(new java.awt.Color(204, 204, 204));
        btn_xuatfile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_xuatfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/export.png"))); // NOI18N
        btn_xuatfile.setText("Xuất file");
        btn_xuatfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xuatfileMouseClicked(evt);
            }
        });

        btn_docfile.setBackground(new java.awt.Color(204, 204, 204));
        btn_docfile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_docfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/import.png"))); // NOI18N
        btn_docfile.setText("Nhập file");
        btn_docfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_docfileMouseClicked(evt);
            }
        });

        btn_xuathd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_xuathd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        btn_xuathd.setText("Xuất  HD");
        btn_xuathd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					btn_xuathdMouseClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_themHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_xuatfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_resetHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_docfile, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_xuathd, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btn_suaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resetHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xuatfile)
                    .addComponent(btn_docfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xuathd)))
        );

        javax.swing.GroupLayout pn_allLayout = new javax.swing.GroupLayout(pn_all);
        pn_all.setLayout(pn_allLayout);
        pn_allLayout.setHorizontalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_hd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_allLayout.createSequentialGroup()
                        .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_tthd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_tknc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_cthd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pn_allLayout.setVerticalGroup(
            pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_allLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_tthd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_allLayout.createSequentialGroup()
                        .addComponent(pn_cthd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_tknc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_hd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(pn_all, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimKiemMouseClicked
    	ArrayList<HoaDonDTO> ar = new ArrayList<HoaDonDTO>();
    	try {
    		ar = bus.timHoaDon(cb_TimKiem.getSelectedItem().toString(), txt_TimKiem.getText());
    		if (ar == null) 
    			return;
    		model1.setRowCount(0);
    		loadTable(ar);
       }catch (Exception e) {
    	   JOptionPane.showMessageDialog(null,"");
       }
    }//GEN-LAST:event_btn_TimKiemMouseClicked

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        load();
        reset();
        btn_Back.setVisible(false);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void tb_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_HoaDonMouseClicked
    	txt_mhd.setText((String) tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 0));
    	txt_ttien.setText(Double.toString((double) tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(),7)));
    	txt_tonggg.setText(Double.toString((double) tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(),6)));
    	txt_tongtien.setText(Double.toString((double) tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(),5)));
    	cb_nv.setSelectedItem((String)tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 1) );
    	cb_kh.setSelectedItem((String)tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 2) );
    	System.out.print((String)tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 3));
    	try {
			Date date = formatofDate.parse((String) tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 4));
			date_ngay.setDate(date);
			cb_km.setSelectedItem((String)tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 3) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	model2.setRowCount(0);
    	ArrayList <ChiTietHoaDonDTO> ar = new ArrayList<ChiTietHoaDonDTO>();
    	try {
    		ar = bus_cthd.getCTHD((String) tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 0));
    		for (int i = 0; i < ar.size(); i++) {
    			ChiTietHoaDonDTO cthd = ar.get(i);
        		Object[] row = {cthd.getMaHang(), cthd.getDonGia(), cthd.getSoLuong(), cthd.getThanhTien(), cthd.getTienGG()};
        		model2.addRow(row);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }//GEN-LAST:event_tb_HoaDonMouseClicked

    private void btn_themHDActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btn_themHDActionPerformed
    	if (btn_themHD.getText().toString().equals("Thêm")) {
            txt_mhd.setEnabled(true);
            txt_mhd.setEditable(false);
            cb_nv.setSelectedItem(Login.username.toUpperCase());
            System.out.print(Login.username);
            cb_kh.setEnabled(true);
            cb_km.setEnabled(true);
            date_ngay.setEnabled(true);
            txt_ttien.setText("0.0");
            txt_tongtien.setText("0.0");
            txt_tonggg.setText("0.0");
            btn_themHD.setText("Xác nhận");
            }
    else {
        if (txt_mhd.getText().length() != 0 && txt_ttien.getText().length() != 0
            && txt_tongtien.getText().length() != 0 && txt_tonggg.getText().length() != 0
            && cb_nv.getSelectedItem() != null && cb_kh.getSelectedItem() != null
            && cb_km.getSelectedItem() != null) {
            btn_themHD.setText("Thêm");
            int k = JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                initData();
                return;
            }
            if (k==2)
            {
            	btn_themHDActionPerformed(evt);
                return;
            }     
            HoaDonDTO hd = new HoaDonDTO();
            hd.setMaHd(txt_mhd.getText());
            hd.setMaKh(cb_kh.getSelectedItem().toString());
            hd.setMaNv(cb_nv.getSelectedItem().toString());
            hd.setMaKm(cb_km.getSelectedItem().toString());
            hd.setNgayXuat(formatofDate.format(date_ngay.getDate()));
            hd.setThanhTienHd(Double.parseDouble(txt_ttien.getText()));
            hd.setTienGGHd(Double.parseDouble(txt_tonggg.getText()));
            hd.setTongTien(Double.parseDouble(txt_tongtien.getText()));
    		Object[] row = {hd.getMaHd(), hd.getMaNv(), hd.getMaKh(), hd.getMaKm(), hd.getNgayXuat(), hd.getTongTien(), hd.getTienGGHd(), hd.getThanhTienHd()};
            if(bus.themHoaDon(hd) == 1)
        		model1.addRow(row);
              }else{  JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
    	}
    	auto_increaseMaHD();
    }//GEN-LAST:event_btn_themHDActionPerformed

    private void btn_suaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaHDActionPerformed
    	if (btn_suaHD.getText().toString().equals("Sửa")) {
            txt_mhd.setEnabled(true);
            txt_mhd.setEditable(false);
            cb_nv.setSelectedItem(Login.username);
            cb_kh.setEnabled(true);
            cb_km.setEnabled(true);
            date_ngay.setEnabled(true);            
            btn_suaHD.setText("Xác nhận");
            }
    	else {
            if (txt_mhd.getText().length() != 0 && txt_ttien.getText().length() != 0
                && txt_tongtien.getText().length() != 0 && txt_tonggg.getText().length() != 0
                && cb_nv.getSelectedItem() != null && cb_kh.getSelectedItem() != null
                && cb_km.getSelectedItem() != null) {
                btn_suaHD.setText("Sửa");
                int k = JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_CANCEL_OPTION);
                if (k==1)
                {
                    initData();
                    return;
                }
                if (k==2)
                {
                	btn_suaHDActionPerformed(evt);
                    return;
                }     
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHd(txt_mhd.getText());
                hd.setMaKh(cb_kh.getSelectedItem().toString());
                hd.setMaNv(cb_nv.getSelectedItem().toString());
                hd.setMaKm(cb_km.getSelectedItem().toString());
                hd.setNgayXuat(formatofDate.format(date_ngay.getDate()));
                hd.setThanhTienHd(Double.parseDouble(txt_ttien.getText()));
                hd.setTienGGHd(Double.parseDouble(txt_tonggg.getText()));
                hd.setTongTien(Double.parseDouble(txt_tongtien.getText()));
        		Object[] row = {hd.getMaHd(), hd.getMaNv(), hd.getMaKh(), hd.getMaKm(), hd.getNgayXuat(), hd.getTongTien(), hd.getTienGGHd(), hd.getThanhTienHd()};
                if(bus.suaHoaDon(hd) == 1) {
                	reset();
                }
                  }else{  JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
        	}
    }//GEN-LAST:event_btn_suaHDActionPerformed

    private void btn_resetHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetHDMouseClicked
        reset();
    }//GEN-LAST:event_btn_resetHDMouseClicked

    private void btn_tkncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tkncActionPerformed
    	ArrayList<HoaDonDTO> ar = new ArrayList<HoaDonDTO>();
    	try {
    		ar = bus.tkncHoaDon(cb_tknc.getSelectedItem().toString(), txt_tknc1.getText(), txt_tknc2.getText());
    		if (ar == null) 
    			return;
    		model1.setRowCount(0);
    		loadTable(ar);
    		btn_Back.setVisible(true);
       }catch (Exception e) {
    	   e.printStackTrace();
       }
    }//GEN-LAST:event_btn_tkncActionPerformed
    
    private void cb_tkncActionPerformed(java.awt.event.ActionEvent evt) {
    	if(cb_tknc.getSelectedItem().toString().equals("Ngày")) {
        	date_from.setVisible(true);
        	date_to.setVisible(true);
        	System.out.print("hello");
    	}
    }

    private void btn_xuatfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xuatfileMouseClicked
       JFileChooser fchooser = new JFileChooser();
       FileFilter filter = new FileNameExtensionFilter("Microsoft Excel Documents (*.xls, *.xlsx)", "xls", "xlsx");
       fchooser.setFileFilter(filter);
       int res = fchooser.showDialog(null, "Select");
       if (res == JFileChooser.APPROVE_OPTION) {
    	   String path = fchooser.getSelectedFile().getAbsolutePath();
    	   if(!path.endsWith("xls") && !path.endsWith("xlsx")) 
    		   path += ".xlsx";
    	   System.out.println("Đường dẫn đã chọn: " + path);
    	   try {
    	   FileWriter fw = new FileWriter(path);
    	   for (int i = 0; i < model1.getColumnCount(); i++)
    		   fw.write(model1.getColumnName(i) + "\t");
    	   fw.write("\n");
    	    // Write table data to file
    	    for(int i = 0; i < model1.getRowCount(); i++) {
    	        for(int j = 0; j < model1.getColumnCount(); j++) {
    	            fw.write(model1.getValueAt(i, j).toString() + "\t");
    	        }
    	        fw.write("\n");
    	    }
    	    fw.close();

    	    System.out.println("Table saved to file.");
    	   }catch (Exception e) {
    		   e.printStackTrace();
    	   }
       }
       else return;

    }//GEN-LAST:event_btn_xuatfileMouseClicked

    private void btn_docfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_docfileMouseClicked
        JFileChooser fchooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Microsoft Excel Documents (*.xls, *.xlsx)", "xls", "xlsx");
        fchooser.setFileFilter(filter);
        int res = fchooser.showDialog(null, "Select");
        if (res == JFileChooser.APPROVE_OPTION) {
        	model1.setRowCount(0);
        	String path = fchooser.getSelectedFile().getAbsolutePath();
     	   try {
     		   FileReader fr = new FileReader(path);
     		   BufferedReader bf = new BufferedReader(fr);
     		   String firstline = bf.readLine();
     		   String line;
     		   String[] values = {};
     		   while((line = bf.readLine()) != null) {
     			   for(int i = 0; i < 8; i++) {
     				   values = line.split("\t");
     			   }
     			   model1.addRow(values);
     		   }
     		   bf.close();
     	   }catch(Exception e) {
     		   e.printStackTrace();
     	   }
     	   }
    }//GEN-LAST:event_btn_docfileMouseClicked

    private void btn_xuathdMouseClicked(java.awt.event.MouseEvent evt) throws HeadlessException, DocumentException, IOException {//GEN-FIRST:event_btn_xuathdMouseClicked
    	if(tb_HoaDon.getSelectedRow() != -1) {
    	JFileChooser fchooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("PDF files", "pdf");
        fchooser.setFileFilter(filter);
        int res = fchooser.showDialog(null, "Select");
        if (res == JFileChooser.APPROVE_OPTION) {
     	   String path = fchooser.getSelectedFile().getAbsolutePath();
     	   if(!path.endsWith("pdf")) 
     		   path += ".pdf";
     	   //String MaHd = tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 0).toString();
     	   bus.printHoaDon(tb_HoaDon.getValueAt(tb_HoaDon.getSelectedRow(), 0).toString(), path);
        }else return;}
    	else JOptionPane.showMessageDialog(null, "Hãy chọn 1 hóa đơn cần xuất");
    }//GEN-LAST:event_btn_xuathdMouseClicked
    private void handleDateChooserChange() {
    	cb_km.removeAllItems();
    	String date = formatofDate.format(date_ngay.getDate());
    	loadMaKm(date);
    	
    }
    
    public void reset(){
    	model1.setRowCount(0);
    	loadTable(ar);
        txt_mhd.setText("");
        cb_kh.setSelectedItem("");
        cb_km.setSelectedItem("");
        cb_nv.setSelectedItem("");
        txt_tongtien.setText("");
        txt_ttien.setText("");
        txt_tonggg.setText("");
        txt_tknc1.setText("");
        txt_tknc2.setText("");
        txt_TimKiem.setText("");
        cb_kh.setEnabled(false);
        cb_km.setEnabled(false);
        date_ngay.setEnabled(false);
        btn_themHD.setText("Thêm");
        btn_suaHD.setText("Sửa");
        model1.setRowCount(0);
        load();
        model2.setRowCount(0);
    }
    public void loadTable(ArrayList<HoaDonDTO> ar) {
    	for(int i = 0; i < ar.size(); i++) {
    		HoaDonDTO hd = ar.get(i);
    		Object[] row = {hd.getMaHd(), hd.getMaNv(), hd.getMaKh(), hd.getMaKm(), hd.getNgayXuat(), hd.getTongTien(), hd.getTienGGHd(), hd.getThanhTienHd()};
    		model1.addRow(row);
    	}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_docfile;
    private javax.swing.JButton btn_resetHD;
    private javax.swing.JButton btn_suaHD;
    private javax.swing.JButton btn_themHD;
    private javax.swing.JButton btn_tknc;
    private javax.swing.JButton btn_xuatfile;
    private javax.swing.JButton btn_xuathd;
    private javax.swing.JComboBox<String> cb_TimKiem;
    private javax.swing.JComboBox<String> cb_kh;
    private javax.swing.JComboBox<String> cb_km;
    private javax.swing.JComboBox<String> cb_nv;
    private javax.swing.JComboBox<String> cb_tknc;
    private com.toedter.calendar.JDateChooser date_from;
    private com.toedter.calendar.JDateChooser date_ngay;
    private com.toedter.calendar.JDateChooser date_to;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_km;
    private javax.swing.JLabel lb_mhd;
    private javax.swing.JLabel lb_nv;
    private javax.swing.JLabel lb_nxb;
    private javax.swing.JLabel lb_tonggg;
    private javax.swing.JLabel lb_tongtien;
    private javax.swing.JLabel lb_ttien;
    private javax.swing.JLabel ngay_xuat;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_cthd;
    private javax.swing.JPanel pn_find;
    private javax.swing.JPanel pn_fromto;
    private javax.swing.JPanel pn_hd;
    private javax.swing.JPanel pn_tknc;
    private javax.swing.JPanel pn_tthd;
    private javax.swing.JTable tb_HoaDon;
    private javax.swing.JTable tb_cthd;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JTextField txt_mhd;
    private javax.swing.JTextField txt_tknc1;
    private javax.swing.JTextField txt_tknc2;
    private javax.swing.JTextField txt_tonggg;
    private javax.swing.JTextField txt_tongtien;
    private javax.swing.JTextField txt_ttien;
}
