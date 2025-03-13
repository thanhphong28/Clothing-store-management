
package GUI;


import java.awt.BorderLayout;
import java.io.FileOutputStream;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Vector;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;



import DTO.SanPhamDTO;
import BUS.SanPhamBUS;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.table.TableRowSorter;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import untils.CheckData;
import static untils.CheckData.checkNumber;

public class PanelSanPham extends javax.swing.JPanel {
    public static Object data[] = {"","",""};
    
    public static String tms,tncc,tml,tdg,tsl,ttl;
    DefaultTableModel model = new DefaultTableModel();
    SanPhamBUS bus=new SanPhamBUS();
    public static ArrayList<SanPhamDTO> arr = new ArrayList<SanPhamDTO>();  
    public PanelSanPham(Object inMa[]){
        initComponents();
        initData();
        initEvent();
        load();
        auto_increaseMaHang();
        model = (DefaultTableModel) tb_Sanpham.getModel();
      
        txt_ncc.setText((String) inMa[2]);
        txt_ml.setText((String) inMa[1]);
        txt_ms.setEnabled(false);
        txt_ts.setEnabled(true);
        txt_ts.setText(ttl);
        
        txt_dg.setEnabled(true);
        txt_dg.setText(tdg);
        txt_sl.setEnabled(true);
       txt_sl.setText(tsl);
        bt_ncc.setVisible(true);
        bt_ml.setVisible(true);
        bt_adds.setText("Xác nhận");
        
    }
    private void initEvent(){
    tb_Sanpham.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            try {
            SanPhamDTO sp = new SanPhamDTO();
            sp.setMaHang(arr.get(tb_Sanpham.getSelectedRow()).getMaHang());
            sp.setMaNcc(arr.get(tb_Sanpham.getSelectedRow()).getMaNcc());
            sp.setMaLoai(arr.get(tb_Sanpham.getSelectedRow()).getMaLoai());
            sp.setTenLoai(arr.get(tb_Sanpham.getSelectedRow()).getTenLoai());
            sp.setDonGia(arr.get(tb_Sanpham.getSelectedRow()).getDonGia());
            sp.setSoLuong(arr.get(tb_Sanpham.getSelectedRow()).getSoLuong());            
            }catch (Exception e) {
            }
        }
    });
    }
    




    public PanelSanPham() {
        initComponents();
        initData();
        load();
        bt_ml.setVisible(false);
        bt_ncc.setVisible(false);
        bt_resets1.setVisible(false);
       
    }
    private void initData(){
        txt_ms.setEnabled(false);
        txt_ncc.setEnabled(false);
        txt_ml.setEnabled(false);
        txt_ts.setEnabled(false);
        txt_dg.setEnabled(false);
        txt_sl.setEnabled(false);  
        bt_backs1.setVisible(false);
        
    }   
    public void load(){
    SanPhamBUS bus = new SanPhamBUS();       
        try{
           bus.docSp();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Lỗi kết nối đến Database.");
           return;
       }
       Vector header = new Vector();
        header.add("Mã sản phẩm");
        header.add("Mã nhà cung cấp");
        header.add("Mã loại");
        header.add("Tên hàng");
        header.add("Đơn giá");
        header.add("Số lượng");        
            model = new DefaultTableModel(header,0){
            public boolean isCellEditable(int row, int column)
                {
                  return false;
                }
       };	
       showOnTable(bus.list);
   
    }
    public void rs(){
        auto_increaseMaHang();
        txt_ncc.setText("");
            txt_ml.setText("");
            txt_ts.setText("");
            txt_dg.setText("0");
            txt_sl.setText("0"); 
            
        
    }
    public void bt(boolean a){
        bt_ml.setVisible(a);
        bt_ncc.setVisible(a);
    }
 private Vector setVector(SanPhamDTO sp){
        Vector row = new Vector();
        row.add(sp.getMaHang());
        row.add(sp.getMaNcc());
        row.add(sp.getMaLoai());
        row.add(sp.getTenLoai());
        row.add(sp.getDonGia());
        row.add(sp.getSoLuong());            
        return row;
    }    
  private void showOnTable(ArrayList<SanPhamDTO> list){
        model.setRowCount(0);
        for(SanPhamDTO sp:list){
           Vector data = setVector(sp);
           model.addRow(data);
       }
       tb_Sanpham.setModel(model);
    }
  public SanPhamDTO getText(){
        SanPhamDTO sp = new SanPhamDTO();
        sp.setMaHang(txt_ms.getText().trim());
        sp.setMaNcc(txt_ncc.getText().trim());                    
        sp.setTenLoai(txt_ts.getText().trim());
        sp.setMaLoai(txt_ml.getText().trim());
        sp.setDonGia(Double.parseDouble(txt_dg.getText().trim()));
        sp.setSoLuong(Integer.parseInt(txt_sl.getText().trim()));        
        return sp;
  }
  private void setModelValue(SanPhamDTO sp, int i){
        model.setValueAt(sp.getMaHang(),i,0);
        model.setValueAt(sp.getMaNcc(),i,1);
        model.setValueAt(sp.getMaLoai(),i,2);
        model.setValueAt(sp.getTenLoai(),i,3);
        model.setValueAt(sp.getDonGia(),i,4);     
        model.setValueAt(sp.getSoLuong(), i, 5);
        tb_Sanpham.setModel(model);            
    }
   public void auto_increaseMaHang(){
       int num=0;
       for(SanPhamDTO masp : bus.docSp() )
       {
           String masostr= masp.getMaHang().replace("HANG","");
           int maso=Integer.parseInt(masostr);
           if(maso - num == 2){
               
               break;
           }
           if(maso>num) num=maso;
       }
       String i = "HANG"+(num+1);
       txt_ms.setText(i);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_ttsp = new javax.swing.JPanel();
        lb_ms = new javax.swing.JLabel();
        txt_ms = new javax.swing.JTextField();
        lb_ts = new javax.swing.JLabel();
        txt_ts = new javax.swing.JTextField();
        lb_ml = new javax.swing.JLabel();
        txt_ml = new javax.swing.JTextField();
        lb_ncc = new javax.swing.JLabel();
        txt_ncc = new javax.swing.JTextField();
        lb_dg = new javax.swing.JLabel();
        txt_dg = new javax.swing.JTextField();
        bt_ncc = new javax.swing.JButton();
        lb_sl = new javax.swing.JLabel();
        txt_sl = new javax.swing.JTextField();
        bt_ml = new javax.swing.JButton();
        bt_resets1 = new javax.swing.JButton();
        pn_dos = new javax.swing.JPanel();
        bt_resets = new javax.swing.JButton();
        bt_changes = new javax.swing.JButton();
        bt_adds = new javax.swing.JButton();
        bt_dels = new javax.swing.JButton();
        pn_finds = new javax.swing.JPanel();
        txt_find = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lb_findsp = new javax.swing.JLabel();
        bt_find = new javax.swing.JButton();
        bt_backs1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Sanpham = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_backs = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 625));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_ttsp.setBackground(new java.awt.Color(255, 255, 255));
        pn_ttsp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N
        pn_ttsp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_ms.setText("Mã hàng:");
        pn_ttsp.add(lb_ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 26, -1, -1));

        txt_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_msActionPerformed(evt);
            }
        });
        pn_ttsp.add(txt_ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 23, 150, -1));

        lb_ts.setText("Tên hàng:");
        pn_ttsp.add(lb_ts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        pn_ttsp.add(txt_ts, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 150, -1));

        lb_ml.setText("Mã loại:");
        pn_ttsp.add(lb_ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        pn_ttsp.add(txt_ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, -1));

        lb_ncc.setText("Mã nhà cung cấp:");
        pn_ttsp.add(lb_ncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 20));
        pn_ttsp.add(txt_ncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 145, -1));

        lb_dg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_dg.setText("Đơn giá:");
        pn_ttsp.add(lb_dg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        txt_dg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dgKeyReleased(evt);
            }
        });
        pn_ttsp.add(txt_dg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 145, -1));

        bt_ncc.setText("...");
        bt_ncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_nccMouseClicked(evt);
            }
        });
        pn_ttsp.add(bt_ncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 24, -1));

        lb_sl.setText("Số lượng:");
        pn_ttsp.add(lb_sl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        txt_sl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_slKeyReleased(evt);
            }
        });
        pn_ttsp.add(txt_sl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 145, -1));

        bt_ml.setText("...");
        bt_ml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mlMouseClicked(evt);
            }
        });
        pn_ttsp.add(bt_ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 24, -1));

        bt_resets1.setBackground(new java.awt.Color(204, 204, 204));
        bt_resets1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resets1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_resets1MouseClicked(evt);
            }
        });
        bt_resets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resets1ActionPerformed(evt);
            }
        });
        pn_ttsp.add(bt_resets1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 85, 50, 40));

        jPanel1.add(pn_ttsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 630, 140));

        pn_dos.setBackground(new java.awt.Color(255, 255, 255));
        pn_dos.setBorder(javax.swing.BorderFactory.createTitledBorder("Thực hiện"));
        pn_dos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_resets.setBackground(new java.awt.Color(204, 204, 204));
        bt_resets.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_resets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        bt_resets.setText("Reset");
        bt_resets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetsActionPerformed(evt);
            }
        });
        pn_dos.add(bt_resets, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 118, 45));

        bt_changes.setBackground(new java.awt.Color(204, 204, 204));
        bt_changes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_changes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change.png"))); // NOI18N
        bt_changes.setText("Sửa");
        bt_changes.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_changes.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_changes.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_changes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changesActionPerformed(evt);
            }
        });
        pn_dos.add(bt_changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 118, 44));

        bt_adds.setBackground(new java.awt.Color(204, 204, 204));
        bt_adds.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_adds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        bt_adds.setText("Thêm");
        bt_adds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addsActionPerformed(evt);
            }
        });
        pn_dos.add(bt_adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 118, 45));

        bt_dels.setBackground(new java.awt.Color(204, 204, 204));
        bt_dels.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_dels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        bt_dels.setText("Xóa");
        bt_dels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_delsMouseClicked(evt);
            }
        });
        bt_dels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delsActionPerformed(evt);
            }
        });
        pn_dos.add(bt_dels, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 118, 45));

        jPanel1.add(pn_dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 370, 140));

        pn_finds.setBackground(new java.awt.Color(255, 255, 255));
        pn_finds.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        pn_finds.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_findActionPerformed(evt);
            }
        });
        txt_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_findKeyReleased(evt);
            }
        });
        pn_finds.add(txt_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 238, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hàng", "Tên hàng", "Mã loại", "Mã NCC" }));
        pn_finds.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, 40));

        lb_findsp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_findsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        lb_findsp.setText("Tìm kiếm:");
        pn_finds.add(lb_findsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 51));

        bt_find.setBackground(new java.awt.Color(204, 204, 204));
        bt_find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/find.png"))); // NOI18N
        bt_find.setText("Tìm kiếm");
        bt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findActionPerformed(evt);
            }
        });
        pn_finds.add(bt_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 250, 44));

        bt_backs1.setBackground(new java.awt.Color(204, 204, 204));
        bt_backs1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_backs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        bt_backs1.setText("Trở về");
        bt_backs1.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_backs1.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_backs1.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_backs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backs1ActionPerformed(evt);
            }
        });
        pn_finds.add(bt_backs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 110, 44));

        jPanel1.add(pn_finds, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 1000, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_Sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_Sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_SanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Sanpham);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 1000, 220));

        jPanel3.setBackground(new java.awt.Color(138, 170, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 370, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 60));

        bt_backs.setBackground(new java.awt.Color(204, 204, 204));
        bt_backs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_backs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        bt_backs.setText("Trở về");
        bt_backs.setMaximumSize(new java.awt.Dimension(65, 23));
        bt_backs.setMinimumSize(new java.awt.Dimension(65, 23));
        bt_backs.setPreferredSize(new java.awt.Dimension(65, 23));
        bt_backs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backsActionPerformed(evt);
            }
        });
        jPanel1.add(bt_backs, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 110, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 3, 1090, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_resetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetsActionPerformed
            txt_ncc.setText("");
            txt_ml.setText("");
            txt_ts.setText("");
            txt_dg.setText("");
            txt_sl.setText("");   
            txt_ms.setText("");
            txt_ncc.setEnabled(false);
            txt_ml.setEnabled(false);
            txt_ts.setEnabled(false);
            txt_dg.setEnabled(false);
            txt_sl.setEnabled(false); 
            txt_ms.setEnabled(false);
    }//GEN-LAST:event_bt_resetsActionPerformed
    public void reset(){
        txt_ms.setText("");
            txt_ncc.setText("");
            txt_ml.setText("");
            txt_ts.setText("");
            txt_dg.setText("0");
            txt_sl.setText("0"); 
            
            
    }
    private void bt_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changesActionPerformed
  if (bt_changes.getText().toString().equals("Sửa")) {
            
            txt_ms.setEnabled(false);      
            txt_ncc.setEnabled(false);
            txt_sl.setEnabled(true);
            txt_ml.setEnabled(false);            
            txt_dg.setEnabled(true); 
            txt_ts.setEnabled(true);
            
            bt_changes.setText("Xác nhận");}
  else{ 
      if (txt_ms.getText().length() != 0 && txt_ncc.getText().length() != 0
                && txt_ml.getText().length() != 0 && txt_ts.getText().length() != 0
                && txt_sl.getText().length() != 0 && txt_dg.getText().length() != 0) {
                bt_changes.setText("Sửa");    
            int i = tb_Sanpham.getSelectedRow();
            if(i>=0){
            int k = JOptionPane.showConfirmDialog(null, "Xác nhận sửa", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                
                initData();
                txt_ms.setEnabled(false);
            txt_ms.setEditable(false);
            txt_ncc.setEnabled(false);    
            txt_ml.setEnabled(false);
            txt_ts.setEnabled(false);
            txt_dg.setEnabled(false);
            txt_sl.setEnabled(false);
            System.out.print("123");
                return;
                
            }
            if (k==2)
            {
                bt_changesActionPerformed(evt);
                txt_ms.setEnabled(false);
            txt_ms.setEditable(false);
            txt_ncc.setEnabled(false);    
            txt_ml.setEnabled(false);
            txt_ts.setEnabled(false);
            txt_dg.setEnabled(false);
            txt_sl.setEnabled(false);
           
                return;
            }                     
                SanPhamDTO sp = getText();
                int check = bus.suaSp(sp,i);
                if(check == 1){
                    setModelValue(sp,i);
                    txt_ms.setEnabled(false);
            txt_ms.setEditable(false);
            txt_ncc.setEnabled(false);    
            txt_ml.setEnabled(false);
            txt_ts.setEnabled(false);
            txt_dg.setEnabled(false);
            txt_sl.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Sửa thành công");}
                }else{
                    JOptionPane.showMessageDialog(null, "Sửa thất bại");}                    
                }else{
                JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");}
  }        
    }//GEN-LAST:event_bt_changesActionPerformed

    private void tb_SanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_SanphamMouseClicked
      int i = tb_Sanpham.getSelectedRow();
        if(i>=0){
            txt_ms.setText(tb_Sanpham.getModel().getValueAt(i, 0).toString());
            txt_ncc.setText(tb_Sanpham.getModel().getValueAt(i, 1).toString());
            txt_ml.setText(tb_Sanpham.getModel().getValueAt(i, 2).toString());
            txt_ts.setText(tb_Sanpham.getModel().getValueAt(i, 3).toString());
            txt_dg.setText(tb_Sanpham.getModel().getValueAt(i, 4).toString());
            txt_sl.setText(tb_Sanpham.getModel().getValueAt(i, 5).toString());   
        }
    }//GEN-LAST:event_tb_SanphamMouseClicked

    private void bt_addsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addsActionPerformed
  if (bt_adds.getText().toString().equals("Thêm")) {
            txt_ms.setEnabled(false);
            txt_ms.setEditable(false);
            txt_ncc.setEnabled(false);    
            txt_ml.setEnabled(false);
            txt_ts.setEnabled(true);
            txt_dg.setEnabled(true);
            txt_sl.setEnabled(true);
            bt(true);
             auto_increaseMaHang();
             bt_resets1.setVisible(true);
            bt_adds.setText("Xác nhận");
            }
        else { bt_resets1.setVisible(false);
                  
        if (txt_ms.getText().length() != 0 && txt_ts.getText().length() != 0
            && txt_ml.getText().length() != 0 && txt_ncc.getText().length() != 0
            && txt_sl.getText().length() != 0 && txt_dg.getText().length() != 0) {
            bt_adds.setText("Thêm");
            int k = JOptionPane.showConfirmDialog(null, "Xác nhận thêm", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
            if (k==1)
            {
                initData();
                bt(false);
                bt_resets1.setVisible(false);
                return;
            }
            if (k==2)
            {
                bt_addsActionPerformed(evt);
                
                
                return;
            }            
            SanPhamDTO sp = getText();
            Vector head = setVector(sp);
            int check = bus.themSp(sp);
            if(check == 1){
               model.addRow(head);
               tb_Sanpham.setModel(model);
               txt_ms.setEnabled(false);
            txt_ms.setEditable(false);
            txt_ncc.setEnabled(false);    
            txt_ml.setEnabled(false);
            txt_ts.setEnabled(false);
            txt_dg.setEnabled(false);
            txt_sl.setEnabled(false);
            txt_ms.setText("");
            txt_ml.setText("");
            txt_ts.setText("");
            txt_dg.setText("");
            txt_sl.setText("");
            txt_ncc.setText("");
            bt_ml.setVisible(false);
            bt_ncc.setVisible(false);
           
               JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{  JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");}                    
              }else{  bt_resets1.setVisible(true);JOptionPane.showMessageDialog(null, "Bạn cần nhập đầy đủ thông tin vào bảng");
        if (txt_ms.getText().length() != 0 && txt_ts.getText().length() == 0
            && txt_ml.getText().length() == 0 && txt_ncc.getText().length() == 0
            && txt_sl.getText().length() == 0 && txt_dg.getText().length() == 0){reset();bt_adds.setText("Thêm");}
            }
    }
    }//GEN-LAST:event_bt_addsActionPerformed

    private void bt_nccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_nccMouseClicked
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new PanelNcc());
        this.validate();
        this.repaint();
        tms=txt_ms.getText();
        tncc=txt_ncc.getText();
        tml=txt_ml.getText();
        tdg=txt_dg.getText();
        tsl=txt_sl.getText();
        ttl=txt_ts.getText();
    }//GEN-LAST:event_bt_nccMouseClicked

    private void txt_slKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_slKeyReleased
        if(!checkNumber(txt_sl.getText())){
            JOptionPane.showMessageDialog(null,"Vui lòng chỉ nhập số");
        }
    }//GEN-LAST:event_txt_slKeyReleased

    private void txt_dgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dgKeyReleased
      if(!checkNumber(txt_dg.getText())){
            JOptionPane.showMessageDialog(null,"Vui lòng chỉ nhập số");
        }
    }//GEN-LAST:event_txt_dgKeyReleased

    private void txt_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_msActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_msActionPerformed

    private void bt_delsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_delsActionPerformed

    private void txt_findKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_findKeyReleased
