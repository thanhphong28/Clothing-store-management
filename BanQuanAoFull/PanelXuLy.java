
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

public class PanelXuLy extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
      
    public PanelXuLy() {
        initComponents();
        initData();
        initEvent();
        model = (DefaultTableModel) tb_xl.getModel();
    }
    private void initEvent() {
        
    }    
    private void initData(){
        txt_mxl.setEnabled(false);
        txt_st.setEnabled(false);
        txt_htxl.setEnabled(false);
        txt_mtv.setEnabled(false);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pn_ttxl = new javax.swing.JPanel();
        lb_mxl = new javax.swing.JLabel();
        txt_mxl = new javax.swing.JTextField();
        lb_nxl = new javax.swing.JLabel();
        lb_htxl = new javax.swing.JLabel();
        txt_htxl = new javax.swing.JTextField();
        lb_ttxl = new javax.swing.JLabel();
        lb_st = new javax.swing.JLabel();
        txt_st = new javax.swing.JTextField();
        lb_mtv = new javax.swing.JLabel();
        txt_mtv = new javax.swing.JTextField();
        pn_thxl = new javax.swing.JPanel();
        bt_addxl = new javax.swing.JButton();
        bt_resetxl = new javax.swing.JButton();
        bt_changexl = new javax.swing.JButton();
        bt_deletexl = new javax.swing.JButton();
        pn_findxl = new javax.swing.JPanel();
        txt_findxl = new javax.swing.JTextField();
        lb_findxl = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_xl = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_ttxl.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttxl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN XỬ LÝ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_ttxl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_mxl.setText("Mã xử lý :");
        pn_ttxl.add(lb_mxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        pn_ttxl.add(txt_mxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, -1));

        lb_nxl.setText("Ngày xử lý :");
        pn_ttxl.add(lb_nxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        lb_htxl.setText("Hình thức xử lý :");
        pn_ttxl.add(lb_htxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        pn_ttxl.add(txt_htxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 330, -1));

        lb_ttxl.setText("Trạng thái xử lý :");
        pn_ttxl.add(lb_ttxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        lb_st.setText("Số tiền :");
        pn_ttxl.add(lb_st, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));
        pn_ttxl.add(txt_st, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 130, -1));

        lb_mtv.setText("Mã thành viên :");
        pn_ttxl.add(lb_mtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        pn_ttxl.add(txt_mtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));

        jPanel2.add(pn_ttxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1020, 110));
        pn_ttxl.getAccessibleContext().setAccessibleDescription("THÔNG TIN THÀNH VIÊN");

        pn_thxl.setBackground(new java.awt.Color(255, 255, 255));
        pn_thxl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THỰC HIỆN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_thxl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_addxl.setBackground(new java.awt.Color(204, 204, 204));
        bt_addxl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addxl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addxl.setText("Thêm");
        bt_addxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addxlActionPerformed(evt);
            }
        });
        pn_thxl.add(bt_addxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 50));

        bt_resetxl.setBackground(new java.awt.Color(204, 204, 204));
        bt_resetxl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resetxl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resetxl.setText("Đặt lại");
        bt_resetxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetxlActionPerformed(evt);
            }
        });
        pn_thxl.add(bt_resetxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 120, 50));

        bt_changexl.setBackground(new java.awt.Color(204, 204, 204));
        bt_changexl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changexl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changexl.setText("Sửa");
        bt_changexl.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changexl.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changexl.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changexl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changexlActionPerformed(evt);
            }
        });
        pn_thxl.add(bt_changexl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 120, 50));

        bt_deletexl.setBackground(new java.awt.Color(204, 204, 204));
        bt_deletexl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_deletexl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        bt_deletexl.setText("Xóa");
        bt_deletexl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        pn_thxl.add(bt_deletexl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, 50));

        jPanel2.add(pn_thxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 670, 80));

        pn_findxl.setBackground(new java.awt.Color(255, 255, 255));
        pn_findxl.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        pn_findxl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_findxl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_findxlKeyReleased(evt);
            }
        });
        pn_findxl.add(txt_findxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 210, 40));

        lb_findxl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_findxl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        pn_findxl.add(lb_findxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        jPanel2.add(pn_findxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 340, 80));

        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_xl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_xl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_xlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_xl);

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

    private void bt_resetxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetxlActionPerformed
    }//GEN-LAST:event_bt_resetxlActionPerformed

    private void bt_changexlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changexlActionPerformed
    
    }//GEN-LAST:event_bt_changexlActionPerformed

    private void txt_findxlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_findxlKeyReleased
        String query = txt_findxl.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tb_xl.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_txt_findxlKeyReleased

    private void bt_addxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addxlActionPerformed
   
    }//GEN-LAST:event_bt_addxlActionPerformed

    private void tb_xlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_xlMouseClicked
       
    }//GEN-LAST:event_tb_xlMouseClicked

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addxl;
    private javax.swing.JButton bt_changexl;
    private javax.swing.JButton bt_deletexl;
    private javax.swing.JButton bt_resetxl;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_findxl;
    private javax.swing.JLabel lb_htxl;
    private javax.swing.JLabel lb_mtv;
    private javax.swing.JLabel lb_mxl;
    private javax.swing.JLabel lb_nxl;
    private javax.swing.JLabel lb_st;
    private javax.swing.JLabel lb_ttxl;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel pn_findxl;
    private javax.swing.JPanel pn_thxl;
    private javax.swing.JPanel pn_ttxl;
    private javax.swing.JTable tb_xl;
    private javax.swing.JTextField txt_findxl;
    private javax.swing.JTextField txt_htxl;
    private javax.swing.JTextField txt_mtv;
    private javax.swing.JTextField txt_mxl;
    private javax.swing.JTextField txt_st;
    // End of variables declaration//GEN-END:variables
}
