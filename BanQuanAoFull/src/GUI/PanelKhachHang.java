
package GUI;

import BUS.KhachHangBUS;
import DTO.KhachHangDTO;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static untils.CheckData.checkNumber;
import static untils.CheckData.checkSoDienThoai;


public class PanelKhachHang extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    KhachHangBUS bus = new KhachHangBUS();
    ArrayList<KhachHangDTO> arr = new ArrayList<KhachHangDTO>();
    public PanelKhachHang() {
        initComponents();
        initData();
        load();
        model = (DefaultTableModel) tb_kh.getModel();
    }
      private void initEvent() {
        tb_kh.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            try {
            KhachHangDTO kh = new KhachHangDTO();
            kh.setMaKH(arr.get(tb_kh.getSelectedRow()).getMaKH());
            kh.setHoKH(arr.get(tb_kh.getSelectedRow()).getHoKH());
            kh.setTenKH(arr.get(tb_kh.getSelectedRow()).getTenKH());
            kh.setDiaChiKH(arr.get(tb_kh.getSelectedRow()).getDiaChiKH());
            
            kh.setSodienthoai(arr.get(tb_kh.getSelectedRow()).getSodienthoai());            
            }catch (Exception e) {
            }
        }
        });
         }
    private void initData(){
    txt_kh.setEnabled(false);
    txt_hokh.setEnabled(false);
    txt_tenkh.setEnabled(false);
    txt_sdtkh.setEnabled(false);
    txt_dckh.setEnabled(false);
    }

