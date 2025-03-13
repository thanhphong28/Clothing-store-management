
package GUI;


import static GUI.PanelHoaDon.maHDafterclick;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static untils.CheckData.checkNumber;

public class PanelChiTietHoaDon extends javax.swing.JPanel {
    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    
    public PanelChiTietHoaDon() {
        initComponents();
        model1 = (DefaultTableModel) tb_cthd.getModel();
        model2 = (DefaultTableModel) tb_sanpham.getModel();        
        initData();
        bt_backcthd.setVisible(false);
    }
    public PanelChiTietHoaDon(String mahd) {
        initComponents();
        model1 = (DefaultTableModel) tb_cthd.getModel();
        model2 = (DefaultTableModel) tb_sanpham.getModel();        
        initData();
        cb_hd.setSelectedItem(maHDafterclick);        
        bt_backcthd.setVisible(false);
    }    

    private void initData() {
        cb_hd.setEnabled(false);
        cb_sanpham.setEnabled(false);
        txt_soluong.setEnabled(false);
        txt_giamgia.setEnabled(false);
        txt_dongia.setEnabled(false);
        txt_ttien.setEnabled(false);
        bt_backcthd.setVisible(false);
    }   
 
    public void changeSL_afteradd(int input){
        
    } //giảm số lượng sản phẩm khi thêm chi tiết hóa đơn
    
    public void changedSLincthd(int input,int available){
        
    }//Tăng giảm số lượng sản phẩm sau khi sửa   
    
    public void changeTongtienHDfromCT(){
        
    }// sửa thành tiền của hóa đơn sau khi sửa cthd
    
    public void changeTonggiamgiaHDfromCT(){
       
    }// sửa tổng giảm giá của hóa đơn sau khi tác động cthd

    public void changelastThanhtien(){
        
    }   // sửa thành tiền cuối cùng
    
