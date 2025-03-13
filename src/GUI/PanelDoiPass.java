
package GUI;

import BUS.LoginBUS;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PanelDoiPass extends javax.swing.JPanel {
    
        LoginBUS bus = new LoginBUS();
        String username = Login.username;
        
    public PanelDoiPass() {
        initComponents();
    }
    
    public boolean kiemtratrung(String pass1, String pass2)
    {
        return pass1.equals(pass2);
    }
    public boolean kiemtramkc(String username, String pass) throws Exception
    {
        return bus.kiemTraMK(username, pass);
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelforall = new javax.swing.JPanel();
        tittle2 = new javax.swing.JPanel();
        lblTitleTC2 = new javax.swing.JLabel();
        pn_show1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pn_do = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_mkc = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_mkm = new javax.swing.JPasswordField();
        txt_xn = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btn_xn = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        pn_end = new javax.swing.JPanel();

        panelforall.setBackground(new java.awt.Color(238, 241, 245));

        tittle2.setBackground(new java.awt.Color(238, 241, 245));

        lblTitleTC2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblTitleTC2.setForeground(new java.awt.Color(138, 170, 229));
        lblTitleTC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleTC2.setText("Cài đặt tài khoản");

        javax.swing.GroupLayout tittle2Layout = new javax.swing.GroupLayout(tittle2);
        tittle2.setLayout(tittle2Layout);
        tittle2Layout.setHorizontalGroup(
            tittle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tittle2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitleTC2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tittle2Layout.setVerticalGroup(
            tittle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tittle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleTC2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_do.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(138, 170, 229));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 170, 229));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi mật khẩu");
        pn_do.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 950, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(138, 170, 229));
        jLabel2.setText("Mật khẩu cũ:");
        pn_do.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 105, 121, 36));

        txt_mkc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pn_do.add(txt_mkc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 340, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(138, 170, 229));
        jLabel3.setText("Mật khẩu mới:");
        pn_do.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 182, -1, 36));

        txt_mkm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pn_do.add(txt_mkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 340, 36));

        txt_xn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pn_do.add(txt_xn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 340, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(138, 170, 229));
        jLabel4.setText("Nhập lại:");
        pn_do.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 259, 121, 48));

        btn_xn.setBackground(new java.awt.Color(138, 170, 229));
        btn_xn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_xn.setForeground(new java.awt.Color(255, 255, 255));
        btn_xn.setText("Xác nhận");
        btn_xn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xnMouseClicked(evt);
            }
        });
        pn_do.add(btn_xn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 130, 50));

        btn_huy.setBackground(new java.awt.Color(138, 170, 229));
        btn_huy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_huy.setForeground(new java.awt.Color(255, 255, 255));
        btn_huy.setText("Hủy");
        btn_huy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_huyMouseClicked(evt);
            }
        });
        pn_do.add(btn_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 130, 51));

        pn_end.setBackground(new java.awt.Color(138, 170, 229));

        javax.swing.GroupLayout pn_endLayout = new javax.swing.GroupLayout(pn_end);
        pn_end.setLayout(pn_endLayout);
        pn_endLayout.setHorizontalGroup(
            pn_endLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_endLayout.setVerticalGroup(
            pn_endLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_show1Layout = new javax.swing.GroupLayout(pn_show1);
        pn_show1.setLayout(pn_show1Layout);
        pn_show1Layout.setHorizontalGroup(
            pn_show1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(pn_end, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pn_do, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_show1Layout.setVerticalGroup(
            pn_show1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_show1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_do, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pn_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelforallLayout = new javax.swing.GroupLayout(panelforall);
        panelforall.setLayout(panelforallLayout);
        panelforallLayout.setHorizontalGroup(
            panelforallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_show1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tittle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelforallLayout.setVerticalGroup(
            panelforallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelforallLayout.createSequentialGroup()
                .addComponent(tittle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_show1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelforall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelforall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xnMouseClicked
        if (!txt_mkc.equals("") && !txt_mkm.equals("") && !txt_xn.equals(""))
        {
            try {
                if (kiemtramkc(username, txt_mkc.getText()))
                {
                    if (kiemtratrung(txt_mkm.getText(), txt_xn.getText()))
                    {
                        bus.doiMK(username, txt_mkm.getText());
                        panelforall.removeAll();
                        panelforall.setLayout(new BorderLayout());
                        panelforall.add(new PanelTrangChu());
                        panelforall.validate();
                        panelforall.repaint();
                        JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");                        
                    } else JOptionPane.showMessageDialog(null, "Mật khẩu mới và nhập lại chưa trùng khớp");
                } else JOptionPane.showMessageDialog(null, "Nhập sai mật khẩu cũ");
            } catch (Exception ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");

    }//GEN-LAST:event_btn_xnMouseClicked

    private void btn_huyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_huyMouseClicked
        int i = JOptionPane.showConfirmDialog(null, "Xác nhận", "Xác nhận thoát?", JOptionPane.YES_NO_OPTION);
        if (i==0) new Menu().setVisible(true);
    }//GEN-LAST:event_btn_huyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_xn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblTitleTC2;
    private javax.swing.JPanel panelforall;
    private javax.swing.JPanel pn_do;
    private javax.swing.JPanel pn_end;
    private javax.swing.JPanel pn_show1;
    private javax.swing.JPanel tittle2;
    private javax.swing.JPasswordField txt_mkc;
    private javax.swing.JPasswordField txt_mkm;
    private javax.swing.JPasswordField txt_xn;
    // End of variables declaration//GEN-END:variables
}
