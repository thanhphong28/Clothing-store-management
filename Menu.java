
package GUI;

import java.awt.BorderLayout;
import java.util.ArrayList;
import untils.CatchEvent;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        CatchEvent catchEvent = new CatchEvent(pn_view);
        ArrayList<Danhmuc> menu = new ArrayList<Danhmuc>();
        catchEvent.setMenu(menu); 
        pn_view.removeAll();        
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelThanhVien());
        pn_view.validate();
        pn_view.repaint();
    }

    public ArrayList<Danhmuc> initMenu(int n){
        ArrayList<Danhmuc> menu = new ArrayList<Danhmuc>();
        if (n==1){
        menu.add(new Danhmuc("book", pn_tb, lb_tb));
        menu.add(new Danhmuc("employees", pn_tv, lb_tv));
        menu.add(new Danhmuc("qlphieunhap", pn_vp, lb_vp));
        menu.add(new Danhmuc("thongke", pn_tk, lb_tk));}
        else{

        pn_tk.setVisible(false);
        pn_tv.setVisible(false);}
        return menu;
}    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        pn_inmenu = new javax.swing.JPanel();
        pn_tieude = new javax.swing.JPanel();
        pn_tb = new javax.swing.JPanel();
        lb_tb = new javax.swing.JLabel();
        lb_icontb = new javax.swing.JLabel();
        pn_vp = new javax.swing.JPanel();
        lb_vp = new javax.swing.JLabel();
        lb_iconvp = new javax.swing.JLabel();
        pn_tv = new javax.swing.JPanel();
        lb_tv = new javax.swing.JLabel();
        lb_icontv = new javax.swing.JLabel();
        pn_tk = new javax.swing.JPanel();
        lb_icontk = new javax.swing.JLabel();
        lb_tk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_view = new javax.swing.JPanel();
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

        pn_tb.setBackground(new java.awt.Color(138, 170, 229));
        pn_tb.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_tbMouseClicked(evt);
            }
        });
        pn_tb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_tb.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_tb.setForeground(new java.awt.Color(255, 255, 255));
        lb_tb.setText("QUẢN LÝ THIẾT BỊ");
        pn_tb.add(lb_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 48));

        lb_icontb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_icontb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/book.png"))); // NOI18N
        pn_tb.add(lb_icontb, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 280, 70));

        pn_vp.setBackground(new java.awt.Color(138, 170, 229));
        pn_vp.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_vp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_vpMouseClicked(evt);
            }
        });
        pn_vp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_vp.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_vp.setForeground(new java.awt.Color(255, 255, 255));
        lb_vp.setText("XỬ LÝ VI PHẠM");
        pn_vp.add(lb_vp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 196, 60));

        lb_iconvp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iconvp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pnhap.png"))); // NOI18N
        pn_vp.add(lb_iconvp, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        pn_inmenu.add(pn_vp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 70));

        pn_tv.setBackground(new java.awt.Color(138, 170, 229));
        pn_tv.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_tv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_tvMouseClicked(evt);
            }
        });
        pn_tv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_tv.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_tv.setForeground(new java.awt.Color(255, 255, 255));
        lb_tv.setText("QUẢN LÝ THÀNH VIÊN");
        pn_tv.add(lb_tv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 60));

        lb_icontv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_icontv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee.png"))); // NOI18N
        pn_tv.add(lb_icontv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 65, -1));

        pn_inmenu.add(pn_tv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 70));

        pn_tk.setBackground(new java.awt.Color(138, 170, 229));
        pn_tk.setPreferredSize(new java.awt.Dimension(246, 60));
        pn_tk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_tkMouseClicked(evt);
            }
        });
        pn_tk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_icontk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_icontk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/author.png"))); // NOI18N
        pn_tk.add(lb_icontk, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 65, -1));

        lb_tk.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lb_tk.setForeground(new java.awt.Color(255, 255, 255));
        lb_tk.setText("THỐNG KÊ");
        pn_tk.add(lb_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 48));

        pn_inmenu.add(pn_tk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 280, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/UNDERDAWGlogo.png"))); // NOI18N
        pn_inmenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 220));

        pn_menu.add(pn_inmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        pn_all.add(pn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pn_view.setBackground(new java.awt.Color(255, 255, 255));
        pn_view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_all.add(pn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 1060, 590));

        lb_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit1.png"))); // NOI18N
        lb_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitMouseClicked(evt);
            }
        });
        pn_all.add(lb_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 30));

        getContentPane().add(pn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 640));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_exitMouseClicked

    private void pn_tvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_tvMouseClicked
        // TODO add your handling code here:
        pn_view.removeAll();
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelThanhVien());
        pn_view.validate();
        pn_view.repaint();
    }//GEN-LAST:event_pn_tvMouseClicked

    private void pn_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_tbMouseClicked
        // TODO add your handling code here:
        pn_view.removeAll();
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelThietBi());
        pn_view.validate();
        pn_view.repaint();
    }//GEN-LAST:event_pn_tbMouseClicked

    private void pn_vpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_vpMouseClicked
        // TODO add your handling code here:
        pn_view.removeAll();
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelXuLy());
        pn_view.validate();
        pn_view.repaint();
    }//GEN-LAST:event_pn_vpMouseClicked

    private void pn_tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_tkMouseClicked
        // TODO add your handling code here:
        pn_view.removeAll();
        pn_view.setLayout(new BorderLayout());
        pn_view.add(new PanelThongKe());
        pn_view.validate();
        pn_view.repaint();
    }//GEN-LAST:event_pn_tkMouseClicked


    public static void main(String args[]) {
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JLabel lb_icontb;
    private javax.swing.JLabel lb_icontk;
    private javax.swing.JLabel lb_icontv;
    private javax.swing.JLabel lb_iconvp;
    private javax.swing.JLabel lb_tb;
    private javax.swing.JLabel lb_tk;
    private javax.swing.JLabel lb_tv;
    private javax.swing.JLabel lb_vp;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_inmenu;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_tb;
    private javax.swing.JPanel pn_tieude;
    private javax.swing.JPanel pn_tk;
    private javax.swing.JPanel pn_tv;
    private javax.swing.JPanel pn_view;
    private javax.swing.JPanel pn_vp;
    // End of variables declaration//GEN-END:variables
}