    public void reset(){
        txt_dongia.setText("");
        cb_hd.setSelectedIndex(0);
        cb_sanpham.setSelectedIndex(0);
        txt_ttien.setText("");
        txt_soluong.setText("");
        txt_giamgia.setText("");
        txt_TimKiem.setText("");
        txt_tknc1.setText("");
        txt_tknc2.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_cthd = new javax.swing.JPanel();
        lb_dongia = new javax.swing.JLabel();
        txt_dongia = new javax.swing.JTextField();
        lb_mhd = new javax.swing.JLabel();
        lb_hang = new javax.swing.JLabel();
        lb_ttien = new javax.swing.JLabel();
        txt_ttien = new javax.swing.JTextField();
        cb_hd = new javax.swing.JComboBox<>();
        cb_sanpham = new javax.swing.JComboBox<>();
        lb_soluong = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        lb_giamgia = new javax.swing.JLabel();
        txt_giamgia = new javax.swing.JTextField();
        pn_docthd = new javax.swing.JPanel();
        bt_addcthd = new javax.swing.JButton();
        bt_resetcthd = new javax.swing.JButton();
        bt_changecthd = new javax.swing.JButton();
        btn_nhapfile = new javax.swing.JButton();
        btn_taofile = new javax.swing.JButton();
        pn_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cthd = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;

            }};
            pn_sanpham = new javax.swing.JPanel();
            jScrollPane2 = new javax.swing.JScrollPane();
            tb_sanpham = new javax.swing.JTable(){
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
            btn_tknc = new javax.swing.JButton();
            bt_backcthd = new javax.swing.JButton();
            pn_fromto = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            txt_tknc1 = new javax.swing.JTextField();
            txt_tknc2 = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();

            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            pn_all.setBackground(new java.awt.Color(255, 255, 255));
            pn_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            pn_cthd.setBackground(new java.awt.Color(255, 255, 255));
            pn_cthd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N
            pn_cthd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lb_dongia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            lb_dongia.setText("Đơn giá:");
            pn_cthd.add(lb_dongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, -1, -1));
            pn_cthd.add(txt_dongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 88, 310, 28));

            lb_mhd.setText("Mã hóa đơn:");
            pn_cthd.add(lb_mhd, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 26, -1, -1));

            lb_hang.setText("Mã hàng:");
            pn_cthd.add(lb_hang, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 26, -1, -1));

            lb_ttien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            lb_ttien.setText("Thành tiền:");
            pn_cthd.add(lb_ttien, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 135, -1, -1));
            pn_cthd.add(txt_ttien, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 128, 310, 26));

            cb_hd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            pn_cthd.add(cb_hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 23, 100, -1));

            cb_sanpham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            pn_cthd.add(cb_sanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 23, 108, -1));

            lb_soluong.setText("Số lượng:");
            pn_cthd.add(lb_soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, -1, -1));

            txt_soluong.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txt_soluongKeyReleased(evt);
                }
            });
            pn_cthd.add(txt_soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 54, 100, -1));

            lb_giamgia.setText("Tiền giảm giá:");
            pn_cthd.add(lb_giamgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 57, -1, -1));
            pn_cthd.add(txt_giamgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 54, 108, -1));

            pn_all.add(pn_cthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, 160));

            pn_docthd.setBackground(new java.awt.Color(255, 255, 255));
            pn_docthd.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));
            pn_docthd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            bt_addcthd.setBackground(new java.awt.Color(204, 204, 204));
            bt_addcthd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            bt_addcthd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
            bt_addcthd.setText("Thêm");
            bt_addcthd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_addcthdActionPerformed(evt);
                }
            });
            pn_docthd.add(bt_addcthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 118, 38));

            bt_resetcthd.setBackground(new java.awt.Color(204, 204, 204));
            bt_resetcthd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            bt_resetcthd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
            bt_resetcthd.setText("Reset");
            bt_resetcthd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_resetcthdActionPerformed(evt);
                }
            });
            pn_docthd.add(bt_resetcthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 52, 118, 38));

            bt_changecthd.setBackground(new java.awt.Color(204, 204, 204));
            bt_changecthd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            bt_changecthd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
            bt_changecthd.setText("Sửa");
            bt_changecthd.setMaximumSize(new java.awt.Dimension(65, 23));
            bt_changecthd.setMinimumSize(new java.awt.Dimension(65, 23));
            bt_changecthd.setPreferredSize(new java.awt.Dimension(65, 23));
            bt_changecthd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_changecthdActionPerformed(evt);
                }
            });
            pn_docthd.add(bt_changecthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 118, 38));

            btn_nhapfile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            btn_nhapfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/import.png"))); // NOI18N
            btn_nhapfile.setText("Nhập file");
            btn_nhapfile.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btn_nhapfileMouseClicked(evt);
                }
            });
            pn_docthd.add(btn_nhapfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 18, 232, 38));

            btn_taofile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            btn_taofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/export.png"))); // NOI18N
            btn_taofile.setText("Tạo file");
            btn_taofile.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btn_taofileMouseClicked(evt);
                }
            });
            pn_docthd.add(btn_taofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 88, 232, 38));

            pn_all.add(pn_docthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 600, 130));

            pn_table.setBackground(new java.awt.Color(255, 255, 255));
            pn_table.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N

            tb_cthd.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {},
                    {},
                    {},
                    {}
                },
                new String [] {

                }
            ));
            tb_cthd.setToolTipText("");
            tb_cthd.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tb_cthdMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(tb_cthd);

            javax.swing.GroupLayout pn_tableLayout = new javax.swing.GroupLayout(pn_table);
            pn_table.setLayout(pn_tableLayout);
            pn_tableLayout.setHorizontalGroup(
                pn_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
            );
            pn_tableLayout.setVerticalGroup(
                pn_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            );

            pn_all.add(pn_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1030, -1));

            pn_sanpham.setBackground(new java.awt.Color(255, 255, 255));
            pn_sanpham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N
            pn_sanpham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            tb_sanpham.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Mã hàng", "Tên hàng", "Đơn giá", "Số lượng"
                }
            ));
            tb_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tb_sanphamMouseClicked(evt);
                }
            });
            jScrollPane2.setViewportView(tb_sanpham);

            pn_sanpham.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, 410, 130));

            pn_all.add(pn_sanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 420, 150));

            pn_find.setBackground(new java.awt.Color(255, 255, 255));
            pn_find.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
            pn_find.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            cb_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            cb_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Mã hàng" }));
            pn_find.add(cb_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, 102, -1));
            pn_find.add(txt_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 25, 348, -1));

            btn_TimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
            btn_TimKiem.setText("Tìm kiếm");
            btn_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btn_TimKiemMouseClicked(evt);
                }
            });
            pn_find.add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 24, -1, 28));

            pn_all.add(pn_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 600, 60));

            pn_tknc.setBackground(new java.awt.Color(255, 255, 255));
            pn_tknc.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm nâng cao"));
            pn_tknc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            cb_tknc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            cb_tknc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn giá", "Thành tiền" }));
            pn_tknc.add(cb_tknc, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 21, 112, -1));

            btn_tknc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            btn_tknc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
            btn_tknc.setText("Tìm kiếm");
            btn_tknc.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btn_tkncMouseClicked(evt);
                }
            });
            pn_tknc.add(btn_tknc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 62, 227, -1));

            bt_backcthd.setBackground(new java.awt.Color(204, 204, 204));
            bt_backcthd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            bt_backcthd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
            bt_backcthd.setText("Back");
            bt_backcthd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_backcthdActionPerformed(evt);
                }
            });
            pn_tknc.add(bt_backcthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 18, 227, -1));

            pn_fromto.setBackground(new java.awt.Color(255, 255, 255));

            jLabel1.setText("Từ:");

            jLabel2.setText("đến:");

            javax.swing.GroupLayout pn_fromtoLayout = new javax.swing.GroupLayout(pn_fromto);
            pn_fromto.setLayout(pn_fromtoLayout);
            pn_fromtoLayout.setHorizontalGroup(
                pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_fromtoLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txt_tknc1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txt_tknc2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap())
            );
            pn_fromtoLayout.setVerticalGroup(
                pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_fromtoLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addGroup(pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tknc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_fromtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tknc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );

            pn_tknc.add(pn_fromto, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 51, -1, -1));

            jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Tìm kiếm theo:");
            pn_tknc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 106, -1));

            pn_all.add(pn_tknc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 600, 108));

            add(pn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 590));
        }// </editor-fold>//GEN-END:initComponents

    private void bt_backcthdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backcthdActionPerformed
        
    }//GEN-LAST:event_bt_backcthdActionPerformed

    private void btn_tkncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tkncMouseClicked
        
    }//GEN-LAST:event_btn_tkncMouseClicked

    private void btn_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimKiemMouseClicked
        
    }//GEN-LAST:event_btn_TimKiemMouseClicked

    private void tb_cthdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_cthdMouseClicked
    
    }//GEN-LAST:event_tb_cthdMouseClicked

    private void bt_changecthdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changecthdActionPerformed
  
    }//GEN-LAST:event_bt_changecthdActionPerformed

    private void bt_resetcthdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetcthdActionPerformed
        reset();
    }//GEN-LAST:event_bt_resetcthdActionPerformed

    private void bt_addcthdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addcthdActionPerformed
       
    }//GEN-LAST:event_bt_addcthdActionPerformed

    private void tb_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sanphamMouseClicked
       
    }//GEN-LAST:event_tb_sanphamMouseClicked

    private void txt_soluongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_soluongKeyReleased
   
    }//GEN-LAST:event_txt_soluongKeyReleased

    private void btn_nhapfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nhapfileMouseClicked
     
    }//GEN-LAST:event_btn_nhapfileMouseClicked

    private void btn_taofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_taofileMouseClicked
     
    }//GEN-LAST:event_btn_taofileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addcthd;
    private javax.swing.JButton bt_backcthd;
    private javax.swing.JButton bt_changecthd;
    private javax.swing.JButton bt_resetcthd;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_nhapfile;
    private javax.swing.JButton btn_taofile;
    private javax.swing.JButton btn_tknc;
    private javax.swing.JComboBox<String> cb_TimKiem;
    private javax.swing.JComboBox<String> cb_hd;
    private javax.swing.JComboBox<String> cb_sanpham;
    private javax.swing.JComboBox<String> cb_tknc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_dongia;
    private javax.swing.JLabel lb_giamgia;
    private javax.swing.JLabel lb_hang;
    private javax.swing.JLabel lb_mhd;
    private javax.swing.JLabel lb_soluong;
    private javax.swing.JLabel lb_ttien;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_cthd;
    private javax.swing.JPanel pn_docthd;
    private javax.swing.JPanel pn_find;
    private javax.swing.JPanel pn_fromto;
    private javax.swing.JPanel pn_sanpham;
    private javax.swing.JPanel pn_table;
    private javax.swing.JPanel pn_tknc;
    private javax.swing.JTable tb_cthd;
    private javax.swing.JTable tb_sanpham;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JTextField txt_dongia;
    private javax.swing.JTextField txt_giamgia;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tknc1;
    private javax.swing.JTextField txt_tknc2;
    private javax.swing.JTextField txt_ttien;
    // End of variables declaration//GEN-END:variables
}
