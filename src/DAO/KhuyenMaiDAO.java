/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.KhuyenMaiDTO;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import untils.MyDataAccess;

/**
 *
 * @author PC
 */
public class KhuyenMaiDAO {

    MyDataAccess my = new MyDataAccess("localhost", "root", "", "ch_quanao");
    SimpleDateFormat formatofDate = new SimpleDateFormat("yyyy-MM-dd");

    public KhuyenMaiDAO() {
    }

    public ArrayList<KhuyenMaiDTO> docKM() throws Exception {
        ArrayList<KhuyenMaiDTO> danhsach = new ArrayList<KhuyenMaiDTO>();
        try {
            String qry = "SELECT * FROM khuyenmai";
            ResultSet rs1 = my.executeQuery(qry);
            while (rs1.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO();
                km.setMaKm(rs1.getString(1));
                km.setTenCT(rs1.getString(2));
                km.setLoaiCT(rs1.getString(3));

                km.setNgayBDKM(rs1.getDate(4));
                km.setNgayKTKM(rs1.getDate(5));
                km.setPhanTramGG((Double) rs1.getDouble(6));
                danhsach.add(km);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
        } finally {
            my.close();
        }
        return danhsach;
    }

    public boolean kiemtrahople(KhuyenMaiDTO km) {
        try {
            ArrayList<KhuyenMaiDTO> arr = docKM();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getMaKm().equals(km.getMaKm())) {
                    JOptionPane.showMessageDialog(null, "Mã khuyến mãi đã tồn tại");
                    return false;
                } else {
                    return true;
                }
            }
        } catch (Exception e) {
            return true;
        }
        return true;
    }

    public int themKm(KhuyenMaiDTO km) {
        if (kiemtrahople(km)) {
            int res = 0;
            try {
                String qry = "insert into khuyenmai values(";
                qry = qry + "'" + km.getMaKm() + "'";
                qry = qry + ",'" + km.getTenCT() + "'";
                qry = qry + ",'" + km.getLoaiCT() + "'";
                   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngayBDKMStr1 = dateFormat.format(km.getNgayBDKM());
            String ngayKTKMStr1 = dateFormat.format(km.getNgayKTKM());
                qry = qry + ",'" + ngayBDKMStr1 + "'";
                qry = qry + ",'" + ngayKTKMStr1+ "'";
                qry = qry + "," + km.getPhanTramGG() + ")";
                res = my.executeUpdate(qry);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi thêm Khyen mai vao Database");
            }
            return res;
        }
        return 0;
    }

    public int suaKM(KhuyenMaiDTO km) {
        int res = 0;
        try {
            String qry = "update khuyenmai set ";

            qry = qry + "TenCT='" + km.getTenCT() + "',";
            qry = qry + "LoaiCT='" + km.getLoaiCT() + "',";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngayBDKMStr = dateFormat.format(km.getNgayBDKM());
            String ngayKTKMStr = dateFormat.format(km.getNgayKTKM());
            qry = qry + "NgayBDKM='" + ngayBDKMStr + "',";
            qry = qry + "NgayKTKM='" + ngayKTKMStr + "',";
            qry = qry + "PhanTramGG=" + km.getPhanTramGG();
            qry = qry + " where MaKm ='" + km.getMaKm() + "'";
            res = my.executeUpdate(qry);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi sửa khuyến mãi Database");
        }
        return res;
        }

    public int xoaKm(String id) {
        int res = 0;
        try {
            String qry = "delete from khuyenmai where khuyenmai.MaKm = '" + id + "'";
            System.out.print(qry);
            res = my.executeUpdate(qry);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa khuyến mãi Database");
        }
        return res;
    }
}
