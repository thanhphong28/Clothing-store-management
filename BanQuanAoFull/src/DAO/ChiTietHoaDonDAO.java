package DAO;

import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;



import untils.MyDataAccess;
import java.sql.PreparedStatement;

public class ChiTietHoaDonDAO{
	MyDataAccess my = new MyDataAccess("localhost","root","","ch_quanao");
	public ArrayList<ChiTietHoaDonDTO> docCTHD() throws Exception {
		ArrayList<ChiTietHoaDonDTO> ar=new ArrayList<ChiTietHoaDonDTO>();
		try {
			String qry="SELECT * FROM cthd";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()){
				ChiTietHoaDonDTO cthd=new ChiTietHoaDonDTO();
				cthd.setMaHd(rs.getString(1));
				cthd.setMaHang(rs.getString(2));
				cthd.setDonGia(rs.getDouble(3));
				cthd.setSoLuong(rs.getInt(4));
				cthd.setThanhTien(rs.getDouble(5));
				cthd.setTienGG(rs.getDouble(6));
				ar.add(cthd);
			}
			return ar;
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
		finally{    
			my.close();
		}
		return ar;
}
	public ArrayList<ChiTietHoaDonDTO> getCTHD(String MaHd) throws Exception{
		ArrayList<ChiTietHoaDonDTO> ar = new ArrayList<ChiTietHoaDonDTO>();
		try {
			String qry = "SELECT * FROM cthd WHERE MaHd ='" + MaHd + "'";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				ChiTietHoaDonDTO cthd = new ChiTietHoaDonDTO();
				cthd.setMaHd(rs.getString(1));
				cthd.setMaHang(rs.getString(2));
				cthd.setDonGia(rs.getDouble(3));
				cthd.setSoLuong(rs.getInt(4));
				cthd.setThanhTien(rs.getDouble(5));
				cthd.setTienGG(rs.getDouble(6));
				ar.add(cthd);
			}
			return ar;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi đọc Database");
		}
		finally {
			my.close();
		}
		return ar;
	}
	public ArrayList<String> docMaHd() throws Exception {
    	ArrayList<String> maHd = new ArrayList<String>();
    	try {
    		String qry = "SELECT * FROM hoadon";
    		ResultSet rs = my.executeQuery(qry);
    		while (rs.next()) {
    			maHd.add(rs.getString(1));
    		}
    		return maHd;
    	} catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
    	return maHd;
    }
	public ArrayList<String> getMaHang(){
		ArrayList<String> ar = new ArrayList<String>();
		try {
			String qry = "SELECT * FROM mathang";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) {
				ar.add(rs.getString(1));
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Lỗi đọc database");
		}
		return ar;
	}
	public Double getDonGiaSP(String MaHang) {
		Double DonGia = 0.0;
		try {
			String qry = "SELECT DonGia FROM mathang WHERE MaHang ='"+MaHang+"'";
			ResultSet rs = my.executeQuery(qry);
			if(rs.next())
				DonGia = rs.getDouble(1);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Lỗi đọc database");
		}
		return DonGia;
	}
	public String getTenHang(String MaHang) {
		String ten = "";
		try {
			String qry = "SELECT TenLoai FROM mathang WHERE MaHang='"+MaHang+"'";
			ResultSet rs = my.executeQuery(qry);
			if(rs.next())
				ten = rs.getString(1);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return ten;
	}
	public String getMaHd() {
		String maHd ="";
		try {
			String qry = "SELECT * FROM hoadon";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) 
				maHd = rs.getString(1);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return maHd;
	}
	public int getSoLuong(String MaHang) {
		int SL = 0;
		try {
			String qry = "SELECT SoLuong FROM mathang WHERE MaHang ='"+MaHang+"'";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()) 
				SL = rs.getInt(1);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return SL;
	}
	public int giamSoLuong(String MaHang,int SoLuong) {
		try {
			int SL = getSoLuong(MaHang);
			String qry = "UPDATE mathang SET SoLuong =" + (SL - SoLuong)+" WHERE MaHang ='"+MaHang+"'";
			return my.executeUpdate(qry);
	}catch (Exception e) {
		e.printStackTrace();
		return 0;}
	}
	public int changeSoLuong(String MaHang,int SoLuong) {
		try {
			int SL = getSoLuong(MaHang);
			if(SL + (SoLuong) < 0) {
				JOptionPane.showConfirmDialog(null, "Số lượng không đủ");
				return 0;
			}
			String qry = "UPDATE mathang SET SoLuong ="+(SL + (SoLuong))+" WHERE MaHang ='"+MaHang+"'";
			return my.executeUpdate(qry);
	}catch (Exception e) {
		e.printStackTrace();
		return 0;}
	}
	public double getTongTienHD(String MaHd) {
		double tong = 0.0;
		try {
			String qry = "SELECT TongTien FROM hoadon WHERE MaHd ='"+MaHd+"'";
			ResultSet rs = my.executeQuery(qry);
			rs.next();
			tong = rs.getDouble(1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tong;
	}
	public int changeTongTienHD(double Tien, String MaHd) {
		try {
			double tong = getTongTienHD(MaHd);
			String qry = "UPDATE hoadon SET TongTien="+(tong + Tien)+" WHERE MaHd='"+MaHd+"'";
			return my.executeUpdate(qry);
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public double getThanhTienHD(String MaHd) {
		double ttien = 0.0;
		try {
			String qry = "SELECT ThanhTienHd FROM hoadon WHERE MaHd ='"+MaHd+"'";
			ResultSet rs = my.executeQuery(qry);
			rs.next();
			ttien = rs.getDouble(1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ttien;
	}
	public int changeThanhTienHD(String MaHd) {
		try {
			String sql = "SELECT TienGGHd FROM hoadon WHERE MaHd ='"+MaHd+"'";
			ResultSet rs = my.executeQuery(sql);
			rs.next();
			double giamgia = rs.getDouble(1);
			double tongtien = getTongTienHD(MaHd);
			String qry = "UPDATE hoadon SET ThanhTienHd="+(tongtien - giamgia)+" WHERE MaHd='"+MaHd+"'";
			return my.executeUpdate(qry);
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public boolean themCTHD(ChiTietHoaDonDTO cthd) {
		boolean result = false;
		try {
			String sql = "insert into cthd values(";
			sql += "'" + cthd.getMaHd() + "',";
			sql += "'" + cthd.getMaHang() + "',";
			sql += "" + cthd.getDonGia() + ",";
			sql += "" + cthd.getSoLuong() + ",";
			sql += "" + cthd.getThanhTien() + ",";
			sql += "" + cthd.getTienGG()+")";
			if(my.executeUpdate(sql) >= 1)
				result = true;
		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Lỗi thêm chi tiết hóa đơn");
		}
		return result;
	}
	public boolean updateCTHD(ChiTietHoaDonDTO cthd) {
		try {
			String sql = "UPDATE cthd SET ";
			sql+="DonGiaCTHD='"+cthd.getDonGia()+"', ";
			sql+="SoLuong="+cthd.getSoLuong()+", ";
			sql+="ThanhTienCTHD="+cthd.getThanhTien()+", ";
			sql+="TienGGCTHD="+cthd.getTienGG();
			sql+=" WHERE MaHd ='"+cthd.getMaHd()+"' AND MaHang ='"+cthd.getMaHang()+"'";
			if(my.executeUpdate(sql) >= 1)
				return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public String getMaKm(String MaHd) {
		try {
			ResultSet rs = my.executeQuery("SELECT MaKm FROM hoadon WHERE MaHd='"+MaHd+"'");
			rs.next();
			return rs.getString(1);
		}catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	public boolean updateHD(String MaHd) {
		try {
			double tongtienHD = 0 ;
			String qry="SELECT * FROM cthd WHERE MaHd='"+MaHd+"'";
			ResultSet rs = my.executeQuery(qry);
			while(rs.next()){
				tongtienHD += rs.getDouble(5) - rs.getDouble(6);
			}
			String sql = "UPDATE hoadon SET TongTien="+tongtienHD+", ";
			sql+="TienGGHd="+tinhGG(tongtienHD, getMaKm(MaHd))+", ";
			sql+="ThanhTienHd="+(tongtienHD - tinhGG(tongtienHD, getMaKm(MaHd)));
			sql+=" WHERE MaHd='"+MaHd+"'";
			if(my.executeUpdate(sql) >= 1)
				return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	public double tinhGG(double TongTien, String MaKm) {
		if(MaKm == "")
			return 0;
    	try {
    		String qry = "SELECT PhanTramGG from khuyenmai where MaKm ='"+MaKm+"'";
    		ResultSet rs = my.executeQuery(qry);
    		rs.next();
    		return (TongTien * rs.getDouble(1));
    	}catch(Exception e) {
    		e.printStackTrace();
    		return 0;
    	}
    }
	public ArrayList<ChiTietHoaDonDTO> timCTHoaDon(String combobox, String value) {
		if(value.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Hãy nhập thông tin");
			return null;
		}
		ArrayList<ChiTietHoaDonDTO> ar = new ArrayList<ChiTietHoaDonDTO>();
		ResultSet rs ;
		String qry = "select * from cthd where ";
		try {
			switch (combobox) {
			case "Mã hóa đơn":{
				qry += "MaHd ='" + value+"'";
				break;
			}
			case "Mã hàng":{
				qry += "MaHang ='" + value+"'";
				break;
			}
			}
			rs = my.executeQuery(qry);
			while(rs.next()){
	             ChiTietHoaDonDTO cthd=new ChiTietHoaDonDTO();
	             cthd.setMaHd(rs.getString(1));
	             cthd.setMaHang(rs.getString(2));
	             cthd.setDonGia(rs.getDouble(3));
	             cthd.setSoLuong(rs.getInt(4));
	             cthd.setThanhTien(rs.getDouble(5));
	             cthd.setTienGG(rs.getDouble(6));
	             ar.add(cthd);
			}
			return ar;
		}catch (Exception e) {
			return null;
		}
	}
	public ArrayList<ChiTietHoaDonDTO> tkncCTHoaDon(String combobox, String value1, String value2) {
		if(value1.isEmpty() || value2.isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Nhập đầy đủ");
    		return null;
    	}
		if((Double.parseDouble(value1) > Double.parseDouble(value2))) {
			JOptionPane.showMessageDialog(null, "Nhập sai cách");
			return null;
		}
		ArrayList<ChiTietHoaDonDTO> ar = new ArrayList<ChiTietHoaDonDTO>();
		ResultSet rs ;
		String qry = "select * from cthd where ";
		try {
			switch (combobox) {
			case "Đơn giá":{
				qry += "DonGiaCTHD between " + Double.parseDouble(value1)+" and "+Double.parseDouble(value2);
				break;
			}
			case "Thành tiền":{
				qry += "ThanhTienCTHD between " + Double.parseDouble(value1)+" and " + Double.parseDouble(value2);
				break;
			}
			}
			//JOptionPane.showMessageDialog(null, qry);
			rs = my.executeQuery(qry);
			while(rs.next()){
	             ChiTietHoaDonDTO cthd=new ChiTietHoaDonDTO();
	             cthd.setMaHd(rs.getString(1));
	             cthd.setMaHang(rs.getString(2));
	             cthd.setDonGia(rs.getDouble(3));
	             cthd.setSoLuong(rs.getInt(4));
	             cthd.setThanhTien(rs.getDouble(5));
	             cthd.setTienGG(rs.getDouble(6));
	             ar.add(cthd);
			}
			return ar;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
       
	}