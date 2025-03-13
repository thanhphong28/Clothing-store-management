/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;
public class SanPhamBUS {
    
    public static ArrayList<SanPhamDTO> list;  
     SanPhamDAO data = new SanPhamDAO();
    public SanPhamBUS(){}
    public ArrayList<SanPhamDTO> docSp(){
       
        try{
            list = new ArrayList<SanPhamDTO>();
            list = data.docSp();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public int themSp(SanPhamDTO sp){
        SanPhamDAO data = new SanPhamDAO();
        int check = data.themSp(sp);
        if(check==1)
            list.add(sp);
        return check;
    }
    public int suaSp(SanPhamDTO sp,int i){
        SanPhamDAO data = new SanPhamDAO();
        int check = data.suaSp(sp);
        if(check ==1)
            list.set(i,sp);
        return check;
    }   
    public int xoaSp( String i)
    {
        SanPhamDAO data = new SanPhamDAO();
        int check = data.xoaSp( i);
        if (check == 1)
        {
            list.remove(i);
        }
        return check;
    }
    

    public ArrayList<SanPhamDTO> timkiem(String combobox, String value){
    	try {
    			return data.timkiem(combobox, value);
    	}catch (Exception e) {
    		return null;
    	}
    }
    
}

