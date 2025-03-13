/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.NccDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import untils.MyDataAccess;
/**
 *
 * @author ADMIN
 */
public class NccDAO {
    MyDataAccess my = new MyDataAccess("localhost","root","","ch_quanao");
    public NccDAO(){}
    public ArrayList<NccDTO> docNcc() throws Exception{
        ArrayList<NccDTO> list=new ArrayList<NccDTO>();
        try {
            String qry="SELECT * FROM ncc";
            ResultSet rs = my.executeQuery(qry);
            while(rs.next()){
             NccDTO ncc=new NccDTO();
             ncc.setMaNcc(rs.getString(1));
             ncc.setTenNcc(rs.getString(2));
             ncc.setSdt(rs.getString(3));
             ncc.setDchi(rs.getString(4));
             list.add(ncc);
            }
}
 catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc Database");}
        finally{    
            my.close();
        }
        return list;
    }
public boolean isValidtoAdd(NccDTO ncc){
       try{
           ArrayList<NccDTO> arr = docNcc();
           for (int i = 0; i < arr.size(); i++) {
               if(arr.get(i).getMaNcc().equals(ncc.getMaNcc())){
                JOptionPane.showMessageDialog(null,"Mã nhà cung cấp đã tồn tại");
                return false;}
               else return true;}
        }catch(Exception e){
            return true;
        }
    return true;        
    }
 public int themNcc(NccDTO ncc){
        if(isValidtoAdd(ncc)){
        int res = 0;
        try{
                String qry = "insert into ncc values(";
                qry = qry +"'"+ncc.getMaNcc()+"'";
                qry = qry +",'"+ncc.getTenNcc()+"'";
                qry = qry +",'"+ncc.getSdt()+"'";
                qry = qry+",'"+ncc.getDchi()+"')";
                res = my.executeUpdate(qry);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Lỗi thêm nhà cung cấp Database");
            }
        return res;
        }
        return 0;
    }
 public int suaNcc(NccDTO ncc){
        int res = 0;
        try{
            String qry = "update ncc set ";
            qry = qry + "TenNcc='"+ncc.getTenNcc()+"',";
            qry = qry + "Sdt='"+ncc.getSdt()+"',";
            qry = qry + "DiaChiNcc='"+ncc.getDchi()+"'";
            qry = qry + " where MaNcc ='"+ncc.getMaNcc()+"'";
            res = my.executeUpdate(qry);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lỗi sửa nhà cung cấp Database");
            e.printStackTrace();
        }
        return res;
    }  
 public int xoaNcc( String id )
    {
        int res = 0;
        try{
            String qry = "delete from ncc where ncc.MaNcc = '" + id+"'";
            System.out.print(qry);
            res = my.executeUpdate(qry);
        } catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "Lỗi xóa nhà cung cấp Database");
        }
        return res;
    }
}
