/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class NccDTO {
    private String MaNcc, TenNcc, sdt,dchi;
    public NccDTO(){}

    public NccDTO(String MaNcc, String TenNcc, String sdt, String dchi) {
        this.MaNcc = MaNcc;
        this.TenNcc = TenNcc;
        this.sdt = sdt;
        this.dchi = dchi;
    }

    public String getMaNcc() {
        return MaNcc;
    }

    public void setMaNcc(String MaNcc) {
        this.MaNcc = MaNcc;
    }

    public String getTenNcc() {
        return TenNcc;
    }

    public void setTenNcc(String TenNcc) {
        this.TenNcc = TenNcc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }
    
}