public KhachHangDTO getText(){
    KhachHangDTO kh = new KhachHangDTO();
    kh.setMaKH(txt_kh.getText().trim());
    kh.setHoKH(txt_hokh.getText().trim());                    
    kh.setTenKH(txt_tenkh.getText().trim());
    kh.setDiaChiKH(txt_dckh.getText().trim());    
    kh.setSodienthoai(txt_sdtkh.getText().trim());        
    return kh;
}

    private void load(){
     KhachHangBUS bus = new KhachHangBUS();       
        try{
           bus.docKh();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
           return;
       }
       Vector header = new Vector();
        header.add("Mã khách hàng");
        header.add("Họ khách hàng");
        header.add("Tên khách hàng");
        
       
        header.add("Sdt khách hàng"); 
        header.add("Địa chỉ");
            model = new DefaultTableModel(header,0){
            public boolean isCellEditable(int row, int column)
                {
                  return false;
                }
       };	
       showOnTable(bus.list);
    }
    
    private Vector setVector(KhachHangDTO kh){
        Vector row = new Vector();
        row.add(kh.getMaKH());
        row.add(kh.getHoKH());
        row.add(kh.getTenKH());
        
        
        row.add(kh.getSodienthoai()); 
        row.add(kh.getDiaChiKH());
                   
        return row;
    }    
    private void showOnTable(ArrayList<KhachHangDTO> list){
        model.setRowCount(0);
        for(KhachHangDTO kh:list){
           Vector data = setVector(kh);
           model.addRow(data);
       }
       tb_kh.setModel(model);
    }
    private void setModelValue(KhachHangDTO kh, int i){
        model.setValueAt(kh.getMaKH(),i,0);
        model.setValueAt(kh.getHoKH(),i,1);
        model.setValueAt(kh.getTenKH(),i,2);
        model.setValueAt(kh.getSodienthoai(), i, 3);
        model.setValueAt(kh.getDiaChiKH(),i,4);
        
        tb_kh.setModel(model);            
    }
    public void auto_increaseMaKh(){
        String i = null;
        KhachHangDTO kh= bus.docKh().get(bus.docKh().size()-1);
        String b="00";
        String c="0";
        int a= Integer.parseInt(kh.getMaKH().substring(2,5));
        a++;
        if(a<10){ i="KH"+b+a; }
        if(10<=a && a<=99) {  i ="KH"+c+a; }
        if(a>100){  i="KH"+a; }
        txt_kh.setText(i);
    } 
    public void reset()
    {
        txt_kh.setText("");
        txt_hokh.setText("");
        txt_tenkh.setText("");
        txt_sdtkh.setText("");
        txt_dckh.setText("");
        txt_findkh.setText("");  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel2 = new javax.swing.JPanel();
        pn_ttkh = new javax.swing.JPanel();
        lb_kh = new javax.swing.JLabel();
        txt_kh = new javax.swing.JTextField();
        lb_tenkh = new javax.swing.JLabel();
        txt_tenkh = new javax.swing.JTextField();
        lb_dckh = new javax.swing.JLabel();
        txt_dckh = new javax.swing.JTextField();
        lb_sdtkh = new javax.swing.JLabel();
        lb_hokh = new javax.swing.JLabel();
        txt_hokh = new javax.swing.JTextField();
        txt_sdtkh = new javax.swing.JTextField();
        pn_dokh = new javax.swing.JPanel();
        bt_addkh = new javax.swing.JButton();
        bt_resetkh = new javax.swing.JButton();
        bt_changekh = new javax.swing.JButton();
        pn_findkh = new javax.swing.JPanel();
        txt_findkh = new javax.swing.JTextField();
        lb_findkh = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_kh = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_ttkh.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttkh.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N
        pn_ttkh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_kh.setText("Mã khách hàng:");
        pn_ttkh.add(lb_kh, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));
        pn_ttkh.add(txt_kh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, -1));

        lb_tenkh.setText("Tên khách hàng:");
        pn_ttkh.add(lb_tenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 20));
        pn_ttkh.add(txt_tenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 337, -1));

        lb_dckh.setText("Địa chỉ:");
        pn_ttkh.add(lb_dckh, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));
        pn_ttkh.add(txt_dckh, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 314, -1));

        lb_sdtkh.setText("Số điện thoại:");
        pn_ttkh.add(lb_sdtkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        lb_hokh.setText("Họ khách hàng:");
        pn_ttkh.add(lb_hokh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 20));
        pn_ttkh.add(txt_hokh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 112, -1));

        txt_sdtkh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sdtkhKeyReleased(evt);
            }
        });
        pn_ttkh.add(txt_sdtkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 314, -1));

        Panel2.add(pn_ttkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1030, 100));

        pn_dokh.setBackground(new java.awt.Color(255, 255, 255));
        pn_dokh.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));
        pn_dokh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_addkh.setBackground(new java.awt.Color(204, 204, 204));
        bt_addkh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addkh.setText("Thêm");
        bt_addkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addkhActionPerformed(evt);
            }
        });
        pn_dokh.add(bt_addkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, 41));

        bt_resetkh.setBackground(new java.awt.Color(204, 204, 204));
        bt_resetkh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resetkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resetkh.setText("Đặt lại");
        bt_resetkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetkhActionPerformed(evt);
            }
        });
        pn_dokh.add(bt_resetkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 41));

        bt_changekh.setBackground(new java.awt.Color(204, 204, 204));
        bt_changekh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changekh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changekh.setText("Sửa");
        bt_changekh.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changekh.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changekh.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changekh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changekhActionPerformed(evt);
            }
        });
        pn_dokh.add(bt_changekh, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 140, 41));

        Panel2.add(pn_dokh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 600, 80));

        pn_findkh.setBackground(new java.awt.Color(255, 255, 255));
        pn_findkh.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        pn_findkh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_findkh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_findkhKeyReleased(evt);
            }
        });
        pn_findkh.add(txt_findkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 230, 31));

        lb_findkh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_findkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        lb_findkh.setText("Tìm kiếm:");
        pn_findkh.add(lb_findkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 31));

        Panel2.add(pn_findkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 400, 80));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_kh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_kh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_khMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_kh);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 450));

        Panel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 239, 1080, 410));

        jPanel1.setBackground(new java.awt.Color(138, 170, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN KHÁCH HÀNG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 460, 60));

        Panel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resetkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetkhActionPerformed
        txt_kh.setText("");
        txt_hokh.setText("");
        txt_tenkh.setText("");
        txt_sdtkh.setText("");
        txt_dckh.setText("");
        txt_findkh.setText("");        
    }//GEN-LAST:event_bt_resetkhActionPerformed

    private void bt_changekhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changekhActionPerformed
  if (bt_changekh.getText().toString().equals("Sửa")) {
            txt_tenkh.setEnabled(true);
            txt_hokh.setEnabled(true);
            txt_dckh.setEnabled(true);
            txt_sdtkh.setEnabled(true);            
            
            bt_changekh.setText("Xác nhận");}
    else { {String regex = "^(09|02|07)[0-9]{8}$";if (!txt_sdtkh.getText().matches(regex)){JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ"); return ;}
      if (txt_kh.getText().length() != 0 && txt_tenkh.getText().length() != 0
                && txt_hokh.getText().length() != 0 && txt_dckh.getText().length() != 0
                && txt_sdtkh.getText().length() != 0) {
                bt_changekh.setText("Sửa");    
            int i = tb_kh.getSelectedRow();
            if(i>=0){
            int k = JOptionPane.showConfirmDialog(null, "Xác nhận sửa", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                initData();
                return;
            }
            if (k==2)
            {
                bt_changekhActionPerformed(evt);
                return;
            }                     
                KhachHangDTO kh = getText();
                int check = bus.suaKh(kh,i);
                if(check == 1){
                    setModelValue(kh,i);
                    txt_tenkh.setEnabled(false);
            txt_hokh.setEnabled(false);
            txt_dckh.setEnabled(false);
            txt_sdtkh.setEnabled(false); 
                    JOptionPane.showMessageDialog(null, "Sửa thành công");}
                }else{
                    JOptionPane.showMessageDialog(null, "Sửa thất bại");}                    
                }else{
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
            }
               
  }
    }//GEN-LAST:event_bt_changekhActionPerformed

    private void bt_addkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addkhActionPerformed

                          if (bt_addkh.getText().toString().equals("Thêm")) {
            txt_kh.setEnabled(false);
            txt_kh.setEditable(false);
            txt_tenkh.setEnabled(true);
            txt_hokh.setEnabled(true);
            txt_dckh.setEnabled(true);
            
            txt_sdtkh.setEnabled(true);            
            bt_addkh.setText("Xác nhận");
            reset();
            auto_increaseMaKh(); 
                          }
                         
    else {String regex = "^(09|02|07)[0-9]{8}$";if (!txt_sdtkh.getText().matches(regex)){JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ"); return ;}
        if (txt_kh.getText().length() != 0 && txt_tenkh.getText().length() != 0
            && txt_hokh.getText().length() != 0 && txt_dckh.getText().length() != 0
            && txt_sdtkh.getText().length() != 0) {
            bt_addkh.setText("Thêm");
            int k = JOptionPane.showConfirmDialog(null, "Xác nhận thêm", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                initData();
                return;
            }
            if (k==2)
            {
                bt_addkhActionPerformed(evt);
                return;
            }            
            KhachHangDTO kh = getText();
            Vector head = setVector(kh);
            int check = bus.themKh(kh);
            if(check == 1){
               model.addRow(head);
               tb_kh.setModel(model);
               txt_tenkh.setEnabled(false);
            txt_hokh.setEnabled(false);
            txt_dckh.setEnabled(false);
            
            txt_sdtkh.setEnabled(false); 
               JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{  JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");}                    
              }else{  JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
            }
                     
    


    }//GEN-LAST:event_bt_addkhActionPerformed

    private void tb_khMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_khMouseClicked
         int i = tb_kh.getSelectedRow();
        if(i>=0){
            txt_kh.setText(tb_kh.getModel().getValueAt(i, 0).toString());
            txt_tenkh.setText(tb_kh.getModel().getValueAt(i, 1).toString());
            txt_hokh.setText(tb_kh.getModel().getValueAt(i, 2).toString());
            txt_dckh.setText(tb_kh.getModel().getValueAt(i, 4).toString());
            
            txt_sdtkh.setText(tb_kh.getModel().getValueAt(i, 3).toString());   
        }
                               
    }//GEN-LAST:event_tb_khMouseClicked

    private void txt_findkhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_findkhKeyReleased
       String query = txt_findkh.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tb_kh.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_txt_findkhKeyReleased

    private void txt_sdtkhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sdtkhKeyReleased
            if(!checkNumber(txt_sdtkh.getText())){
            JOptionPane.showMessageDialog(null, "Sai định dạng số điện thoại");}
    }//GEN-LAST:event_txt_sdtkhKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton bt_addkh;
    private javax.swing.JButton bt_changekh;
    private javax.swing.JButton bt_resetkh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_dckh;
    private javax.swing.JLabel lb_findkh;
    private javax.swing.JLabel lb_hokh;
    private javax.swing.JLabel lb_kh;
    private javax.swing.JLabel lb_sdtkh;
    private javax.swing.JLabel lb_tenkh;
    private javax.swing.JPanel pn_dokh;
    private javax.swing.JPanel pn_findkh;
    private javax.swing.JPanel pn_ttkh;
    private javax.swing.JTable tb_kh;
    private javax.swing.JTextField txt_dckh;
    private javax.swing.JTextField txt_findkh;
    private javax.swing.JTextField txt_hokh;
    private javax.swing.JTextField txt_kh;
    private javax.swing.JTextField txt_sdtkh;
    private javax.swing.JTextField txt_tenkh;
    // End of variables declaration//GEN-END:variables
}
