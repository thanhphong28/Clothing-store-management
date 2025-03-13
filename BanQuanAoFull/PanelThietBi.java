
package GUI;


import java.awt.BorderLayout;
import java.io.FileOutputStream;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Vector;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;


public class PanelThietBi extends javax.swing.JPanel {
    public static Object data[] = {"","",""};
    
    public static String tms,tncc,tml,tdg,tsl,ttl;
    DefaultTableModel model = new DefaultTableModel();
     
    public PanelThietBi(Object inMa[]){
        initComponents();
        initData();
        initEvent();
        model = (DefaultTableModel) tb_tb.getModel();
      

        
    }
    private void initEvent(){
    tb_tb.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            
        }
    });
    }
    




    public PanelThietBi() {
        initComponents();
        initData();

    }
    private void initData(){
   
        
    }   
    public void load(){
   
    }
    public void rs(){
      
        
    }
    public void bt(boolean a){

    }
 
 
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_ttsd = new javax.swing.JPanel();
        lb_mtt = new javax.swing.JLabel();
        txt_mtt = new javax.swing.JTextField();
        lb_mtv = new javax.swing.JLabel();
        txt_mtv = new javax.swing.JTextField();
        lb_tgt = new javax.swing.JLabel();
        lb_tgv = new javax.swing.JLabel();
        lb_tgm = new javax.swing.JLabel();
        pn_dos = new javax.swing.JPanel();
        bt_resets = new javax.swing.JButton();
        bt_changetb = new javax.swing.JButton();
        bt_deletetb = new javax.swing.JButton();
        bt_addtb = new javax.swing.JButton();
        pn_findtb = new javax.swing.JPanel();
        bt_findtb = new javax.swing.JTextField();
        lb_findsp = new javax.swing.JLabel();
        pn_tb = new javax.swing.JPanel();
        lb_mtb = new javax.swing.JLabel();
        txt_mtb = new javax.swing.JTextField();
        lb_ttb = new javax.swing.JLabel();
        txt_ttb = new javax.swing.JTextField();
        lb_mttb = new javax.swing.JLabel();
        txt_mttb = new javax.swing.JTextField();
        bt_addexcel = new javax.swing.JButton();
        panel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tb = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };

        setPreferredSize(new java.awt.Dimension(1000, 625));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_ttsd.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttsd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sử dụng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_ttsd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_mtt.setText("Mã thông tin :");
        pn_ttsd.add(lb_mtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txt_mtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mttActionPerformed(evt);
            }
        });
        pn_ttsd.add(txt_mtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        lb_mtv.setText("Mã thành viên :");
        pn_ttsd.add(lb_mtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        pn_ttsd.add(txt_mtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));

        lb_tgt.setText("Thời gian trả :");
        pn_ttsd.add(lb_tgt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        lb_tgv.setText("Thời gian vào :");
        pn_ttsd.add(lb_tgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        lb_tgm.setText("Thời gian mượn :");
        pn_ttsd.add(lb_tgm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jPanel1.add(pn_ttsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 560, 150));

        pn_dos.setBackground(new java.awt.Color(255, 255, 255));
        pn_dos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thực hiện", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_dos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_resets.setBackground(new java.awt.Color(204, 204, 204));
        bt_resets.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resets.setText("Reset");
        bt_resets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetsActionPerformed(evt);
            }
        });
        pn_dos.add(bt_resets, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 118, 45));

        bt_changetb.setBackground(new java.awt.Color(204, 204, 204));
        bt_changetb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changetb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changetb.setText("Sửa");
        bt_changetb.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changetb.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changetb.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changetbActionPerformed(evt);
            }
        });
        pn_dos.add(bt_changetb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 118, 44));

        bt_deletetb.setBackground(new java.awt.Color(204, 204, 204));
        bt_deletetb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_deletetb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        bt_deletetb.setText("Xóa");
        bt_deletetb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deletetbMouseClicked(evt);
            }
        });
        bt_deletetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deletetbActionPerformed(evt);
            }
        });
        pn_dos.add(bt_deletetb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 118, 45));

        bt_addtb.setBackground(new java.awt.Color(204, 204, 204));
        bt_addtb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addtb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addtb.setText("Thêm");
        bt_addtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addtbActionPerformed(evt);
            }
        });
        pn_dos.add(bt_addtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 118, 45));

        jPanel1.add(pn_dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 680, 90));

        pn_findtb.setBackground(new java.awt.Color(255, 255, 255));
        pn_findtb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_findtb.setForeground(new java.awt.Color(138, 170, 229));
        pn_findtb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_findtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findtbActionPerformed(evt);
            }
        });
        bt_findtb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bt_findtbKeyReleased(evt);
            }
        });
        pn_findtb.add(bt_findtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 40));

        lb_findsp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_findsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        pn_findtb.add(lb_findsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 51));

        jPanel1.add(pn_findtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 330, 90));

        pn_tb.setBackground(new java.awt.Color(255, 255, 255));
        pn_tb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thiết bị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(138, 170, 229))); // NOI18N
        pn_tb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_mtb.setText("Mã thiết bị :");
        pn_tb.add(lb_mtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        txt_mtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mtbActionPerformed(evt);
            }
        });
        pn_tb.add(txt_mtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 150, -1));

        lb_ttb.setText("Tên thiết bị :");
        pn_tb.add(lb_ttb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));
        pn_tb.add(txt_ttb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, -1));

        lb_mttb.setText("Mô tả :");
        pn_tb.add(lb_mttb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, -1));
        pn_tb.add(txt_mttb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, -1));

        bt_addexcel.setBackground(new java.awt.Color(204, 204, 204));
        bt_addexcel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addexcel.setText("Nhập excel");
        bt_addexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addexcelActionPerformed(evt);
            }
        });
        pn_tb.add(bt_addexcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 60, 140, 45));

        jPanel1.add(pn_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 450, 150));

        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tb);

        panel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 300));

        jPanel1.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1030, 300));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetsActionPerformed
      
    }//GEN-LAST:event_bt_resetsActionPerformed
    public void reset(){
 
            
    }
    private void bt_changetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changetbActionPerformed
  
    }//GEN-LAST:event_bt_changetbActionPerformed

    private void bt_addexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addexcelActionPerformed
  
    }//GEN-LAST:event_bt_addexcelActionPerformed

    private void txt_mttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mttActionPerformed

    private void bt_deletetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deletetbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_deletetbActionPerformed

    private void bt_findtbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_findtbKeyReleased
