 
package GUI;


import static GUI.PanelSanPham.data;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class PanelNcc extends javax.swing.JPanel {
    public static String manhaxuatban;
    DefaultTableModel model = new DefaultTableModel();
    
    public PanelNcc() {
        initComponents();
        initData();
       
        load();
        model = (DefaultTableModel) tb_ncc.getModel();
    }

    
    private void initData(){
        txt_ncc.setEnabled(false);
        txt_tenncc.setEnabled(false);
        txt_sdtncc.setEnabled(false);
        txt_dcncc.setEnabled(false);
        bt_choosencc.setVisible(false);
        bt_backncc.setVisible(false);
    }
   
    private void load(){
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        pn_ttncc = new javax.swing.JPanel();
        lb_ncc = new javax.swing.JLabel();
        txt_ncc = new javax.swing.JTextField();
        lb_tenncc = new javax.swing.JLabel();
        txt_tenncc = new javax.swing.JTextField();
        lb_dcncc = new javax.swing.JLabel();
        txt_dcncc = new javax.swing.JTextField();
        lb_sdtncc = new javax.swing.JLabel();
        txt_sdtncc = new javax.swing.JTextField();
        pn_doncc = new javax.swing.JPanel();
        bt_addncc = new javax.swing.JButton();
        bt_resetncc = new javax.swing.JButton();
        bt_choosencc = new javax.swing.JButton();
        bt_changencc = new javax.swing.JButton();
        pn_findncc = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_findncc = new javax.swing.JTextField();
        bt_findncc = new javax.swing.JButton();
        bt_backncc = new javax.swing.JButton();
        panel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ncc = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        pn_ttncc.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttncc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        lb_ncc.setText("Mã nhà cung cấp:");

        lb_tenncc.setText("Tên nhà cung cấp:");

        lb_dcncc.setText("Địa chỉ:");

        lb_sdtncc.setText("Số điện thoại:");

        javax.swing.GroupLayout pn_ttnccLayout = new javax.swing.GroupLayout(pn_ttncc);
        pn_ttncc.setLayout(pn_ttnccLayout);
        pn_ttnccLayout.setHorizontalGroup(
            pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ttnccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ttnccLayout.createSequentialGroup()
                        .addComponent(lb_ncc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_ttnccLayout.createSequentialGroup()
                        .addComponent(lb_tenncc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tenncc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_ttnccLayout.createSequentialGroup()
                        .addComponent(lb_sdtncc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_sdtncc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_ttnccLayout.createSequentialGroup()
                        .addComponent(lb_dcncc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dcncc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_ttnccLayout.setVerticalGroup(
            pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ttnccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ncc)
                    .addComponent(txt_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tenncc)
                    .addComponent(txt_tenncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sdtncc)
                    .addComponent(txt_sdtncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_ttnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dcncc)
                    .addComponent(txt_dcncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_doncc.setBackground(new java.awt.Color(255, 255, 204));
        pn_doncc.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));

        bt_addncc.setBackground(new java.awt.Color(204, 204, 204));
        bt_addncc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addncc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addncc.setText("Thêm");
        bt_addncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addnccActionPerformed(evt);
            }
        });

        bt_resetncc.setBackground(new java.awt.Color(204, 204, 204));
        bt_resetncc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resetncc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resetncc.setText("Reset");
        bt_resetncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetnccActionPerformed(evt);
            }
        });

        bt_choosencc.setBackground(new java.awt.Color(204, 204, 204));
        bt_choosencc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_choosencc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/choose.png"))); // NOI18N
        bt_choosencc.setText("Chọn");
        bt_choosencc.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_choosencc.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_choosencc.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_choosencc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_choosenccMouseClicked(evt);
            }
        });

        bt_changencc.setBackground(new java.awt.Color(204, 204, 204));
        bt_changencc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changencc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changencc.setText("Sửa");
        bt_changencc.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changencc.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changencc.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changencc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changenccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_donccLayout = new javax.swing.GroupLayout(pn_doncc);
        pn_doncc.setLayout(pn_donccLayout);
        pn_donccLayout.setHorizontalGroup(
            pn_donccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_donccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_donccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_donccLayout.createSequentialGroup()
                        .addGroup(pn_donccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_changencc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_addncc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_choosencc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_donccLayout.createSequentialGroup()
                        .addComponent(bt_resetncc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_donccLayout.setVerticalGroup(
            pn_donccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_donccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_donccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addncc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_choosencc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(bt_changencc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bt_resetncc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pn_findncc.setBackground(new java.awt.Color(204, 255, 204));
        pn_findncc.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà cung cấp", "Tên nhà cung cấp" }));

        bt_findncc.setBackground(new java.awt.Color(204, 204, 204));
        bt_findncc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_findncc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        bt_findncc.setText("Tìm kiếm");
        bt_findncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findnccActionPerformed(evt);
            }
        });

        bt_backncc.setBackground(new java.awt.Color(204, 204, 204));
        bt_backncc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_backncc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        bt_backncc.setText("Trở về");
        bt_backncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backnccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_findnccLayout = new javax.swing.GroupLayout(pn_findncc);
        pn_findncc.setLayout(pn_findnccLayout);
        pn_findnccLayout.setHorizontalGroup(
            pn_findnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_findnccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_findnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_findnccLayout.createSequentialGroup()
                        .addComponent(bt_findncc, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_backncc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_findnccLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_findncc)))
                .addContainerGap())
        );
        pn_findnccLayout.setVerticalGroup(
            pn_findnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_findnccLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_findnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_findncc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pn_findnccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_findncc, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(bt_backncc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tb_ncc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_ncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_nccMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_ncc);

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_ttncc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_doncc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_findncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(pn_ttncc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_findncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_doncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resetnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetnccActionPerformed
        txt_ncc.setText("");
        txt_tenncc.setText("");
        txt_sdtncc.setText("");
        txt_dcncc.setText("");        
    }//GEN-LAST:event_bt_resetnccActionPerformed

    private void bt_changenccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changenccActionPerformed
  
    }//GEN-LAST:event_bt_changenccActionPerformed

    private void bt_findnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_findnccActionPerformed
        
    }//GEN-LAST:event_bt_findnccActionPerformed

    private void bt_addnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addnccActionPerformed
   
    }//GEN-LAST:event_bt_addnccActionPerformed

    private void tb_nccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_nccMouseClicked
        int i = tb_ncc.getSelectedRow();
        if(i>=0){
            txt_ncc.setText(tb_ncc.getModel().getValueAt(i, 0).toString());
            txt_tenncc.setText(tb_ncc.getModel().getValueAt(i, 1).toString());
            txt_sdtncc.setText(tb_ncc.getModel().getValueAt(i, 2).toString());
            txt_dcncc.setText(tb_ncc.getModel().getValueAt(i, 3).toString());           
        }
    }//GEN-LAST:event_tb_nccMouseClicked

    private void bt_backnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backnccActionPerformed
      
        tb_ncc.setModel(model);
        bt_backncc.setVisible(false);
    }//GEN-LAST:event_bt_backnccActionPerformed

    private void bt_choosenccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_choosenccMouseClicked
        manhaxuatban = txt_ncc.getText();
        data[2] = manhaxuatban;
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new PanelSanPham(data));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_bt_choosenccMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addncc;
    private javax.swing.JButton bt_backncc;
    private javax.swing.JButton bt_changencc;
    private javax.swing.JButton bt_choosencc;
    private javax.swing.JButton bt_findncc;
    private javax.swing.JButton bt_resetncc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_dcncc;
    private javax.swing.JLabel lb_ncc;
    private javax.swing.JLabel lb_sdtncc;
    private javax.swing.JLabel lb_tenncc;
    private javax.swing.JPanel panel9;
    private javax.swing.JPanel pn_doncc;
    private javax.swing.JPanel pn_findncc;
    private javax.swing.JPanel pn_ttncc;
    private javax.swing.JTable tb_ncc;
    private javax.swing.JTextField txt_dcncc;
    private javax.swing.JTextField txt_findncc;
    private javax.swing.JTextField txt_ncc;
    private javax.swing.JTextField txt_sdtncc;
    private javax.swing.JTextField txt_tenncc;
    // End of variables declaration//GEN-END:variables
}
