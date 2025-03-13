/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.LoaiHangDAO;
import DTO.LoaiHangDTO;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class LoaiHangBUS {
    public static ArrayList<LoaiHangDTO> list;
    public LoaiHangBUS(){}
    public ArrayList<LoaiHangDTO> docLh(){
        LoaiHangDAO data = new LoaiHangDAO();
        try{
            list = new ArrayList<LoaiHangDTO>();
            list = data.docLh();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
   public int themLh(LoaiHangDTO lh)
   {
       LoaiHangDAO data = new LoaiHangDAO();
        int check = data.themLh(lh);
        if(check==1)
            list.add(lh);
        return check;
   }
   public int suaLh(LoaiHangDTO lh,int i){
        LoaiHangDAO data = new LoaiHangDAO();
        int check = data.suaLh(lh);
        if(check ==1)
            list.set(i,lh);
        return check;
    }   
public int xoaLh( String i)
    {
        LoaiHangDAO data = new LoaiHangDAO();
        int check = data.xoaLh( i);
        if (check == 1)
        {
            list.remove(i);
        }
        return check;
    }
}
