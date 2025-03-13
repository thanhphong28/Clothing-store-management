/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class ChiTietHoaDonBUS {
	ChiTietHoaDonDAO cthdDAO = new ChiTietHoaDonDAO();
    public ArrayList<ChiTietHoaDonDTO> docCTHD(){
    	try {
			return cthdDAO.docCTHD();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
    public ArrayList<ChiTietHoaDonDTO> getCTHD(String MaHd){
    	try {
			return cthdDAO.getCTHD(MaHd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
    public ArrayList<String> docMaHd() {
    	try {
    		return cthdDAO.docMaHd();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public ArrayList<String> getMaHang(){
    	try {
    		return cthdDAO.getMaHang();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public Double getDonGiaSP(String MaHang) {
    	try {
    		return cthdDAO.getDonGiaSP(MaHang);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return 0.0;
    }
    public String getTenHang(String MaHang) {
    	try {
    		return cthdDAO.getTenHang(MaHang);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return "";
    }
    public String getMaHd() {
    	try {
    		return cthdDAO.getMaHd();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return "";
    }
    public int getSoLuong(String MaHang) {
    	try {
    		return cthdDAO.getSoLuong(MaHang);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return 0;
    }
    public int giamSoLuong(String MaHang, int SoLuong) {
    	try {
    		return cthdDAO.giamSoLuong(MaHang, SoLuong);
    	}catch(Exception e) {
    		e.printStackTrace();
    		return 0;
    	}
    }
    public int changeSoLuong(String MaHang, int SoLuong) {
    	try {
    		return cthdDAO.changeSoLuong(MaHang, SoLuong);
    	}catch(Exception e) {
    		e.printStackTrace();
    		return 0;
    	}
    }
    public int changeTongTien(String MaHd, double tongtien) {
    	try {
    		return cthdDAO.changeTongTienHD(tongtien, MaHd);
    	}catch(Exception e) {
    		e.printStackTrace();
    		return 0;
    	}
    }
    public int changeThanhTien(String MaHd) {
    	try {
    		return cthdDAO.changeThanhTienHD(MaHd);
    	}catch(Exception e) {
    		e.printStackTrace();
    		return 0;
    	}
    }
    public int themCTHoaDon (ChiTietHoaDonDTO cthd) {
    	if(cthdDAO.themCTHD(cthd)) {
    		JOptionPane.showMessageDialog(null,"Thêm thành công");
    		return 1;}
    	else JOptionPane.showMessageDialog(null,"Thêm thất bại");
    	return 0;
    }
    public ArrayList<ChiTietHoaDonDTO> timCTHoaDon(String combobox, String value){
    	try {
    			return cthdDAO.timCTHoaDon(combobox, value);
    	}catch (Exception e) {
    		return null;
    	}
    }
    public boolean updateCTHD(ChiTietHoaDonDTO cthd) {
    	try {
    		return cthdDAO.updateCTHD(cthd);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, "Chỉnh sửa thất bại");
    		return false;
    	}
    }
    public boolean updateHD(String MaHd) {
    	try {
    		return cthdDAO.updateHD(MaHd);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, "Chỉnh sửa thất bại");
    		return false;
    	}
    }
    public ArrayList<ChiTietHoaDonDTO> tkncCTHoaDon(String combobox, String value1, String value2){
    	try {
			return cthdDAO.tkncCTHoaDon(combobox, value1, value2);
	}catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Lỗi tìm hóa đơn");
		return null;
	}
    }
}
