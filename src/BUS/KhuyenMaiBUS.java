/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KhuyenMaiBUS {

    public static ArrayList<KhuyenMaiDTO> danhsach;

    public KhuyenMaiBUS() {
    }

    public static  ArrayList<KhuyenMaiDTO> docKm() {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        try {
            danhsach = new ArrayList<KhuyenMaiDTO>();
            danhsach = data.docKM();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhsach;
    }

    public int themKm(KhuyenMaiDTO km) {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        int check = data.themKm(km);
        if (check == 1) {
            danhsach.add(km);
        }
        return check;
    }

    public int suaKm(KhuyenMaiDTO km, int i) {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        int check = data.suaKM(km);
        if (check == 1) {
            danhsach.set(i, km);
        }
        return check;
    }

    public int xoaKm(String i) {
        KhuyenMaiDAO data = new KhuyenMaiDAO();
        int check = data.xoaKm(i);
        if (check == 1) {
            danhsach.remove(i);
        }
        return check;
    }

    public static ArrayList<KhuyenMaiDTO> timKiem(String thuocTinh, String tuKhoa) throws Exception {
      docKm();
        ArrayList<KhuyenMaiDTO> ketQua = new ArrayList<>();

        switch (thuocTinh) {
            case "Mã khuyến mãi":
                for (KhuyenMaiDTO km : danhsach) {
                    if (km.getMaKm().equalsIgnoreCase(tuKhoa)) {
                        ketQua.add(km);
                    }
                }
                break;
            case "Tên Chương Trình":
                for (KhuyenMaiDTO km : danhsach) {
                    if (km.getTenCT().equalsIgnoreCase(tuKhoa.toLowerCase())) {
                        ketQua.add(km);
                    }
                }
                break;
            case "Loại chương trình":
                for (KhuyenMaiDTO km : danhsach) {
                    if (km.getLoaiCT().equalsIgnoreCase(tuKhoa)) {
                        ketQua.add(km);
                    }
                }
                break;
            default:
                break;
        }

        return ketQua;
    }
public static List<KhuyenMaiDTO> timKiemTheoNgay(Date ngayBDKM, Date ngayKTKM) {
    docKm();
    List<KhuyenMaiDTO> searchResults1 = new ArrayList<>();
    for (KhuyenMaiDTO km : danhsach) {
        if (km.getNgayBDKM().compareTo(ngayBDKM) >= 0 && km.getNgayKTKM().compareTo(ngayKTKM) <= 0) {
            searchResults1.add(km);
        }
    }
    return searchResults1;
}

}
