package DAO;

import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.NhanVienDTO;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import untils.MyDataAccess;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;

public class HoaDonDAO {
    MyDataAccess my = new MyDataAccess("localhost","root","","ch_quanao");
    public HoaDonDAO(){}
    public ArrayList<HoaDonDTO> docHD() throws Exception{
        ArrayList<HoaDonDTO> ar=new ArrayList<HoaDonDTO>();
        try {
            String qry="SELECT * FROM hoadon";
            ResultSet rs = my.executeQuery(qry);
            while(rs.next()){
             HoaDonDTO hd=new HoaDonDTO();
             hd.setMaHd(rs.getString(1));
             hd.setMaNv(rs.getString(2));
             hd.setMaKh(rs.getString(3));
             hd.setMaKm(rs.getString(4));
             hd.setNgayXuat(rs.getString(5));
             hd.setTongTien(rs.getDouble(6));
             hd.setTienGGHd(rs.getDouble(7));
             hd.setThanhTienHd(rs.getDouble(8));
             ar.add(hd);
            }
            return ar;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
        return ar;
    }
    public ArrayList<String> docMaNv() throws Exception {
    	ArrayList<String> maNv = new ArrayList<String>();
    	try {
    		String qry = "SELECT * FROM nhanvien";
    		ResultSet rs = my.executeQuery(qry);
    		while (rs.next()) {
    			maNv.add(rs.getString(1));
    		}
    		return maNv;
    	} catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
    	return maNv;
    }
    public ArrayList<String> docMaKh() throws Exception {
    	ArrayList<String> maKh = new ArrayList<String>();
    	try {
    		String qry = "SELECT * FROM khachhang";
    		ResultSet rs = my.executeQuery(qry);
    		while (rs.next()) {
    			maKh.add(rs.getString(1));
    		}
    		return maKh;
    	} catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
    	return maKh;
    }
    public ArrayList<String> docMaKm(String date) throws Exception {
    	ArrayList<String> maKm = new ArrayList<String>();
    	try {
    		String qry = "SELECT * FROM khuyenmai where NgayBDKM <='"+date+"' and NgayKTKM >='"+date+"'";
    		ResultSet rs = my.executeQuery(qry);
    		while (rs.next()) {
    			maKm.add(rs.getString(1));
    		}
    		return maKm;
    	} catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
    	return maKm;
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
    public double tinhTT(double TongTien, double TienGG) {
    	return TongTien - TienGG;
    }
	public boolean themHoaDon(HoaDonDTO hd) throws Exception{
		boolean result = false;
		try {
			String sql = "insert into hoadon values(";
			sql += "'" + hd.getMaHd() + "'";
			sql += ",'" + hd.getMaNv() + "'";
			sql += ",'" + hd.getMaKh() + "'";
			sql += ",'" + hd.getMaKm() + "'";
			sql += ",'" + hd.getNgayXuat() + "'";
			sql += "," + hd.getTongTien() + "";
			sql += "," + hd.getTienGGHd() + "";
			sql += "," + hd.getThanhTienHd() + ")";
			if(my.executeUpdate(sql) >= 1)
				result = true;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi thêm hóa đơn");
			throw new Exception(e.getMessage());
		}
		return result;
	}
	public boolean suaHd(HoaDonDTO hd){
        boolean result = false;
        try{
            String qry = "update hoadon set ";
            qry += "MaNv= '" +hd.getMaNv()+"',";
            qry += "MaKh= '" +hd.getMaKh()+"',";
            qry += "MaKm= '" +hd.getMaKm()+"',";
            qry += "NgayXuat= '" +hd.getNgayXuat()+"',";
            qry += "TongTien= " +hd.getTongTien()+",";
            qry += "TienGGHd= " +hd.getTienGGHd()+",";
            qry += "ThanhTienHd= " +hd.getThanhTienHd();
            qry += "where MaHd= '" +hd.getMaHd()+"'";
            if(my.executeUpdate(qry) >= 1)
            	result = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lỗi sửa nhân viên Database");
        }
        return result;
    }  
	public boolean ktMaHD(String MaHD) {
		boolean result = false;
		try {
			String sql = "select * from hoadon where MaHd =" + MaHD;
			ResultSet rs = my.executeQuery(sql);
			result = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean xoaHoaDon(String MaHd) {
		boolean result = false;
		try {
			String sql = "delete from hoadon where hoadon.MaHd = "+ MaHd;
			if (my.executeUpdate(sql) >= 1)
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public ArrayList<HoaDonDTO> timHoaDon(String combobox, String value) {
		if(value.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Hãy nhập thông tin");
			return null;
		}
		ArrayList<HoaDonDTO> ar = new ArrayList<HoaDonDTO>();
		ResultSet rs ;
		String qry = "select * from hoadon where ";
		try {
			switch (combobox) {
			case "Mã hóa đơn":{
				qry += "MaHd ='" + value+"'";
				break;
			}
			case "Mã khách hàng":{
				qry += "MaKh ='" + value+"'";
				break;
			}
			case "Mã nhân viên":{
				qry += "MaNv ='" + value+"'";
				break;
			}
			case "Mã khuyến mãi":{
				qry += "MaKm ='" + value+"'";
				break;
			}
			}
			rs = my.executeQuery(qry);
			while(rs.next()){
	             HoaDonDTO hd=new HoaDonDTO();
	             hd.setMaHd(rs.getString(1));
	             hd.setMaNv(rs.getString(2));
	             hd.setMaKh(rs.getString(3));
	             hd.setMaKm(rs.getString(4));
	             hd.setNgayXuat(rs.getString(5));
	             hd.setTongTien(rs.getDouble(6));
	             hd.setTienGGHd(rs.getDouble(7));
	             hd.setThanhTienHd(rs.getDouble(8));
	             ar.add(hd);
			}
			return ar;
		}catch (Exception e) {
			return null;
		}
	}
	public ArrayList<HoaDonDTO> tkncHoaDon(String combobox, String value1, String value2) {
		if(combobox != "Ngày") {
		if(value1.isEmpty() || value2.isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Nhập đầy đủ");
    		return null;
    	}
		if((Double.parseDouble(value1) > Double.parseDouble(value2))) {
			JOptionPane.showMessageDialog(null, "Nhập sai cách");
			return null;
		}
		}
		ArrayList<HoaDonDTO> ar = new ArrayList<HoaDonDTO>();
		ResultSet rs ;
		String qry = "select * from hoadon where ";
		try {
			switch (combobox) {
			case "Tổng tiền":{
				qry += "TongTien between " + Double.parseDouble(value1)+" and "+Double.parseDouble(value2);
				break;
			}
			case "Tiền giảm giá":{
				qry += "TienGGHd between " + Double.parseDouble(value1)+" and " + Double.parseDouble(value2);
				break;
			}
			case "Ngày":{
				qry += "NgayXuat between '" + value1+"' and '" + value2+"'";
				break;
			}
			}
			//JOptionPane.showMessageDialog(null, qry);
			rs = my.executeQuery(qry);
			while(rs.next()){
	             HoaDonDTO hd=new HoaDonDTO();
	             hd.setMaHd(rs.getString(1));
	             hd.setMaNv(rs.getString(2));
	             hd.setMaKh(rs.getString(3));
	             hd.setMaKm(rs.getString(4));
	             hd.setNgayXuat(rs.getString(5));
	             hd.setTongTien(rs.getDouble(6));
	             hd.setTienGGHd(rs.getDouble(7));
	             hd.setThanhTienHd(rs.getDouble(8));
	             ar.add(hd);
			}
			return ar;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static boolean notNumeric(String strNum) {
	    if (strNum == null) {
	        return true;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return true;
	    }
	    return false;
	}
	public int printHoaDon(String MaHd, String path) throws DocumentException, IOException {
		HoaDonDTO hd = new HoaDonDTO();
		ArrayList<ChiTietHoaDonDTO> ar = new ArrayList<ChiTietHoaDonDTO>();
		try {
			String qry = "SELECT * FROM hoadon WHERE MaHd ='"+MaHd+"'";
			ResultSet rs = my.executeQuery(qry);
			rs.next();
			hd.setMaHd(rs.getString(1));
			hd.setMaNv(rs.getString(2));
			hd.setMaKh(rs.getString(3));
			hd.setMaKm(rs.getString(4));
			hd.setNgayXuat(rs.getString(5));
			hd.setTongTien(rs.getDouble(6));
			hd.setTienGGHd(rs.getDouble(7));
			hd.setThanhTienHd(rs.getDouble(8));
			qry = "SELECT * FROM cthd WHERE MaHd ='"+MaHd+"'";
			rs = my.executeQuery(qry);
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
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(path));
		doc.open();
		doc.add(new Paragraph("	Bill ID: "+hd.getMaHd()));
		doc.add(new Paragraph("\n Employee ID: "+hd.getMaNv()));
		doc.add(new Paragraph("\n Customer ID: "+hd.getMaKh()));
		doc.add(new Paragraph("\n ID: "+hd.getNgayXuat() +"\n"));
		PdfPTable table = new PdfPTable(5);
		table.addCell("	Items");
		table.addCell("	Quantity");
		table.addCell("	Price");
		table.addCell("	Discount");
		table.addCell("	Total");
		for(int i = 0; i < ar.size(); i++) {
			try {
				ChiTietHoaDonDTO sp = new ChiTietHoaDonDTO();
				sp = ar.get(i);
				ResultSet rs = my.executeQuery("SELECT TenLoai FROM mathang WHERE MaHang='"+sp.getMaHang()+"'");
				rs.next();
				table.addCell(rs.getString(1));
				table.addCell(""+sp.getSoLuong());
				table.addCell(""+sp.getDonGia());
				table.addCell(""+sp.getTienGG());
				table.addCell(""+sp.getThanhTien());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		}
		doc.add(table);
		doc.add(new Paragraph("\n Sub total: "+hd.getTongTien()));
		doc.add(new Paragraph("\n Discount: "+hd.getTienGGHd()));
		doc.add(new Paragraph("\n Total: "+hd.getThanhTienHd()));
		doc.close();
		return 1;
	}
}
  