/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CTKMDTO;
import DTO.KhuyenMaiDTO;
import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import untils.MyDataAccess;

/**
 *
 * @author PC
 */
public class CTKMDAO {

    MyDataAccess my = new MyDataAccess("localhost", "root", "", "ch_quanao");

    public CTKMDAO() {
    }

    ;
   public List<CTKMDTO> getCTKM() {
        ArrayList<CTKMDTO> listCTKM = new ArrayList<CTKMDTO>();
        try {

            String qry = "SELECT * FROM ctkm  "
                    
                   ;

            ResultSet rs1 = my.executeQuery(qry);

            while (rs1.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO();
                SanPhamDTO sp = new SanPhamDTO();
                CTKMDTO ctkm = new CTKMDTO();

                ctkm.setMaKm(rs1.getString(1));
                ctkm.setMaHang(rs1.getString(2));
                ctkm.setPhanTramGGCT(rs1.getDouble(3));

                listCTKM.add(ctkm);
            }

           
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCTKM;
    }

    public boolean kiemtrahople(CTKMDTO ctkm) {
        try {
            ArrayList<CTKMDTO> arr = (ArrayList<CTKMDTO>) getCTKM();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getMaKm().equals(ctkm.getMaKm())&& arr.get(i).getMaHang().equals(ctkm.getMaHang())) {
                    JOptionPane.showMessageDialog(null, "CT khuyến mãi đã tồn tại");
                    return false;
                } else {
                    return true;
                }
            }
        } catch (Exception e) {
            return true;
        }
        return true;
    } public int themKm(CTKMDTO ctkm) {
        if (kiemtrahople(ctkm)) {
            int res = 0;
            try {
                String qry = "insert into ctkm values(";
                qry = qry + "'" + ctkm.getMaKm() + "'";
                qry = qry + ",'" + ctkm.getMaHang() + "'";
                qry = qry + "," + ctkm.getPhanTramGGCT() + ")";
                res = my.executeUpdate(qry);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi thêm ct Khyen mai vao Database");
            }
            return res;
        }
        return 0;
    }public int suaKM(CTKMDTO ctkm) {
        int res = 0;
        try {
            String qry = "update ctkm set ";

            qry = qry + "MaKm='" + ctkm.getMaKm() + "',";
            qry = qry + "MaHang='" + ctkm.getMaHang() + "',";
            qry = qry + "PhanTramGGCT=" + ctkm.getPhanTramGGCT();
            qry = qry + " where MaKm ='" + ctkm.getMaKm() + "'";
            res = my.executeUpdate(qry);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi sửa khuyến mãi Database");
        }  

    return res;
    }
public int xoaCTKM( String id )
    {
        int res = 0;
        try{
            String qry = "delete from ctkm where ctkm.MaHang = '" + id+"'";
            System.out.print(qry);
            res = my.executeUpdate(qry);
        } catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "Lỗi xóa CTKM Database");
        }
        return res;
    }}
