
package GUI;


import java.awt.BorderLayout;
import java.awt.Color;

public class PanelQLKhuyenMai extends javax.swing.JPanel {

    public PanelQLKhuyenMai() {
        initComponents();
        panel_View.removeAll();
        pnkm.setBackground(new Color(138,200,229));
        pnctkm.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelKhuyenMai());
        panel_View.validate();
        panel_View.repaint();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_tieude = new javax.swing.JPanel();
        pnkm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnctkm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_View = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_all.setBackground(new java.awt.Color(255, 255, 255));
        pn_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_tieude.setBackground(new java.awt.Color(138, 170, 229));
        pn_tieude.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnkm.setBackground(new java.awt.Color(1, 50, 67));
        pnkm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnkmMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách khuyến mãi");

        javax.swing.GroupLayout pnkmLayout = new javax.swing.GroupLayout(pnkm);
        pnkm.setLayout(pnkmLayout);
        pnkmLayout.setHorizontalGroup(
            pnkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        pnkmLayout.setVerticalGroup(
            pnkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        pn_tieude.add(pnkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 37));

        pnctkm.setBackground(new java.awt.Color(1, 50, 67));
        pnctkm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnctkmMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách chi tiết khuyến mãi");

        javax.swing.GroupLayout pnctkmLayout = new javax.swing.GroupLayout(pnctkm);
        pnctkm.setLayout(pnctkmLayout);
        pnctkmLayout.setHorizontalGroup(
            pnctkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        pnctkmLayout.setVerticalGroup(
            pnctkmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        pn_tieude.add(pnctkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 0, -1, -1));

        pn_all.add(pn_tieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        panel_View.setBackground(new java.awt.Color(255, 255, 255));
        panel_View.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_all.add(panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 1060, 580));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(138, 170, 229));
        jLabel3.setText("QUẢN LÝ KHUYẾN MÃI");
        pn_all.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 400, 40));

        add(pn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pnkmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnkmMouseClicked
        panel_View.removeAll();
        pnkm.setBackground(new Color(138,200,229));
        pnctkm.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelKhuyenMai());
        panel_View.validate();
        panel_View.repaint();
    }//GEN-LAST:event_pnkmMouseClicked

    private void pnctkmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnctkmMouseClicked
        panel_View.removeAll();
        pnctkm.setBackground(new Color(138,200,229));
        pnkm.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelChiTietKhuyenMai());
        panel_View.validate();
        panel_View.repaint();
    }//GEN-LAST:event_pnctkmMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_View;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_tieude;
    private javax.swing.JPanel pnctkm;
    private javax.swing.JPanel pnkm;
    // End of variables declaration//GEN-END:variables
}