//    String query = txt_find.getText();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
//        tb_Sanpham.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(query)); 
    }//GEN-LAST:event_txt_findKeyReleased

    private void bt_delsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_delsMouseClicked
        int selectedRow = tb_Sanpham.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }


    SanPhamDTO sp = bus.docSp().get(selectedRow);

   
        int deleteSuccess = bus.xoaSp(sp.getMaHang());
    if (deleteSuccess == 0) {
       
        JOptionPane.showMessageDialog(this, "Xóa dữ liệu không thành công!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        return;
    } else {JOptionPane.showMessageDialog(null,"Xóa thành công!");}

  
    model.removeRow(selectedRow);

   
    arr.remove(sp);

   
    for (int i = selectedRow; i < arr.size(); i++) {
        model.setValueAt(i + 1, i, 0);
    }
    initData();
    }//GEN-LAST:event_bt_delsMouseClicked

    private void txt_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_findActionPerformed

    private void bt_mlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mlMouseClicked
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new PanelLoaiSanPham());
        this.validate();
        this.repaint();
        tms=txt_ms.getText();
        tncc=txt_ncc.getText();
        tml=txt_ml.getText();
        tdg=txt_dg.getText();
        tsl=txt_sl.getText();
        ttl=txt_ts.getText();
    }//GEN-LAST:event_bt_mlMouseClicked

    private void bt_resets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resets1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_resets1ActionPerformed

    private void bt_resets1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_resets1MouseClicked
    rs();
    }//GEN-LAST:event_bt_resets1MouseClicked

    private void bt_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_findActionPerformed
