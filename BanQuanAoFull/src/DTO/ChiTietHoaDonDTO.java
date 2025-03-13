package DTO;

public class ChiTietHoaDonDTO{
	private String MaHd, MaHang;
	private double DonGia, ThanhTien, TienGG;
	private int SoLuong;
	public String getMaHd() {
		return MaHd;
	}
	public void setMaHd(String maHd) {
		MaHd = maHd;
	}
	public String getMaHang() {
		return MaHang;
	}
	public void setMaHang(String maHang) {
		MaHang = maHang;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		DonGia = donGia;
	}
	public double getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(double thanhTien) {
		ThanhTien = thanhTien;
	}
	public double getTienGG() {
		return TienGG;
	}
	public void setTienGG(double tienGG) {
		TienGG = tienGG;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	
}