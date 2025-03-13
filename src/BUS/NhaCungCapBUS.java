/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.NccDAO;
import DTO.NccDTO;  
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class NhaCungCapBUS {
  public static ArrayList<NccDTO> list;    
    public NhaCungCapBUS(){}
    public ArrayList<NccDTO> docNcc(){
        NccDAO data = new NccDAO();
        try{
            list = new ArrayList<NccDTO>();
            list = data.docNcc();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }  
     public int themNcc(NccDTO ncc){
        NccDAO data = new NccDAO();
        int check = data.themNcc(ncc);
        if(check==1)
            list.add(ncc);
        return check;
    }
    public int suaNcc(NccDTO ncc,int i){
        NccDAO data = new NccDAO();
        int check = data.suaNcc(ncc);
        if(check ==1)
            list.set(i,ncc);
        return check;
    }   
    public int xoaNcc( String i)
    {
        NccDAO data = new NccDAO();
        int check = data.xoaNcc( i);
        if (check == 1)
        {
            list.remove(i);
        }
        return check;
    }
}
