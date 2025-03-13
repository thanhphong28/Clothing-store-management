
package DTO;


public class KhachHangDTO {
    private String maKH, hoKH, tenKH, diaChiKH;
    private String sodienthoai;
    public KhachHangDTO() {}
    public KhachHangDTO(String maKH, String hoKH, String tenKH, String diaChiKH,String sodienthoai) {
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.diaChiKH = diaChiKH;
        this.sodienthoai = sodienthoai;
}
public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoKH() {
        return hoKH;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }
    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }
}