

package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import java.util.ArrayList;
public class KhachHangBUS {
    

     public static ArrayList<KhachHangDTO> list;    
    public KhachHangBUS(){}
    public ArrayList<KhachHangDTO> docKh(){
        KhachHangDAO data = new KhachHangDAO();
        try{
            list = new ArrayList<KhachHangDTO>();
            list = data.docKh();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public int themKh(KhachHangDTO kh){
        KhachHangDAO data = new KhachHangDAO();
        int check = data.themKh(kh);
        if(check==1)
            list.add(kh);
        return check;
    }
    public int suaKh(KhachHangDTO kh,int i){
        KhachHangDAO data = new KhachHangDAO();
        int check = data.suaKh(kh);
        if(check ==1)
            list.set(i,kh);
        return check;
        }   
    public int xoaKh( String i)
    {
        KhachHangDAO data = new KhachHangDAO();
        int check = data.xoaKh( i);
        if (check == 1)
        {
            list.remove(i);
        }
        return check;
    }

    
}
