/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.NhanVienDTO;
import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import untils.MyDataAccess;

public class SanPhamDAO {
    MyDataAccess my = new MyDataAccess("localhost","root","","ch_quanao");
    public SanPhamDAO(){}
    public ArrayList<SanPhamDTO> docSp() throws Exception{
        ArrayList<SanPhamDTO> list=new ArrayList<SanPhamDTO>();
        try {
            String qry="SELECT * FROM mathang";
            ResultSet rs = my.executeQuery(qry);
            while(rs.next()){
             SanPhamDTO sp=new SanPhamDTO();
             sp.setMaHang(rs.getString(1));
             sp.setMaNcc(rs.getString(2));
             sp.setMaLoai(rs.getString(3));
             sp.setTenLoai(rs.getString(4));
             sp.setDonGia(rs.getDouble(5));
             sp.setSoLuong(rs.getInt(6));
             list.add(sp);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
        return list;
}
    public boolean isValidtoAdd(SanPhamDTO sp){
       try{
           ArrayList<SanPhamDTO> arr = docSp();
           for (int i = 0; i < arr.size(); i++) {
               if(arr.get(i).getMaHang().equals(sp.getMaHang())){
                JOptionPane.showMessageDialog(null,"Mã sản phẩm đã tồn tại");
                return false;}
               else return true;}
        }catch(Exception e){
            return true;
        }
    return true;        
    }
    public int themSp(SanPhamDTO sp){
        if(isValidtoAdd(sp)){
        int res = 0;
        try{
                String qry = "insert into mathang values(";
                qry = qry +"'"+sp.getMaHang()+"'";
                qry = qry +",'"+sp.getMaNcc()+"'";
                qry = qry +",'"+sp.getMaLoai()+"'";
                qry = qry+",'"+sp.getTenLoai()+"'";
                qry = qry+",'"+sp.getDonGia()+"'";
                qry = qry+","+sp.getSoLuong()+")";
                res = my.executeUpdate(qry);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Lỗi thêm sản phẩm Database");
            }
        return res;
        }
        return 0;
    }
     public int suaSp(SanPhamDTO sp){
        int res = 0;
        try{
            String qry = "update mathang set ";
            qry = qry + "MaNcc='"+sp.getMaNcc()+"',";
            qry = qry + "MaLoai='"+sp.getMaLoai()+"',";
            qry = qry + "TenLoai='"+sp.getTenLoai()+"',";
            qry = qry + "DonGia="+sp.getDonGia()+",";
            qry = qry + "SoLuong="+sp.getSoLuong();
            qry = qry +" where MaHang ='"+sp.getMaHang()+"'";
            res = my.executeUpdate(qry);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lỗi sửa sản phẩm Database");
            e.printStackTrace();
        }
        return res;
    }  
     public int xoaSp( String id )
    {
        int res = 0;
        try{
            String qry = "delete from mathang where mathang.MaHang = '" + id+"'";
            System.out.print(qry);
            res = my.executeUpdate(qry);
        } catch (Exception e)
        {
//             JOptionPane.showMessageDialog(null, "Lỗi xóa sản phẩm Database");
            e.printStackTrace();
        }
        return res;
    }

     public ArrayList<SanPhamDTO> timkiem(String combobox, String value) {
		if(value.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Hãy nhập thông tin");
			return null;
		}
		ArrayList<SanPhamDTO> ar = new ArrayList<SanPhamDTO>();
		ResultSet rs ;
		String qry = "select * from mathang where ";
		try {
			switch (combobox) {
			case "Mã hàng":{
				qry += "MaHang ='" + value+"'";
				break;
			}
			case "Mã NCC":{
				qry += "MaNcc ='" + value+"'";
				break;
			}
			case "Tên hàng":{
				qry += "TenLoai ='" + value+"'";
				break;
			}
			case "Mã loại":{
				qry += "MaLoai ='" + value+"'";
				break;
			}
			}
			rs = my.executeQuery(qry);
			while(rs.next()){
	             SanPhamDTO sp=new SanPhamDTO();
	             sp.setMaHang(rs.getString(1));
	             sp.setMaNcc(rs.getString(2));
	             sp.setMaLoai(rs.getString(3));
	             sp.setTenLoai(rs.getString(4));
	             sp.setDonGia(rs.getDouble(5));
	             sp.setSoLuong(rs.getInt(6));
	             
	             ar.add(sp);
			}
			return ar;
		}catch (Exception e) {
			return null;
		}
     }
}