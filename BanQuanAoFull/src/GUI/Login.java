
package GUI;

import BUS.LoginBUS;
import BUS.NhanVienBUS;
import DTO.LoginDTO;
import DTO.NhanVienDTO;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    LoginBUS buslg = new LoginBUS();
    public static String username;
    public static int check;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public boolean checklogin(){
        if(buslg.kiemtradangnhap(txt_TaiKhoan.getText(), txt_Pass.getText())){
                check=buslg.kiemtraquanly(txt_TaiKhoan.getText().trim());
                username = txt_TaiKhoan.getText();
                return true;}
            return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_TaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        txt_Pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(138, 170, 229));
        jLabel2.setText("Tài khoản:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 23));

        txt_TaiKhoan.setActionCommand("<Not Set>");
        txt_TaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TaiKhoanActionPerformed(evt);
            }
        });
        jPanel1.add(txt_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(138, 170, 229));
        jLabel3.setText("Mật khẩu:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 23));

        bt_login.setBackground(new java.awt.Color(138, 170, 229));
        bt_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("Đăng nhập");
        bt_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        jPanel1.add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 258, -1, 48));

        bt_exit.setBackground(new java.awt.Color(138, 170, 229));
        bt_exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_exit.setForeground(new java.awt.Color(255, 255, 255));
        bt_exit.setText("Thoát");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        jPanel1.add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 258, 99, 48));
        jPanel1.add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 190, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 170, 229));
        jLabel1.setText("Đăng Nhập");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 320, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(138, 170, 229));
        jLabel11.setText("Nếu quên mật khẩu vui lòng liên hệ admin !");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LoginShop.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(138, 170, 229));
        jLabel5.setText("Mật khẩu:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 23));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(138, 170, 229));
        jLabel6.setText("Mật khẩu:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        if(checklogin()==true){
            new Menu().setVisible(true);
            this.dispose();
        }else{
          if(txt_TaiKhoan.getText().trim().equals("")||txt_Pass.getText().trim().equals("")){
             JOptionPane.showMessageDialog(null, "Bạn bỏ trống tài khoản hoặc mật khẩu");                             
          }else {
             JOptionPane.showMessageDialog(null, "Nhập sai tài khoản hoặc mật khẩu");}            
        }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void txt_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TaiKhoanActionPerformed


    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
