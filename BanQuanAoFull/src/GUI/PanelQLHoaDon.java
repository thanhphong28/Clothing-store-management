
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

public class PanelQLHoaDon extends javax.swing.JPanel {

    public PanelQLHoaDon() {
        initComponents();
        panel_View.removeAll();
        pnhd.setBackground(new Color(138,200,229));
        pncthd.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelHoaDon());
        panel_View.validate();
        panel_View.repaint();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        pn_tieude = new javax.swing.JPanel();
        pnhd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pncthd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_View = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        pn_all.setBackground(new java.awt.Color(255, 255, 255));
        pn_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_tieude.setBackground(new java.awt.Color(138, 170, 229));

        pnhd.setBackground(new java.awt.Color(1, 50, 67));
        pnhd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnhdMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách hóa đơn");

        javax.swing.GroupLayout pnhdLayout = new javax.swing.GroupLayout(pnhd);
        pnhd.setLayout(pnhdLayout);
        pnhdLayout.setHorizontalGroup(
            pnhdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnhdLayout.setVerticalGroup(
            pnhdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pncthd.setBackground(new java.awt.Color(1, 50, 67));
        pncthd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pncthdMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách chi tiết hóa đơn");

        javax.swing.GroupLayout pncthdLayout = new javax.swing.GroupLayout(pncthd);
        pncthd.setLayout(pncthdLayout);
        pncthdLayout.setHorizontalGroup(
            pncthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pncthdLayout.setVerticalGroup(
            pncthdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_tieudeLayout = new javax.swing.GroupLayout(pn_tieude);
        pn_tieude.setLayout(pn_tieudeLayout);
        pn_tieudeLayout.setHorizontalGroup(
            pn_tieudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tieudeLayout.createSequentialGroup()
                .addComponent(pnhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pncthd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_tieudeLayout.setVerticalGroup(
            pn_tieudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnhd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_tieudeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pncthd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn_all.add(pn_tieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        panel_View.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_ViewLayout = new javax.swing.GroupLayout(panel_View);
        panel_View.setLayout(panel_ViewLayout);
        panel_ViewLayout.setHorizontalGroup(
            panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_ViewLayout.setVerticalGroup(
            panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        pn_all.add(panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1080, 580));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(138, 170, 229));
        jLabel3.setText("QUẢN LÝ HÓA ĐƠN");
        pn_all.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_all, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnhdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnhdMouseClicked
        panel_View.removeAll();
        pnhd.setBackground(new Color(138,200,229));
        pncthd.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelHoaDon());
        panel_View.validate();
        panel_View.repaint();
    }//GEN-LAST:event_pnhdMouseClicked

    private void pncthdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pncthdMouseClicked
        panel_View.removeAll();
        pncthd.setBackground(new Color(138,200,229));
        pnhd.setBackground(new Color(138,170,229));
        panel_View.setLayout(new BorderLayout());
        panel_View.add(new PanelChiTietHoaDon());
        panel_View.validate();
        panel_View.repaint();
    }//GEN-LAST:event_pncthdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_View;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_tieude;
    private javax.swing.JPanel pncthd;
    private javax.swing.JPanel pnhd;
    // End of variables declaration//GEN-END:variables
}
