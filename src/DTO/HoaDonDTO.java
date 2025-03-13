package DTO;

public class HoaDonDTO {
	private String MaHd, MaNv, MaKh, MaKm, NgayXuat;
	private double TongTien, TienGGHd, ThanhTienHd;
	public HoaDonDTO() {}
	public HoaDonDTO(String maHd, String maNv, String maKh, String maKm, String ngayXuat, double tongTien,
			double tienGGHd, double thanhTienHd) {
		this.MaHd = maHd;
		this.MaNv = maNv;
		this.MaKh = maKh;
		this.MaKm = maKm;
		this.NgayXuat = ngayXuat;
		this.TongTien = tongTien;
		this.TienGGHd = tienGGHd;
		this.ThanhTienHd = thanhTienHd;
	}
	public String getMaHd() {
		return MaHd;
	}
	public void setMaHd(String maHd) {
		MaHd = maHd;
	}
	public String getMaNv() {
		return MaNv;
	}
	public void setMaNv(String maNv) {
		MaNv = maNv;
	}
	public String getMaKh() {
		return MaKh;
	}
	public void setMaKh(String maKh) {
		MaKh = maKh;
	}
	public String getMaKm() {
		return MaKm;
	}
	public void setMaKm(String maKm) {
		MaKm = maKm;
	}
	public String getNgayXuat() {
		return NgayXuat;
	}
	public void setNgayXuat(String ngayXuat) {
		NgayXuat = ngayXuat;
	}
	public double getTongTien() {
		return TongTien;
	}
	public void setTongTien(double tongTien) {
		TongTien = tongTien;
	}
	public double getTienGGHd() {
		return TienGGHd;
	}
	public void setTienGGHd(double tienGGHd) {
		TienGGHd = tienGGHd;
	}
	public double getThanhTienHd() {
		return ThanhTienHd;
	}
	public void setThanhTienHd(double thanhTienHd) {
		ThanhTienHd = thanhTienHd;
	}
}