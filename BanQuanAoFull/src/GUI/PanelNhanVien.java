
package GUI;

import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelNhanVien extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    NhanVienBUS bus = new NhanVienBUS();
    ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();    
    public PanelNhanVien() {
        initComponents();
        initData();
        initEvent();
        load();
        model = (DefaultTableModel) tb_nv.getModel();
    }
    private void initEvent() {
        tb_nv.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            try {
            NhanVienDTO nv = new NhanVienDTO();
            nv.setMaNV(arr.get(tb_nv.getSelectedRow()).getMaNV());
            nv.setHoNV(arr.get(tb_nv.getSelectedRow()).getHoNV());
            nv.setTenNV(arr.get(tb_nv.getSelectedRow()).getTenNV());
            nv.setDiaChiNV(arr.get(tb_nv.getSelectedRow()).getDiaChiNV());
            nv.setChucVuNV(arr.get(tb_nv.getSelectedRow()).getChucVuNV());
            nv.setLuong(arr.get(tb_nv.getSelectedRow()).getLuong());            
            }catch (Exception e) {
            }
        }
        });
    }    
    private void initData(){
        txt_nv.setEnabled(false);
        txt_tennv.setEnabled(false);
        txt_honv.setEnabled(false);
        txt_dcnv.setEnabled(false);
        txt_luong.setEnabled(false);        
        cb_cv.setEnabled(false);
    }
    public NhanVienDTO getText(){
        NhanVienDTO nv = new NhanVienDTO();
        nv.setMaNV(txt_nv.getText().trim());
        nv.setHoNV(txt_honv.getText().trim());                    
        nv.setTenNV(txt_tennv.getText().trim());
        nv.setDiaChiNV(txt_dcnv.getText().trim());
        nv.setChucVuNV(cb_cv.getSelectedItem().toString());
        nv.setLuong(Double.parseDouble(txt_luong.getText().trim()));        
        return nv;
    }
    private void load(){
        NhanVienBUS bus = new NhanVienBUS();       
        try{
           bus.docNv();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
           return;
       }
       Vector header = new Vector();
        header.add("Mã nhân viên");
        header.add("Họ nhân viên");
        header.add("Tên nhân viên");
        header.add("Địa chỉ");
        header.add("Chức vụ");
        header.add("Lương nhân viên");        
            model = new DefaultTableModel(header,0){
            public boolean isCellEditable(int row, int column)
                {
                  return false;
                }
       };	
       showOnTable(bus.list);
    }
    private Vector setVector(NhanVienDTO nv){
        Vector row = new Vector();
        row.add(nv.getMaNV());
        row.add(nv.getHoNV());
        row.add(nv.getTenNV());
        row.add(nv.getDiaChiNV());
        row.add(nv.getChucVuNV());
        row.add(nv.getLuong());            
        return row;
    }    
    private void showOnTable(ArrayList<NhanVienDTO> list){
        model.setRowCount(0);
        for(NhanVienDTO nv:list){
           Vector data = setVector(nv);
           model.addRow(data);
       }
       tb_nv.setModel(model);
    }
    private void setModelValue(NhanVienDTO nv, int i){
        model.setValueAt(nv.getMaNV(),i,0);
        model.setValueAt(nv.getHoNV(),i,1);
        model.setValueAt(nv.getTenNV(),i,2);
        model.setValueAt(nv.getDiaChiNV(),i,3);
        model.setValueAt(nv.getChucVuNV(),i,4);     
        model.setValueAt(nv.getLuong(), i, 5);
        tb_nv.setModel(model);            
    }
   public void auto_increaseMaNv(){
        String i = null;
        NhanVienDTO nv= bus.docNv().get(bus.docNv().size()-1);
        String b="00";
        String c="0";
        int a= Integer.parseInt(nv.getMaNV().substring(2,5));
        a++;
        if(a<10){ i="NV"+b+a; }
        if(10<=a && a<=99) {  i ="NV"+c+a; }
        if(a>100){  i="NV"+a; }
        txt_nv.setText(i);
    } 
   public void reset(){
        txt_nv.setText("");
        txt_tennv.setText("");
        txt_honv.setText("");
        txt_dcnv.setText("");
        txt_luong.setText("");            
        cb_cv.setSelectedItem("");       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pn_ttnv = new javax.swing.JPanel();
        lb_nv = new javax.swing.JLabel();
        txt_nv = new javax.swing.JTextField();
        lb_honv = new javax.swing.JLabel();
        txt_honv = new javax.swing.JTextField();
        lb_dcnv = new javax.swing.JLabel();
        txt_dcnv = new javax.swing.JTextField();
        lb_cvunv = new javax.swing.JLabel();
        lb_tennv = new javax.swing.JLabel();
        txt_tennv = new javax.swing.JTextField();
        cb_cv = new javax.swing.JComboBox<>();
        lb_luong = new javax.swing.JLabel();
        txt_luong = new javax.swing.JTextField();
        pn_donv = new javax.swing.JPanel();
        bt_addnv = new javax.swing.JButton();
        bt_resetnv = new javax.swing.JButton();
        bt_change = new javax.swing.JButton();
        pn_findnv = new javax.swing.JPanel();
        txt_findnv = new javax.swing.JTextField();
        lb_findnv = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_nv = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_ttnv.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttnv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N
        pn_ttnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_nv.setText("Mã nhân viên:");
        pn_ttnv.add(lb_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 26, -1, -1));
        pn_ttnv.add(txt_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 23, 100, -1));

        lb_honv.setText("Họ nhân viên:");
        pn_ttnv.add(lb_honv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));
        pn_ttnv.add(txt_honv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, -1));

        lb_dcnv.setText("Địa chỉ:");
        pn_ttnv.add(lb_dcnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));
        pn_ttnv.add(txt_dcnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 350, -1));

        lb_cvunv.setText("Chức vụ:");
        pn_ttnv.add(lb_cvunv, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        lb_tennv.setText("Tên nhân viên:");
        pn_ttnv.add(lb_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));
        pn_ttnv.add(txt_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 116, -1));

        cb_cv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));
        pn_ttnv.add(cb_cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 106, 30));

        lb_luong.setText("Lương:");
        pn_ttnv.add(lb_luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        pn_ttnv.add(txt_luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 103, -1));

        jPanel2.add(pn_ttnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 110));

        pn_donv.setBackground(new java.awt.Color(255, 255, 255));
        pn_donv.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));
        pn_donv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_addnv.setBackground(new java.awt.Color(204, 204, 204));
        bt_addnv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_addnv.setText("Thêm");
        bt_addnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addnvActionPerformed(evt);
            }
        });
        pn_donv.add(bt_addnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 40));

        bt_resetnv.setBackground(new java.awt.Color(204, 204, 204));
        bt_resetnv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resetnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resetnv.setText("Đặt lại");
        bt_resetnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetnvActionPerformed(evt);
            }
        });
        pn_donv.add(bt_resetnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 40));

        bt_change.setBackground(new java.awt.Color(204, 204, 204));
        bt_change.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_change.setText("Sửa");
        bt_change.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_change.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_change.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changeActionPerformed(evt);
            }
        });
        pn_donv.add(bt_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 100, 40));

        jPanel2.add(pn_donv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 530, 80));

        pn_findnv.setBackground(new java.awt.Color(255, 255, 255));
        pn_findnv.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        pn_findnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_findnv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_findnvKeyReleased(evt);
            }
        });
        pn_findnv.add(txt_findnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 290, 40));

        lb_findnv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_findnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        lb_findnv.setText("Tìm kiếm:");
        pn_findnv.add(lb_findnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 40));

        jPanel2.add(pn_findnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 540, 80));

        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_nv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_nvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_nv);

        panel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 400));

        jPanel2.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1070, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resetnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetnvActionPerformed
        reset();
    }//GEN-LAST:event_bt_resetnvActionPerformed

    private void bt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changeActionPerformed
    if (bt_change.getText().toString().equals("Sửa")) {
            txt_tennv.setEnabled(true);
            txt_honv.setEnabled(true);
            txt_dcnv.setEnabled(true);
            txt_luong.setEnabled(true);            
            cb_cv.setEnabled(true); 
            bt_change.setText("Xác nhận");}
    else {
        if (txt_nv.getText().length() != 0 && txt_tennv.getText().length() != 0
                && txt_honv.getText().length() != 0 && txt_dcnv.getText().length() != 0
                && txt_luong.getText().length() != 0) {
                bt_change.setText("Sửa");    
            int i = tb_nv.getSelectedRow();
            if(i>=0){
            int k = JOptionPane.showConfirmDialog(null, "Xác nhận", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                initData();
                return;
            }
            if (k==2)
            {
                bt_changeActionPerformed(evt);
                return;
            }                     
                NhanVienDTO nv = getText();
                int check = bus.suaNv(nv,i);
                if(check == 1){
                    setModelValue(nv,i);
                    JOptionPane.showMessageDialog(null, "Sửa thành công");}
                }else{
                    JOptionPane.showMessageDialog(null, "Sửa thất bại");}                    
                }else{
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
            }
    }//GEN-LAST:event_bt_changeActionPerformed

    private void txt_findnvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_findnvKeyReleased
        String query = txt_findnv.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tb_nv.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_txt_findnvKeyReleased

    private void bt_addnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addnvActionPerformed
    if (bt_addnv.getText().toString().equals("Thêm")) {
            txt_nv.setEnabled(true);
            txt_nv.setEditable(false);
            txt_tennv.setEnabled(true);
            txt_honv.setEnabled(true);
            txt_dcnv.setEnabled(true);
            cb_cv.setEnabled(true);
            txt_luong.setEnabled(true);            
            bt_addnv.setText("Xác nhận");
            reset();}
    else {
        if (txt_nv.getText().length() != 0 && txt_tennv.getText().length() != 0
            && txt_honv.getText().length() != 0 && txt_dcnv.getText().length() != 0
            && txt_luong.getText().length() != 0) {
            bt_addnv.setText("Thêm");
            int k = JOptionPane.showConfirmDialog(null, "Xác nhận thêm", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                initData();
                return;
            }
            if (k==2)
            {
                bt_addnvActionPerformed(evt);
                return;
            }            
            NhanVienDTO nv = getText();
            Vector head = setVector(nv);
            int check = bus.themNv(nv);
            if(check == 1){
               model.addRow(head);
               tb_nv.setModel(model);
               
               JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{  JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");}                    
              }else{  JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
            }
     auto_increaseMaNv();
    }//GEN-LAST:event_bt_addnvActionPerformed

    private void tb_nvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_nvMouseClicked
        int i = tb_nv.getSelectedRow();
        if(i>=0){
            txt_nv.setText(tb_nv.getModel().getValueAt(i, 0).toString());
            txt_tennv.setText(tb_nv.getModel().getValueAt(i, 1).toString());
            txt_honv.setText(tb_nv.getModel().getValueAt(i, 2).toString());
            txt_dcnv.setText(tb_nv.getModel().getValueAt(i, 3).toString());
            cb_cv.setSelectedItem(tb_nv.getModel().getValueAt(i, 4).toString());
            txt_luong.setText(tb_nv.getModel().getValueAt(i, 5).toString());   
        }
    }//GEN-LAST:event_tb_nvMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addnv;
    private javax.swing.JButton bt_change;
    private javax.swing.JButton bt_resetnv;
    private javax.swing.JComboBox<String> cb_cv;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_cvunv;
    private javax.swing.JLabel lb_dcnv;
    private javax.swing.JLabel lb_findnv;
    private javax.swing.JLabel lb_honv;
    private javax.swing.JLabel lb_luong;
    private javax.swing.JLabel lb_nv;
    private javax.swing.JLabel lb_tennv;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel pn_donv;
    private javax.swing.JPanel pn_findnv;
    private javax.swing.JPanel pn_ttnv;
    private javax.swing.JTable tb_nv;
    private javax.swing.JTextField txt_dcnv;
    private javax.swing.JTextField txt_findnv;
    private javax.swing.JTextField txt_honv;
    private javax.swing.JTextField txt_luong;
    private javax.swing.JTextField txt_nv;
    private javax.swing.JTextField txt_tennv;
    // End of variables declaration//GEN-END:variables
}
