/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.SanPhamCTDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class SanPhamCTBUS {
    public static ArrayList<SanPhamDTO> list1;
    public SanPhamCTBUS(){}
    public ArrayList<SanPhamDTO> docSachforCT(){
        SanPhamCTDAO data = new SanPhamCTDAO();
        try{
            list1 = new ArrayList<SanPhamDTO>();
            list1 = data.docsachforCT();        
        }catch(Exception e){
            e.printStackTrace();
        }
        return list1;
    }
    public int getSLb(String mahang) {
        SanPhamCTDAO data = new SanPhamCTDAO();
        int check = data.getSLb(mahang);
        return check;
    }
    public int changeSLb(String mahang,int sl) {
        SanPhamCTDAO data = new SanPhamCTDAO();
        int check = data.changeSLb(sl,mahang);
        return check;
    }    
}
