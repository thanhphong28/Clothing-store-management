/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.LoaiHangDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import untils.MyDataAccess;

/**
 *
 * @author ADMIN
 */
public class LoaiHangDAO {
    MyDataAccess my = new MyDataAccess("localhost","root","","ch_quanao");
    public LoaiHangDAO(){}
    public ArrayList<LoaiHangDTO> docLh() throws Exception{
        ArrayList<LoaiHangDTO> list=new ArrayList<LoaiHangDTO>();
        try {
            String qry="SELECT * FROM loaihang";
            ResultSet rs = my.executeQuery(qry);
            while(rs.next()){
             LoaiHangDTO lh=new LoaiHangDTO();
             lh.setMaLoai(rs.getString(1));
             lh.setTenLoai(rs.getString(2));
            
             list.add(lh);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
        return list;
    }
        public boolean isValidtoAdd(LoaiHangDTO lh){
       try{
           ArrayList<LoaiHangDTO> arr = docLh();
           for (int i = 0; i < arr.size(); i++) {
               if(arr.get(i).getMaLoai().equals(lh.getMaLoai())){
                JOptionPane.showMessageDialog(null,"Mã loại hàng đã tồn tại");
                return false;}
               else return true;}
        }catch(Exception e){
            return true;
        }
    return true;        
    }
        public int themLh(LoaiHangDTO lh){
        if(isValidtoAdd(lh)){
        int res = 0;
        try{
                String qry = "insert into loaihang values(";
                qry = qry +"'"+lh.getMaLoai()+"'";
                qry = qry +",'"+lh.getTenLoai()+"')";
                
                res = my.executeUpdate(qry);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Lỗi thêm loại hàng Database");
            }
        return res;
        }
        return 0;
    }
        public int suaLh(LoaiHangDTO lh){
        int res = 0;
        try{
            String qry = "update loaihang set ";
            qry = qry + "MaLoai='"+lh.getMaLoai()+"',";
            qry = qry + "TenLoai='"+lh.getTenLoai()+"'";
                      
            qry = qry +" where MaLoai ='"+lh.getMaLoai()+"'";
            res = my.executeUpdate(qry);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lỗi sửa loại hàng Database");
            e.printStackTrace();
        }
        return res;
}
        public int xoaLh( String id )
    {
        int res = 0;
        try{
            String qry = "delete from loaihang where loaihang.MaLoai = '" + id+"'";
            System.out.print(qry);
            res = my.executeUpdate(qry);
        } catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "Lỗi xóa mã loại Database");
        }
        return res;
    }
}