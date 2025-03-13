
package DTO;

public class SanPhamDTO {
    private String MaHang, MaNcc, MaLoai, TenLoai;
    
    private Double DonGia;
    private int SoLuong;
    public SanPhamDTO() {}

    public SanPhamDTO(String MaHang, String MaNcc, String MaLoai, String TenLoai, Double DonGia, int SoLuong) {
        this.MaHang = MaHang;
        this.MaNcc = MaNcc;
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getMaNcc() {
        return MaNcc;
    }

    public void setMaNcc(String MaNcc) {
        this.MaNcc = MaNcc;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
}

    