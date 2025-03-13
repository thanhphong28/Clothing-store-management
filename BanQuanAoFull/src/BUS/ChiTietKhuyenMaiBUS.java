/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTKMDAO;
import DTO.CTKMDTO;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChiTietKhuyenMaiBUS {

    public static ArrayList<CTKMDTO> CTKM;

    public ChiTietKhuyenMaiBUS() {
    }

    public static ArrayList<CTKMDTO> getCTKM() {
        CTKMDAO data = new CTKMDAO();
        try {
            CTKM = new ArrayList<CTKMDTO>();
            CTKM = (ArrayList<CTKMDTO>) data.getCTKM();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CTKM;
    }

    public int themKm(CTKMDTO ctkm) {
        CTKMDAO data = new CTKMDAO();
        int check = data.themKm(ctkm);
        if (check == 1) {
            CTKM.add(ctkm);
        }
        return check;
    }

    public int suaKm(CTKMDTO ctkm, int i) {
        CTKMDAO data = new CTKMDAO();
        int check = data.suaKM(ctkm);
        if (check == 1) {
            CTKM.set(i, ctkm);
        }
        return check;
    }
public static ArrayList<CTKMDTO> timKiem(String thuocTinh, String tuKhoa) throws Exception {
      getCTKM();
        ArrayList<CTKMDTO> ketQua = new ArrayList<>();

        switch (thuocTinh) {
            case "Mã khuyến mãi":
                for (CTKMDTO ctkm : CTKM) {
                    if (ctkm.getMaKm().equalsIgnoreCase(tuKhoa)) {
                        ketQua.add(ctkm);
                    }
                }
                break;
            case "Mã hàng":
                for (CTKMDTO ctkm : CTKM) {
                    if (ctkm.getMaHang().equalsIgnoreCase(tuKhoa)) {
                        ketQua.add(ctkm);
                    }
                }
                break;
    
            default:
               
        }

        return ketQua;
    }
 public static int xoaCTKM( String i)
    {
        CTKMDAO data = new CTKMDAO();
        int check = data.xoaCTKM( i);
        if (check == 1)
        {
            CTKM.remove(i);
        }
        return check;
    }

}
