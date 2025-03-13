
package GUI;

import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.KhuyenMaiBUS;
import BUS.NhanVienBUS;
import BUS.PhieuNhapBUS;

import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.KhuyenMaiDTO;
import DTO.NhanVienDTO;
import DTO.PhieuNhapDTO;

import DTO.SanPhamDTO;
import BUS.SanPhamBUS;
import java.util.ArrayList;

public class PanelTrangChu extends javax.swing.JPanel {

    public PanelTrangChu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_all = new javax.swing.JPanel();
        tittle = new javax.swing.JPanel();
        pn_show = new javax.swing.JPanel();
        pnlSoLuongphieunhap = new javax.swing.JPanel();
        lb_phieunhap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlSoLuongsanpham = new javax.swing.JPanel();
        lb_sanpham = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlSoLuongkhachhang = new javax.swing.JPanel();
        lb_khachhang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlSoLuongnhanvien = new javax.swing.JPanel();
        lb_nhanvien = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlSoLuonghoadon = new javax.swing.JPanel();
        lb_hoadon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlSoLuongkhuyenmai = new javax.swing.JPanel();
        lb_khuyenmai = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitleTC = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_all.setBackground(new java.awt.Color(255, 255, 255));
        pn_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittle.setBackground(new java.awt.Color(255, 255, 255));
        tittle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_all.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, -1, -1));

        pn_show.setBackground(new java.awt.Color(255, 255, 255));
        pn_show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSoLuongphieunhap.setBackground(new java.awt.Color(138, 170, 229));
        pnlSoLuongphieunhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSoLuongphieunhapMouseClicked(evt);
            }
        });
        pnlSoLuongphieunhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_phieunhap.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lb_phieunhap.setForeground(new java.awt.Color(255, 255, 255));
        lb_phieunhap.setText("Phiếu nhập");
        pnlSoLuongphieunhap.add(lb_phieunhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 122));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phieunhaptrangchu.png"))); // NOI18N
        pnlSoLuongphieunhap.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 70, 70));

        pn_show.add(pnlSoLuongphieunhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 300, 150));

        pnlSoLuongsanpham.setBackground(new java.awt.Color(138, 170, 229));
        pnlSoLuongsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSoLuongsanphamMouseClicked(evt);
            }
        });
        pnlSoLuongsanpham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_sanpham.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lb_sanpham.setForeground(new java.awt.Color(255, 255, 255));
        lb_sanpham.setText("Sản phẩm");
        pnlSoLuongsanpham.add(lb_sanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 141));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aotrangchu.png"))); // NOI18N
        pnlSoLuongsanpham.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 141));

        pn_show.add(pnlSoLuongsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 310, 150));

        pnlSoLuongkhachhang.setBackground(new java.awt.Color(138, 170, 229));
        pnlSoLuongkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSoLuongkhachhangMouseClicked(evt);
            }
        });
        pnlSoLuongkhachhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_khachhang.setBackground(new java.awt.Color(255, 255, 255));
        lb_khachhang.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lb_khachhang.setForeground(new java.awt.Color(255, 255, 255));
        lb_khachhang.setText("Khách hàng");
        pnlSoLuongkhachhang.add(lb_khachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 142));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khachhangtrangchu.png"))); // NOI18N
        pnlSoLuongkhachhang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 122));

        pn_show.add(pnlSoLuongkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 300, 150));

        pnlSoLuongnhanvien.setBackground(new java.awt.Color(138, 170, 229));
        pnlSoLuongnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSoLuongnhanvienMouseClicked(evt);
            }
        });
        pnlSoLuongnhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_nhanvien.setBackground(new java.awt.Color(255, 255, 255));
        lb_nhanvien.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lb_nhanvien.setForeground(new java.awt.Color(255, 255, 255));
        lb_nhanvien.setText("Nhân viên");
        pnlSoLuongnhanvien.add(lb_nhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 147));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhanvientrangchu.png"))); // NOI18N
        pnlSoLuongnhanvien.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 100, 153));

        pn_show.add(pnlSoLuongnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 310, 150));

        pnlSoLuonghoadon.setBackground(new java.awt.Color(138, 170, 229));
        pnlSoLuonghoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSoLuonghoadonMouseClicked(evt);
            }
        });
        pnlSoLuonghoadon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_hoadon.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lb_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        lb_hoadon.setText("Hóa đơn");
        pnlSoLuonghoadon.add(lb_hoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 166, 135));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hoadontrangchu.png"))); // NOI18N
        pnlSoLuonghoadon.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 141));

        pn_show.add(pnlSoLuonghoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 300, 150));

        pnlSoLuongkhuyenmai.setBackground(new java.awt.Color(138, 170, 229));
        pnlSoLuongkhuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSoLuongkhuyenmaiMouseClicked(evt);
            }
        });
        pnlSoLuongkhuyenmai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_khuyenmai.setBackground(new java.awt.Color(255, 255, 255));
        lb_khuyenmai.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lb_khuyenmai.setForeground(new java.awt.Color(255, 255, 255));
        lb_khuyenmai.setText("Khuyến mãi");
        pnlSoLuongkhuyenmai.add(lb_khuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 122));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khuyenmaitrangchu.png"))); // NOI18N
        pnlSoLuongkhuyenmai.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 142));

        pn_show.add(pnlSoLuongkhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 300, 150));

        pn_all.add(pn_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1070, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleTC.setBackground(new java.awt.Color(138, 170, 229));
        lblTitleTC.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblTitleTC.setForeground(new java.awt.Color(138, 170, 229));
        lblTitleTC.setText("Trang chủ (kiểm tra số lượng)");
        jPanel1.add(lblTitleTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, 780, 60));

        pn_all.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1070, 50));
        pn_all.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1070, 20));

        add(pn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlSoLuongsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSoLuongsanphamMouseClicked
        SanPhamBUS bussp = new SanPhamBUS();
        for(SanPhamDTO sp: bussp.docSp()){
        lb_sanpham.setText(bussp.docSp().size()+"");}
    }//GEN-LAST:event_pnlSoLuongsanphamMouseClicked

    private void pnlSoLuongphieunhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSoLuongphieunhapMouseClicked
        PhieuNhapBUS buspn = new PhieuNhapBUS();
        for(PhieuNhapDTO pn: buspn.docPn()){
        lb_phieunhap.setText(buspn.docPn().size()+"");}
    }//GEN-LAST:event_pnlSoLuongphieunhapMouseClicked

    private void pnlSoLuongkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSoLuongkhachhangMouseClicked
        KhachHangBUS buskh = new KhachHangBUS();
        for(KhachHangDTO kh: buskh.docKh()){
        lb_khachhang.setText(buskh.docKh().size()+"");}
    }//GEN-LAST:event_pnlSoLuongkhachhangMouseClicked

    private void pnlSoLuonghoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSoLuonghoadonMouseClicked
        HoaDonBUS bushd = new HoaDonBUS();
        for(HoaDonDTO hd: bushd.docHD()){
        lb_hoadon.setText(bushd.docHD().size()+"");  }
    }//GEN-LAST:event_pnlSoLuonghoadonMouseClicked

    private void pnlSoLuongkhuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSoLuongkhuyenmaiMouseClicked
        KhuyenMaiBUS buskm = new KhuyenMaiBUS();
        for(KhuyenMaiDTO km: buskm.docKm()){
        lb_khuyenmai.setText(buskm.docKm().size()+"");}
    }//GEN-LAST:event_pnlSoLuongkhuyenmaiMouseClicked

    private void pnlSoLuongnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSoLuongnhanvienMouseClicked
        NhanVienBUS busnv = new NhanVienBUS();
        for(NhanVienDTO nv: busnv.docNv()){
        lb_nhanvien.setText(busnv.docNv().size()+"");}
    }//GEN-LAST:event_pnlSoLuongnhanvienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_hoadon;
    private javax.swing.JLabel lb_khachhang;
    private javax.swing.JLabel lb_khuyenmai;
    private javax.swing.JLabel lb_nhanvien;
    private javax.swing.JLabel lb_phieunhap;
    private javax.swing.JLabel lb_sanpham;
    private javax.swing.JLabel lblTitleTC;
    private javax.swing.JPanel pn_all;
    private javax.swing.JPanel pn_show;
    private javax.swing.JPanel pnlSoLuonghoadon;
    private javax.swing.JPanel pnlSoLuongkhachhang;
    private javax.swing.JPanel pnlSoLuongkhuyenmai;
    private javax.swing.JPanel pnlSoLuongnhanvien;
    private javax.swing.JPanel pnlSoLuongphieunhap;
    private javax.swing.JPanel pnlSoLuongsanpham;
    private javax.swing.JPanel tittle;
    // End of variables declaration//GEN-END:variables
}
