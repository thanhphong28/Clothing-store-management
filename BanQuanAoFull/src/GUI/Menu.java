    
package GUI;

import java.awt.BorderLayout;
import java.util.ArrayList;
import untils.CatchEvent;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        int check = Login.check;
        this.setLocationRelativeTo(null);
        CatchEvent catchEvent = new CatchEvent(pn_view);
        ArrayList<Danhmuc> menu = new ArrayList<Danhmuc>();
        menu = initMenu(check);
        catchEvent.setMenu(menu); 
        lbl_chao.setText("Xin chào "+Login.username);
        pn_view.removeAll();        
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelTrangChu());
        pn_view.validate();
        pn_view.repaint();
    }

    public ArrayList<Danhmuc> initMenu(int n){
        ArrayList<Danhmuc> menu = new ArrayList<Danhmuc>();
        if (n==1){
        menu.add(new Danhmuc("trangchu", pn_trangchu, lb_trangchu));            
        menu.add(new Danhmuc("book", pn_book, lb_book));
        menu.add(new Danhmuc("employees", pn_nv, lb_nv));
        menu.add(new Danhmuc("member", pn_kh, lb_kh));
        menu.add(new Danhmuc("qlphieunhap", pn_pn, lb_pn));
        menu.add(new Danhmuc("bill", pn_hd, lb_hd));
        menu.add(new Danhmuc("khuyenmai", pn_km, lb_km));  
        menu.add(new Danhmuc("thongke", pn_tk, lb_tk));}
        else{
        menu.add(new Danhmuc("trangchu", pn_trangchu, lb_trangchu));             
        menu.add(new Danhmuc("book", pn_book, lb_book));
        menu.add(new Danhmuc("member", pn_kh, lb_kh));
        menu.add(new Danhmuc("qlphieunhap", pn_pn, lb_pn));
        menu.add(new Danhmuc("bill", pn_hd, lb_hd));
        menu.add(new Danhmuc("khuyenmai", pn_km, lb_km));  
        pn_tk.setVisible(false);
        pn_nv.setVisible(false);}
        return menu;
}    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        pn_inmenu = new javax.swing.JPanel();
        pn_tieude = new javax.swing.JPanel();
        pn_trangchu = new javax.swing.JPanel();
        lb_trangchu = new javax.swing.JLabel();
        lb_3 = new javax.swing.JLabel();
        pn_book = new javax.swing.JPanel();
        lb_book = new javax.swing.JLabel();
        lb_2 = new javax.swing.JLabel();
        pn_kh = new javax.swing.JPanel();
        lb_kh = new javax.swing.JLabel();
        lb_6 = new javax.swing.JLabel();
        pn_pn = new javax.swing.JPanel();
        lb_pn = new javax.swing.JLabel();
        lb_12 = new javax.swing.JLabel();
        pn_hd = new javax.swing.JPanel();
        lb_hd = new javax.swing.JLabel();
        lb_14 = new javax.swing.JLabel();
        pn_km = new javax.swing.JPanel();
        lb_km = new javax.swing.JLabel();
        lb_15 = new javax.swing.JLabel();
        pn_nv = new javax.swing.JPanel();
        lb_nv = new javax.swing.JLabel();
        lb_4 = new javax.swing.JLabel();
        pn_tk = new javax.swing.JPanel();
        lb_8 = new javax.swing.JLabel();
        lb_tk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_view = new javax.swing.JPanel();
        lbl_chao = new javax.swing.JLabel();
        btn_doiMK = new javax.swing.JButton();
        lb_exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_all.setBackground(new java.awt.Color(255, 255, 255));
        pn_all.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        pn_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_inmenu.setBackground(new java.awt.Color(138, 170, 229));
        pn_inmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_tieude.setBackground(new java.awt.Color(1, 50, 67));
        pn_tieude.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_inmenu.add(pn_tieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 50));

        pn_trangchu.setBackground(new java.awt.Color(138, 170, 229));
        pn_trangchu.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_trangchu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_trangchu.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_trangchu.setForeground(new java.awt.Color(255, 255, 255));
        lb_trangchu.setText("Trang chủ");
        pn_trangchu.add(lb_trangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        lb_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trangchu.png"))); // NOI18N
        pn_trangchu.add(lb_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, 60));

        pn_inmenu.add(pn_trangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 70));

        pn_book.setBackground(new java.awt.Color(138, 170, 229));
        pn_book.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_book.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_book.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_book.setForeground(new java.awt.Color(255, 255, 255));
        lb_book.setText("Quản lý hàng");
        pn_book.add(lb_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 48));

        lb_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/book.png"))); // NOI18N
        pn_book.add(lb_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 70));

        pn_kh.setBackground(new java.awt.Color(138, 170, 229));
        pn_kh.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_kh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_kh.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_kh.setForeground(new java.awt.Color(255, 255, 255));
        lb_kh.setText("Quản lý khách hàng");
        pn_kh.add(lb_kh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 170, 60));

        lb_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer.png"))); // NOI18N
        pn_kh.add(lb_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_kh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 70));

        pn_pn.setBackground(new java.awt.Color(138, 170, 229));
        pn_pn.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_pn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_pn.setForeground(new java.awt.Color(255, 255, 255));
        lb_pn.setText("Quản lý phiếu nhập");
        pn_pn.add(lb_pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 196, 60));

        lb_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pnhap.png"))); // NOI18N
        pn_pn.add(lb_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, 70));

        pn_hd.setBackground(new java.awt.Color(138, 170, 229));
        pn_hd.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_hd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_hd.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_hd.setForeground(new java.awt.Color(255, 255, 255));
        lb_hd.setText("Quản lý hóa đơn");
        pn_hd.add(lb_hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 60));

        lb_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.png"))); // NOI18N
        pn_hd.add(lb_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 280, 70));

        pn_km.setBackground(new java.awt.Color(138, 170, 229));
        pn_km.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_km.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_km.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_km.setForeground(new java.awt.Color(255, 255, 255));
        lb_km.setText("Khuyến mãi");
        pn_km.add(lb_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 170, 60));

        lb_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/promote.png"))); // NOI18N
        pn_km.add(lb_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 0, 60, -1));

        pn_inmenu.add(pn_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 60));

        pn_nv.setBackground(new java.awt.Color(138, 170, 229));
        pn_nv.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_nv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_nv.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_nv.setForeground(new java.awt.Color(255, 255, 255));
        lb_nv.setText("Quản lý nhân viên");
        pn_nv.add(lb_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 60));

        lb_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee.png"))); // NOI18N
        pn_nv.add(lb_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 280, 60));

        pn_tk.setBackground(new java.awt.Color(138, 170, 229));
        pn_tk.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_tk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/author.png"))); // NOI18N
        pn_tk.add(lb_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        lb_tk.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_tk.setForeground(new java.awt.Color(255, 255, 255));
        lb_tk.setText("Thống kê");
        pn_tk.add(lb_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 48));

        pn_inmenu.add(pn_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 280, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/UNDERDAWGlogo.png"))); // NOI18N
        pn_inmenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 120));

        pn_menu.add(pn_inmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        pn_all.add(pn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pn_view.setBackground(new java.awt.Color(255, 255, 255));
        pn_view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_all.add(pn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 1070, 600));

        lbl_chao.setBackground(new java.awt.Color(138, 170, 229));
        lbl_chao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_chao.setForeground(new java.awt.Color(138, 170, 229));
        lbl_chao.setText("Xin chào");
        pn_all.add(lbl_chao, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 240, 60));

        btn_doiMK.setBackground(new java.awt.Color(138, 170, 229));
        btn_doiMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_doiMK.setForeground(new java.awt.Color(255, 255, 255));
        btn_doiMK.setText("Đổi mật khẩu");
        btn_doiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_doiMKMouseClicked(evt);
            }
        });
        pn_all.add(btn_doiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 130, 40));

        lb_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit1.png"))); // NOI18N
        lb_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitMouseClicked(evt);
            }
        });
        pn_all.add(lb_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 30));

        getContentPane().add(pn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_exitMouseClicked

    private void btn_doiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_doiMKMouseClicked
        pn_view.removeAll();
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelDoiPass());
        pn_view.validate();
        pn_view.repaint();
    }//GEN-LAST:event_btn_doiMKMouseClicked


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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_doiMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_12;
    private javax.swing.JLabel lb_14;
    private javax.swing.JLabel lb_15;
    private javax.swing.JLabel lb_2;
    private javax.swing.JLabel lb_3;
    private javax.swing.JLabel lb_4;
    private javax.swing.JLabel lb_6;
    private javax.swing.JLabel lb_8;
    private javax.swing.JLabel lb_book;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JLabel lb_hd;
    private javax.swing.JLabel lb_kh;
    private javax.swing.JLabel lb_km;
    private javax.swing.JLabel lb_nv;
    private javax.swing.JLabel lb_pn;
    private javax.swing.JLabel lb_tk;
    private javax.swing.JLabel lb_trangchu;
    private javax.swing.JLabel lbl_chao;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_book;
    private javax.swing.JPanel pn_hd;
    private javax.swing.JPanel pn_inmenu;
    private javax.swing.JPanel pn_kh;
    private javax.swing.JPanel pn_km;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_nv;
    private javax.swing.JPanel pn_pn;
    private javax.swing.JPanel pn_tieude;
    private javax.swing.JPanel pn_tk;
    private javax.swing.JPanel pn_trangchu;
    private javax.swing.JPanel pn_view;
    // End of variables declaration//GEN-END:variables
}
