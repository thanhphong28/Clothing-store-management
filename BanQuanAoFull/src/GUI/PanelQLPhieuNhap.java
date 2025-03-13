
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

public class PanelQLPhieuNhap extends javax.swing.JPanel {

    public PanelQLPhieuNhap() {
        initComponents();
        pnpn.setBackground(new Color(138,200,229));
        pnctpn.setBackground(new Color(138,170,229));        
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelPhieuNhap());
        panel_View.validate();
        panel_View.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_tieude = new javax.swing.JPanel();
        pnpn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnctpn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_View = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        pn_all.setBackground(new java.awt.Color(255, 255, 255));
        pn_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_tieude.setBackground(new java.awt.Color(0, 0, 0));
        pn_tieude.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnpn.setBackground(new java.awt.Color(1, 50, 67));
        pnpn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnpnMouseClicked(evt);
            }
        });
        pnpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(138, 170, 229));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách phiếu nhập");
        pnpn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        pn_tieude.add(pnpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        pnctpn.setBackground(new java.awt.Color(1, 50, 67));
        pnctpn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnctpnMouseClicked(evt);
            }
        });
        pnctpn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(138, 170, 229));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách chi tiết phiếu nhập");
        pnctpn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        pn_tieude.add(pnctpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        pn_all.add(pn_tieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 50));

        panel_View.setBackground(new java.awt.Color(255, 255, 255));
        panel_View.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_all.add(panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 1050, 580));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(138, 170, 229));
        jLabel3.setText("QUẢN LÝ PHIẾU NHẬP");
        pn_all.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 410, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnpnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnpnMouseClicked
        panel_View.removeAll();
        pnpn.setBackground(new Color(138,200,229));
        pnctpn.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelPhieuNhap());
        panel_View.validate();
        panel_View.repaint();
    }//GEN-LAST:event_pnpnMouseClicked

    private void pnctpnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnctpnMouseClicked
        panel_View.removeAll();
        pnctpn.setBackground(new Color(138,200,229));
        pnpn.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelChiTietPhieuNhap());
        panel_View.validate();
        panel_View.repaint();
    }//GEN-LAST:event_pnctpnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_View;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_tieude;
    private javax.swing.JPanel pnctpn;
    private javax.swing.JPanel pnpn;
    // End of variables declaration//GEN-END:variables
}