String[] header = {"Mã sản phẩm", "Nhà cung cấp","Mã loại","Tên loại","Đơn giá","Số lượng"};
        DefaultTableModel modelsearch = new DefaultTableModel(header, 0);
        ArrayList<SanPhamDTO> tl;
        
            tl = bus.timkiem(String.valueOf(jComboBox1.getSelectedItem()), txt_find.getText().toLowerCase().trim());
        if (tl.size() != 0) {
            for (int i = 0; i < tl.size(); i++) {
                Object[] row = {tl.get(i).getMaHang(), tl.get(i).getMaNcc(),tl.get(i).getMaLoai(),tl.get(i).getTenLoai(),tl.get(i).getDonGia(),tl.get(i).getSoLuong()};
                modelsearch.addRow(row);
            }
            

            tb_Sanpham.setModel(modelsearch);
            bt_backs1.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Không có kết quả phù hợp!");
        }
    }//GEN-LAST:event_bt_findActionPerformed

    private void bt_backsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backsActionPerformed

        tb_Sanpham.setModel(model);
        bt_backs.setVisible(false);
    }//GEN-LAST:event_bt_backsActionPerformed

    private void bt_backs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backs1ActionPerformed
        bt_backs1.setVisible(false);
        tb_Sanpham.setModel(model);
        initData();
    }//GEN-LAST:event_bt_backs1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adds;
    private javax.swing.JButton bt_backs;
    private javax.swing.JButton bt_backs1;
    private javax.swing.JButton bt_changes;
    private javax.swing.JButton bt_dels;
    private javax.swing.JButton bt_find;
    private javax.swing.JButton bt_ml;
    private javax.swing.JButton bt_ncc;
    private javax.swing.JButton bt_resets;
    private javax.swing.JButton bt_resets1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_dg;
    private javax.swing.JLabel lb_findsp;
    private javax.swing.JLabel lb_ml;
    private javax.swing.JLabel lb_ms;
    private javax.swing.JLabel lb_ncc;
    private javax.swing.JLabel lb_sl;
    private javax.swing.JLabel lb_ts;
    private javax.swing.JPanel pn_dos;
    private javax.swing.JPanel pn_finds;
    private javax.swing.JPanel pn_ttsp;
    private javax.swing.JTable tb_Sanpham;
    public static javax.swing.JTextField txt_dg;
    private javax.swing.JTextField txt_find;
    public static javax.swing.JTextField txt_ml;
    public static javax.swing.JTextField txt_ms;
    public static javax.swing.JTextField txt_ncc;
    public static javax.swing.JTextField txt_sl;
    public static javax.swing.JTextField txt_ts;
    // End of variables declaration//GEN-END:variables


}
