/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import DTO.KhuyenMaiDTO;
import DTO.SanPhamDTO;
/**
 *
 * @author PC
 */
public class CTKMDTO {
    private String MaKm;
    private Double PhanTramGGCT;
    private String MaHang;
    
    public CTKMDTO() {}

    public CTKMDTO(String MaKm, Double PhanTramGG, String MaHang) {
        this.MaKm = MaKm;
        this.PhanTramGGCT = PhanTramGGCT;
        this.MaHang = MaHang;
    }

    public String getMaKm() {
        return MaKm;
    }

    public void setMaKm(String MaKm) {
        this.MaKm = MaKm;
    }

    public Double getPhanTramGGCT() {
        return PhanTramGGCT;
    }

    public void setPhanTramGGCT(Double PhanTramGGCT) {
        this.PhanTramGGCT = PhanTramGGCT;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }
}
