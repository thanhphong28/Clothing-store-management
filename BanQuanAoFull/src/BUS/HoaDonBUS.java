/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.HoaDonDTO;
import DAO.HoaDonDAO;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import com.itextpdf.text.DocumentException;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDonBUS {
    HoaDonDAO hdDAO = new HoaDonDAO();
    public ArrayList<HoaDonDTO> docHD(){
    	try {
			return hdDAO.docHD();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
    public ArrayList<String> docMaNv() {
    	try {
    		return hdDAO.docMaNv();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public ArrayList<String> docMaKh() {
    	try {
    		return hdDAO.docMaKh();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public ArrayList<String> docMaKm(String date) {
    	try {
    		return hdDAO.docMaKm(date);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public int themHoaDon (HoaDonDTO hd) throws Exception {
    	//if(hdDAO.ktMaHD(hd.getMaHd()))
    		//return "Đã tồn tại mã hóa đơn";
    	if(hdDAO.themHoaDon(hd))
    		return 1;
    	else return 0;
    }
    public int suaHoaDon (HoaDonDTO hd) {
    	if(hdDAO.suaHd(hd))
    		return 1;
    	return 0;
    }
    public int xoaHoaDon (HoaDonDTO hd) {
    	if(hdDAO.ktMaHD(hd.getMaHd())) {
    		if(hdDAO.xoaHoaDon(hd.getMaHd()))
    			return 1;
    		else return 0;
    	}
    	else return 0;
    }
    public ArrayList<HoaDonDTO> timHoaDon(String combobox, String value){
    	try {
    			return hdDAO.timHoaDon(combobox, value);
    	}catch (Exception e) {
    		return null;
    	}
    }
    public ArrayList<HoaDonDTO> tkncHoaDon(String combobox, String value1, String value2){
    	try {
			return hdDAO.tkncHoaDon(combobox, value1, value2);
	}catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Lỗi tìm hóa đơn");
		return null;
	}
    }
    public double tinhGG(Double TongTien, String MaKm) {
    	return hdDAO.tinhGG(TongTien, MaKm);
    }
    public double tinhTT(Double TongTien, Double TienGG) {
    	return hdDAO.tinhTT(TongTien, TienGG);
    }
    public void printHoaDon(String MaHd, String path) throws HeadlessException, DocumentException, IOException {
    	if(hdDAO.printHoaDon(MaHd, path) == 1)
    		JOptionPane.showMessageDialog(null, "Xuất hóa đơn thành công");
    	else JOptionPane.showMessageDialog(null, "Xuất hóa đơn thất bại");
    }
    public Date FormatofDate(String str) throws ParseException{
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(true);
        Date date = format.parse(str);
        return date;
    }    
    

    public ArrayList<HoaDonDTO> timtheoNgay(String from, String to) {
         ArrayList<HoaDonDTO> arr = new ArrayList<HoaDonDTO>();
        try{
            for(HoaDonDTO hd: docHD()){
                if(FormatofDate(hd.getNgayXuat()).compareTo(FormatofDate(from))>= 0 
                        && FormatofDate(hd.getNgayXuat()).compareTo(FormatofDate(to))<=0)

                arr.add(hd);
            }
        }catch(Exception e){
            e.printStackTrace();
        
    }
        return arr;
    }
}
