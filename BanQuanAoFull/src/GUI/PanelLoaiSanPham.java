
package GUI;


import static GUI.PanelSanPham.data;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class PanelLoaiSanPham extends javax.swing.JPanel {
    public static String maloai;
    DefaultTableModel model = new DefaultTableModel();
   
    public PanelLoaiSanPham() {
        initComponents();
        initData();
    
        model = (DefaultTableModel) tb_theloai.getModel();
        load();        
    }
   
    private void initData(){
        txt_tl.setEnabled(false);
        txt_tl.setEnabled(false);
        bt_choosetl.setVisible(false);
        bt_backl.setVisible(false);        
    }
   
    private void load(){
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        pn_ttl = new javax.swing.JPanel();
        lb_ml = new javax.swing.JLabel();
        txt_ml = new javax.swing.JTextField();
        lb_tl = new javax.swing.JLabel();
        txt_tl = new javax.swing.JTextField();
        pn_dol = new javax.swing.JPanel();
        bt_addl = new javax.swing.JButton();
        bt_resetl = new javax.swing.JButton();
        bt_choosetl = new javax.swing.JButton();
        bt_changel = new javax.swing.JButton();
        bt_backl = new javax.swing.JButton();
        pn_findl = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_findl = new javax.swing.JTextField();
        bt_findl = new javax.swing.JButton();
        panel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_theloai = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        pn_ttl.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loại sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        lb_ml.setText("Mã loại:");

        lb_tl.setText("Tên loại:");

        javax.swing.GroupLayout pn_ttlLayout = new javax.swing.GroupLayout(pn_ttl);
        pn_ttl.setLayout(pn_ttlLayout);
        pn_ttlLayout.setHorizontalGroup(
            pn_ttlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ttlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ttlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tl)
                    .addComponent(lb_ml))
                .addGap(18, 18, 18)
                .addGroup(pn_ttlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ml)
                    .addComponent(txt_tl))
                .addContainerGap())
        );
        pn_ttlLayout.setVerticalGroup(
            pn_ttlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ttlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ttlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ml)
                    .addComponent(txt_ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pn_ttlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_dol.setBackground(new java.awt.Color(255, 255, 204));
        pn_dol.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));

        bt_addl.setBackground(new java.awt.Color(204, 204, 204));
        bt_addl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addl.setText("Thêm");
        bt_addl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addlActionPerformed(evt);
            }
        });

        bt_resetl.setBackground(new java.awt.Color(204, 204, 204));
        bt_resetl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resetl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resetl.setText("Đặt lại");
        bt_resetl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetlActionPerformed(evt);
            }
        });

        bt_choosetl.setBackground(new java.awt.Color(204, 204, 204));
        bt_choosetl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_choosetl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/choose.png"))); // NOI18N
        bt_choosetl.setText("Chọn");
        bt_choosetl.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_choosetl.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_choosetl.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_choosetl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_choosetlMouseClicked(evt);
            }
        });

        bt_changel.setBackground(new java.awt.Color(204, 204, 204));
        bt_changel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changel.setText("Sửa");
        bt_changel.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changel.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changel.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changelActionPerformed(evt);
            }
        });

        bt_backl.setBackground(new java.awt.Color(204, 204, 204));
        bt_backl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_backl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        bt_backl.setText("Trở về");
        bt_backl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dolLayout = new javax.swing.GroupLayout(pn_dol);
        pn_dol.setLayout(pn_dolLayout);
        pn_dolLayout.setHorizontalGroup(
            pn_dolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_dolLayout.createSequentialGroup()
                        .addComponent(bt_addl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_resetl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_dolLayout.createSequentialGroup()
                        .addComponent(bt_choosetl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(bt_changel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_backl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        pn_dolLayout.setVerticalGroup(
            pn_dolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_resetl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(bt_backl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(pn_dolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_choosetl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_changel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pn_findl.setBackground(new java.awt.Color(204, 255, 204));
        pn_findl.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã loại", "Tên loại" }));

        bt_findl.setBackground(new java.awt.Color(204, 204, 204));
        bt_findl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_findl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        bt_findl.setText("Tìm kiếm");
        bt_findl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_findlLayout = new javax.swing.GroupLayout(pn_findl);
        pn_findl.setLayout(pn_findlLayout);
        pn_findlLayout.setHorizontalGroup(
            pn_findlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_findlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_findlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_findl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_findlLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_findl, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_findlLayout.setVerticalGroup(
            pn_findlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_findlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_findlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_findl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_findl, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        tb_theloai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_theloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_theloaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_theloai);

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_findl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_ttl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_dol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pn_ttl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_findl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_dol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resetlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetlActionPerformed
        txt_ml.setText("");
        txt_tl.setText("");
    }//GEN-LAST:event_bt_resetlActionPerformed

    private void bt_changelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changelActionPerformed
    
    }//GEN-LAST:event_bt_changelActionPerformed

    private void bt_findlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_findlActionPerformed
        
    }//GEN-LAST:event_bt_findlActionPerformed

    private void bt_addlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addlActionPerformed
    
    }//GEN-LAST:event_bt_addlActionPerformed

    private void bt_backlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backlActionPerformed
        
        tb_theloai.setModel(model);
        bt_backl.setVisible(false);
    }//GEN-LAST:event_bt_backlActionPerformed

    private void tb_theloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_theloaiMouseClicked
        
    }//GEN-LAST:event_tb_theloaiMouseClicked

    private void bt_choosetlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_choosetlMouseClicked
      
    }//GEN-LAST:event_bt_choosetlMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addl;
    private javax.swing.JButton bt_backl;
    private javax.swing.JButton bt_changel;
    private javax.swing.JButton bt_choosetl;
    private javax.swing.JButton bt_findl;
    private javax.swing.JButton bt_resetl;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_ml;
    private javax.swing.JLabel lb_tl;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel pn_dol;
    private javax.swing.JPanel pn_findl;
    private javax.swing.JPanel pn_ttl;
    private javax.swing.JTable tb_theloai;
    private javax.swing.JTextField txt_findl;
    private javax.swing.JTextField txt_ml;
    private javax.swing.JTextField txt_tl;
    // End of variables declaration//GEN-END:variables
}
