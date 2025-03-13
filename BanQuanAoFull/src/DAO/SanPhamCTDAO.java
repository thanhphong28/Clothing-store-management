
package DAO;

import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import untils.MyDataAccess;

public class SanPhamCTDAO {
    MyDataAccess my = new MyDataAccess("localhost","root","","ch_quanao");
    public SanPhamCTDAO(){}
    public ArrayList<SanPhamDTO> docsachforCT() throws Exception{
        ArrayList<SanPhamDTO> list1 = new ArrayList<SanPhamDTO>();
        try {
            String qry = "select * from mathang order by substr(MaHang,5,6)*1 ";
            ResultSet rs = my.executeQuery(qry);
            while (rs.next()){
                SanPhamDTO mathang = new SanPhamDTO();
                mathang.setMaHang(rs.getString("MaHang"));
                mathang.setTenLoai(rs.getString("TenLoai"));
                mathang.setDonGia(rs.getDouble("DonGia"));
                mathang.setSoLuong(rs.getInt("SoLuong"));
                list1.add(mathang);}
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi đọc DataBase của sách từ chi tiết");}
        finally{
            my.close();}
                return list1;
    }

    public int changeSLb(int sl,String mahang){
        int res = 0;
       try {
           String qry="UPDATE mathang SET ";
           qry = qry + "SoLuong='"+sl+"'";
           qry = qry + " where MaHang='"+mahang+"'";
           res = my.executeUpdate(qry);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Lỗi sửa số lượng");
       }
       return res;
   }    //sửa số lượng sản phẩm  
    
    public int getSLb(String mahang){
        int soluongb = 0;
        try {
            String qry = "select * from mathang where MaHang='"+mahang+"'";
            ResultSet rs = my.executeQuery(qry); 
           while(rs.next()){
              soluongb = rs.getInt("SoLuong");
           }
       } catch (Exception e) {
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Lỗi lấy số lượng sản phẩm");
       }
       return soluongb;
   }    // lấy số lượng sản phẩm   
    
}
