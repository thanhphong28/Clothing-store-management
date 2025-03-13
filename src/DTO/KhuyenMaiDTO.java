/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KhuyenMaiDTO {

    String MaKm;
 private String TenCT,LoaiCT;
         private Date NgayKTKM,NgayBDKM ;
         private Double PhanTramGG  ;
         SimpleDateFormat formatofDate = new SimpleDateFormat("yyyy-MM-dd");
 public KhuyenMaiDTO(){}
  public KhuyenMaiDTO(String MaKm,String LoaiCT,String TenCT,Date NgayBDKM,Date NgayKTKM,Double PhanTramGG){
this.MaKm=MaKm;
this.LoaiCT=LoaiCT;
this.TenCT=TenCT;
this.NgayBDKM=NgayBDKM;
this.NgayKTKM=NgayKTKM;
this.PhanTramGG=PhanTramGG;


}

    public String getMaKm() {
        return MaKm;
    }

    public void setMaKm(String MaKm) {
        this.MaKm = MaKm;
    }

    public String getTenCT() {
        return TenCT;
    }

    public void setTenCT(String TenCT) {
        this.TenCT = TenCT;
    }

    public String getLoaiCT() {
        return LoaiCT;
    }

    public void setLoaiCT(String LoaiCT) {
        this.LoaiCT = LoaiCT;
    }

    public Date getNgayKTKM() {
        return (NgayKTKM);
    }

    public void setNgayKTKM(Date NgayKTKM) {
        this.NgayKTKM = NgayKTKM;
    }

    public Date getNgayBDKM() {
        return (NgayBDKM);
    }

    public void setNgayBDKM(Date NgayBDKM) {
        this.NgayBDKM = NgayBDKM;
    }

 

    public Double getPhanTramGG() {
        return PhanTramGG;
    }

    public void setPhanTramGG(Double PhanTramGG) {
        this.PhanTramGG = PhanTramGG;
    }
 
}