//    String query = txt_find.getText();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
//        tb_Sanpham.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(query)); 
    }//GEN-LAST:event_bt_findtbKeyReleased

    private void bt_deletetbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deletetbMouseClicked
  
    }//GEN-LAST:event_bt_deletetbMouseClicked

    private void bt_findtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_findtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_findtbActionPerformed

    private void txt_mtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mtbActionPerformed

    private void bt_addtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addtbActionPerformed

    private void tb_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tbMouseClicked

    }//GEN-LAST:event_tb_tbMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addexcel;
    private javax.swing.JButton bt_addtb;
    private javax.swing.JButton bt_changetb;
    private javax.swing.JButton bt_deletetb;
    private javax.swing.JTextField bt_findtb;
    private javax.swing.JButton bt_resets;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_findsp;
    private javax.swing.JLabel lb_mtb;
    private javax.swing.JLabel lb_mtt;
    private javax.swing.JLabel lb_mttb;
    private javax.swing.JLabel lb_mtv;
    private javax.swing.JLabel lb_tgm;
    private javax.swing.JLabel lb_tgt;
    private javax.swing.JLabel lb_tgv;
    private javax.swing.JLabel lb_ttb;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel pn_dos;
    private javax.swing.JPanel pn_findtb;
    private javax.swing.JPanel pn_tb;
    private javax.swing.JPanel pn_ttsd;
    private javax.swing.JTable tb_tb;
    public static javax.swing.JTextField txt_mtb;
    public static javax.swing.JTextField txt_mtt;
    public static javax.swing.JTextField txt_mttb;
    public static javax.swing.JTextField txt_mtv;
    public static javax.swing.JTextField txt_ttb;
    // End of variables declaration//GEN-END:variables


}
