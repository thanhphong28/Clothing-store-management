
package GUI;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelThanhVien extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
      
    public PanelThanhVien() {
        initComponents();
        initData();
        initEvent();
        model = (DefaultTableModel) tb_tv.getModel();
    }
    private void initEvent() {
        
    }    
    private void initData(){
        txt_mtv.setEnabled(false);
        txt_nganh.setEnabled(false);
        txt_khoa.setEnabled(false);
        txt_hoten.setEnabled(false);
        txt_sdt.setEnabled(false);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pn_ttnv = new javax.swing.JPanel();
        lb_mtv = new javax.swing.JLabel();
        txt_mtv = new javax.swing.JTextField();
        lb_khoa = new javax.swing.JLabel();
        txt_khoa = new javax.swing.JTextField();
        lb_hoten = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        lb_excel = new javax.swing.JLabel();
        lb_nganh = new javax.swing.JLabel();
        txt_nganh = new javax.swing.JTextField();
        lb_sdt = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        pn_donv = new javax.swing.JPanel();
        bt_addtv = new javax.swing.JButton();
        bt_resettv = new javax.swing.JButton();
        bt_changetv = new javax.swing.JButton();
        bt_deletetv = new javax.swing.JButton();
        pn_findnv = new javax.swing.JPanel();
        txt_findtv = new javax.swing.JTextField();
        lb_findtv = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tv = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_ttnv.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttnv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN THÀNH VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_ttnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_mtv.setText("Mã thành viên :");
        pn_ttnv.add(lb_mtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        pn_ttnv.add(txt_mtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, -1));

        lb_khoa.setText("Khoa :");
        pn_ttnv.add(lb_khoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));
        pn_ttnv.add(txt_khoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 130, -1));

        lb_hoten.setText("Họ và tên :");
        pn_ttnv.add(lb_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        pn_ttnv.add(txt_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 380, -1));

        lb_excel.setText("Nhập excel");
        pn_ttnv.add(lb_excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        lb_nganh.setText("Ngành :");
        pn_ttnv.add(lb_nganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));
        pn_ttnv.add(txt_nganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 130, -1));

        lb_sdt.setText("Số điện thoại :");
        pn_ttnv.add(lb_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        pn_ttnv.add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));

        jPanel2.add(pn_ttnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1020, 110));
        pn_ttnv.getAccessibleContext().setAccessibleDescription("THÔNG TIN THÀNH VIÊN");

        pn_donv.setBackground(new java.awt.Color(255, 255, 255));
        pn_donv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THỰC HIỆN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_donv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_addtv.setBackground(new java.awt.Color(204, 204, 204));
        bt_addtv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addtv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addtv.setText("Thêm");
        bt_addtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addtvActionPerformed(evt);
            }
        });
        pn_donv.add(bt_addtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 50));

        bt_resettv.setBackground(new java.awt.Color(204, 204, 204));
        bt_resettv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resettv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resettv.setText("Đặt lại");
        bt_resettv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resettvActionPerformed(evt);
            }
        });
        pn_donv.add(bt_resettv, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 120, 50));

        bt_changetv.setBackground(new java.awt.Color(204, 204, 204));
        bt_changetv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changetv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changetv.setText("Sửa");
        bt_changetv.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changetv.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changetv.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changetv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changetvActionPerformed(evt);
            }
        });
        pn_donv.add(bt_changetv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 120, 50));

        bt_deletetv.setBackground(new java.awt.Color(204, 204, 204));
        bt_deletetv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_deletetv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        bt_deletetv.setText("Xóa");
        bt_deletetv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        pn_donv.add(bt_deletetv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, 50));

        jPanel2.add(pn_donv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 670, 80));

        pn_findnv.setBackground(new java.awt.Color(255, 255, 255));
        pn_findnv.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        pn_findnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_findtv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_findtvKeyReleased(evt);
            }
        });
        pn_findnv.add(txt_findtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 210, 40));

        lb_findtv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_findtv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        pn_findnv.add(lb_findtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        jPanel2.add(pn_findnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 340, 80));

        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_tv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_tv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tv);

        panel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 370));

        jPanel2.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1020, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resettvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resettvActionPerformed
    }//GEN-LAST:event_bt_resettvActionPerformed

    private void bt_changetvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changetvActionPerformed
    
    }//GEN-LAST:event_bt_changetvActionPerformed

    private void txt_findtvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_findtvKeyReleased
        String query = txt_findtv.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tb_tv.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_txt_findtvKeyReleased

    private void bt_addtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addtvActionPerformed
   
    }//GEN-LAST:event_bt_addtvActionPerformed

    private void tb_tvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tvMouseClicked
       
    }//GEN-LAST:event_tb_tvMouseClicked

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addtv;
    private javax.swing.JButton bt_changetv;
    private javax.swing.JButton bt_deletetv;
    private javax.swing.JButton bt_resettv;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_excel;
    private javax.swing.JLabel lb_findtv;
    private javax.swing.JLabel lb_hoten;
    private javax.swing.JLabel lb_khoa;
    private javax.swing.JLabel lb_mtv;
    private javax.swing.JLabel lb_nganh;
    private javax.swing.JLabel lb_sdt;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel pn_donv;
    private javax.swing.JPanel pn_findnv;
    private javax.swing.JPanel pn_ttnv;
    private javax.swing.JTable tb_tv;
    private javax.swing.JTextField txt_findtv;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_khoa;
    private javax.swing.JTextField txt_mtv;
    private javax.swing.JTextField txt_nganh;
    private javax.swing.JTextField txt_sdt;
    // End of variables declaration//GEN-END:variables
}
