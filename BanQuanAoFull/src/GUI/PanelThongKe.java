
package GUI;

import BUS.ChiTietHoaDonBUS;
import BUS.ChiTietPhieuNhapBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import BUS.PhieuNhapBUS;
import DTO.ChiTietHoaDonDTO;
import DTO.ChiTietPhieuNhapDTO;
import DTO.HoaDonDTO;
import DTO.NhanVienDTO;
import DTO.PhieuNhapDTO;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.BaseFont;
import static com.itextpdf.kernel.pdf.PdfName.Font;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.pdfa.PdfADocument;
import java.awt.Font;
import java.awt.geom.Area;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import jdk.nashorn.internal.objects.NativeDate;

public class PanelThongKe extends javax.swing.JPanel {
    HoaDonBUS bushd=new HoaDonBUS();
    NhanVienBUS busnv=new NhanVienBUS();
    KhachHangBUS buskh=new KhachHangBUS();
    ChiTietHoaDonBUS buscthd=new ChiTietHoaDonBUS();
    PhieuNhapBUS buspn=new PhieuNhapBUS();
    ChiTietPhieuNhapBUS busctpn=new ChiTietPhieuNhapBUS();
    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    
    
    public PanelThongKe() {
        initComponents();
        initReady();
        model=(DefaultTableModel) tb.getModel();
        model1=(DefaultTableModel) tb1.getModel();
        model2=(DefaultTableModel) tb2.getModel();
    }
    public void initReady(){
        txtc.setEditable(false);
        txln.setEditable(false);
        txlk.setEditable(false);
        txdt.setEditable(false);
        txkhmax.setEditable(false);
        txspmax1.setEditable(false);
        txspmax2.setEditable(false);
        txslmax.setEditable(false);
        txslmax1.setEditable(false);
        txslmax2.setEditable(false);
    }
        public String getQuy()
    {
        if (cb1.isSelected()) return "Kết quả doanh thu quý 1";
        else if (cb2.isSelected()) return "Kết quả doanh thu quý 2";
        else if (cb3.isSelected()) return "Kết quả doanh thu quý 3";
        return "Kết quả doanh thu quý 4";
    }
    public String getNgay()
    {
        return "business results from "+txdate1+" to "+txdate2;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnthongke = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txdate1 = new com.toedter.calendar.JDateChooser();
        txdate2 = new com.toedter.calendar.JDateChooser();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        txyear = new com.toedter.calendar.JYearChooser();
        btn_export = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txlk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txln = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        }
        ;
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        }
        ;
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable(){
            public boolean isCellEditable ( int row, int col)
            {
                return false;
            }
        };
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txkhmax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txslmax = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txspmax1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txslmax1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txspmax2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txslmax2 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Từ ngày :");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 7, 105, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Đến ngày :");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 7, 111, 33));

        btnthongke.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnthongke.setText("Thống kê");
        btnthongke.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnthongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthongkeActionPerformed(evt);
            }
        });
        jPanel2.add(btnthongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 93, 127, 35));

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnreset.setText("Reset");
        btnreset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel2.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 93, 127, 34));

        txdate1.setDateFormatString("yyyy-MM-dd");
        txdate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txdate1FocusLost(evt);
            }
        });
        txdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txdate1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txdate1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txdate1MouseReleased(evt);
            }
        });
        txdate1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txdate1InputMethodTextChanged(evt);
            }
        });
        txdate1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txdate1PropertyChange(evt);
            }
        });
        jPanel2.add(txdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 7, 157, 33));

        txdate2.setDateFormatString("yyyy-MM-dd");
        txdate2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txdate2FocusLost(evt);
            }
        });
        txdate2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txdate2InputMethodTextChanged(evt);
            }
        });
        txdate2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txdate2PropertyChange(evt);
            }
        });
        jPanel2.add(txdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 7, 157, 33));

        cb1.setBackground(new java.awt.Color(138, 170, 229));
        buttonGroup1.add(cb1);
        cb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb1.setText("QUÝ I");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel2.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 58, 75, 25));

        cb2.setBackground(new java.awt.Color(138, 170, 229));
        buttonGroup1.add(cb2);
        cb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb2.setText("QUÝ II");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel2.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 58, 70, 25));

        cb3.setBackground(new java.awt.Color(138, 170, 229));
        buttonGroup1.add(cb3);
        cb3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb3.setText("QUÝ III");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        jPanel2.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 61, -1, -1));

        cb4.setBackground(new java.awt.Color(138, 170, 229));
        buttonGroup1.add(cb4);
        cb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb4.setText("QUÝ IIII");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        jPanel2.add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 61, -1, -1));
        jPanel2.add(txyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 61, 57, -1));

        btn_export.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_export.setText("Export PDF");
        btn_export.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exportMouseClicked(evt);
            }
        });
        jPanel2.add(btn_export, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 93, 121, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 940, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lượt khách :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 78, 27));

        txlk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txlk, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 9, 76, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tổng chi : ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 6, 77, 24));

        txtc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 6, 129, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Doanh thu : ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 6, 89, 27));

        txdt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 6, 123, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Lợi nhuận : ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 6, 77, 27));

        txln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txln, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, 114, 27));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 201, 1050, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tổng Tiền Mua"
            }
        ));
        jScrollPane1.setViewportView(tb);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 299, 249));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Số Lượng"
            }
        ));
        jScrollPane2.setViewportView(tb1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 300, 249));

        jPanel5.setBackground(new java.awt.Color(138, 170, 229));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("KHÁCH HÀNG");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(138, 170, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SẢN PHẨM MUA VÀO");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 300, -1));

        jPanel7.setBackground(new java.awt.Color(138, 170, 229));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SẢN PHẨM BÁN RA");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 300, 40));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Số lượng"
            }
        ));
        jScrollPane3.setViewportView(tb2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 300, 249));

        jPanel8.setBackground(new java.awt.Color(138, 170, 229));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Khách mua nhiều nhất : ");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, 21));

        txkhmax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(txkhmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 7, 139, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tổng tiền mua:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 37, 140, -1));

        txslmax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(txslmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 34, 139, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 299, 70));

        jPanel9.setBackground(new java.awt.Color(138, 170, 229));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sản phẩm mua vào nhiều nhất :");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, -1, -1));

        txspmax1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel9.add(txspmax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 7, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Số lượng : ");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 37, 183, -1));

        txslmax1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel9.add(txslmax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 34, 90, -1));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 300, 70));

        jPanel10.setBackground(new java.awt.Color(138, 170, 229));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sản phẩm bán chạy nhất :");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, 21));

        txspmax2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(txspmax2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 7, 133, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Số lượng : ");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 37, 150, -1));

        txslmax2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(txslmax2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 34, 133, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 300, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1050, 370));

        jPanel11.setBackground(new java.awt.Color(138, 170, 229));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ THỐNG KÊ");
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 360, 60));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 618));
    }// </editor-fold>//GEN-END:initComponents

    private void btnthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthongkeActionPerformed
      if((txdate1.getDate() == null) || (txdate2.getDate() ==null) ){
          JOptionPane.showMessageDialog(null, "Chưa nhập đủ dữ liệu!");
          return;
      }
        tb.setVisible(true);
      tb1.setVisible(true);
      tb2.setVisible(true);
      showsearchngay(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
      tongthu(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
      tongchi();
      loinhuan();
      showkh(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
      showhoadon(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
      showphieunhap(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
      maxkh(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
      maxhd(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));       
      maxpn(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
    }//GEN-LAST:event_btnthongkeActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    txdate1.setDate(null);
    txdate2.setDate(null);
    txlk.setText("");
    txtc.setText("");
    txdt.setText("");
    txln.setText("");
    txkhmax.setText("");
    txslmax.setText("");
    txspmax1.setText("");
    txslmax1.setText("");
    txspmax2.setText("");
    txslmax2.setText("");
    tb.setVisible(false);
    tb1.setVisible(false);
    tb2.setVisible(false);
    }//GEN-LAST:event_btnresetActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        String year=String.valueOf(txyear.getYear());
        if(cb1.isSelected()){
            try {
                txdate1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-1-1"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            try {
                txdate2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-3-31"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        String year =String.valueOf(txyear.getYear());
        if(cb2.isSelected()){
            try {
                txdate1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-4-1"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            try {
                txdate2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-6-30"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        String year =String.valueOf(txyear.getYear());
        if(cb3.isSelected()){
            try {
                txdate1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-7-1"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            try {
                txdate2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-9-30"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        String year =String.valueOf(txyear.getYear());
        if(cb4.isSelected()){
            try {
                txdate1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-10-1"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            try {
                txdate2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-12-31"));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cb4ActionPerformed

    private void btn_exportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exportMouseClicked
       if (txlk.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn điều kiện thống kê trước.");}
        else {
            PdfWriter writer = null;
            try {
                writer = new PdfWriter("./Xuatfile/thongke.pdf");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PanelThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            PdfDocument pdfDoc = new PdfDocument(writer);
            pdfDoc.addNewPage();
            PdfFont font = null;
            try {
                font = PdfFontFactory.createFont("times.ttf");
            } catch (IOException ex) {
                Logger.getLogger(PanelThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            Document doc = new Document(pdfDoc);
            //Chèn tiêu đề
            String tittle = "TRADING REPORT";
            Paragraph title = new Paragraph(tittle);
            title.setFont(font);
            title.setFontSize(30);
            title.setTextAlignment(TextAlignment.CENTER);
            doc.add(title);
            //chèn ngày
            //java.util.Date date=new java.util.Date();
            //String timee = date.toString();
            //Paragraph time = new Paragraph(timee);
            //doc.add(time);
            //time.setTextAlignment(TextAlignment.RIGHT);
            //Chèn khoảng thống kê
            Paragraph tgian;
            if (cb1.isSelected() || cb2.isSelected() || cb3.isSelected() || cb4.isSelected()) tgian = new Paragraph(getQuy());
            else tgian=new Paragraph(getNgay());
            tgian.setFont(font);
            tgian.setFontSize(20);
            tgian.setBold();
            doc.add(tgian);
            //Chèn dòng tổng
            String Tong = "Total: ";
            String TK = "Total Customers : ";
            Paragraph TongKhach = new Paragraph(TK+txlk.getText());
            String TC = "Total Expenditure: ";
            Paragraph TongChi = new Paragraph(TC+txtc.getText());
            String TT = "Total Revenue: ";
            Paragraph TongThu = new Paragraph(TT+txdt.getText());
            String LN = "Total Profit: ";
            Paragraph LoiNhuan = new Paragraph(LN+txln.getText());
            doc.add(TongKhach);
            doc.add(TongThu);
            doc.add(TongChi);
            doc.add(LoiNhuan);
            //Chèn bảng khách hàng
            String KH= "Customer statistics table";
            Paragraph KhachHang = new Paragraph(KH);
            float [] width = {225F, 225F};
            Table table = new Table(2);
            Cell title1 = new Cell();
            title1.add("Customer ID");
            table.addCell(title1);
            Cell title2 = new Cell();
            title2.add("Total purchase");
            table.addCell(title2);
            int n = tb.getRowCount();
            for (int i=1; i<n; i++)
            {
                String str = tb.getValueAt(i, 0).toString();
Cell cell1 = new Cell();
                cell1.add(str);
                table.addCell(cell1);
                str = tb.getValueAt(i, 1).toString();
                Cell cell2 = new Cell();
                cell2.add(str);
                table.addCell(cell2);
            }
            doc.add(KhachHang);
            doc.add(table);
            //AreaBreak ar = new AreaBreak();
            //doc.add(ar);
            //Chèn bảng mua vào
            String MV= "Statistics of quantities purchased table";
            Paragraph MuaVao = new Paragraph(MV);
            Table table1 = new Table(width);
            Cell title11 = new Cell();
            title11.add("Product ID");
            table1.addCell(title11);
            Cell title12 = new Cell();
            title12.add("Number");
            table1.addCell(title12);
            int n1 = tb1.getRowCount();
            for (int i=1; i<n1; i++)
            {
                String str = tb1.getValueAt(i, 0).toString();
                Cell cell1 = new Cell();
                cell1.add(str);
                table1.addCell(cell1);
                str = tb1.getValueAt(i, 1).toString();
                Cell cell2 = new Cell();
                cell2.add(str);
                table1.addCell(cell2);
            }
            doc.add(MuaVao);
            doc.add(table1);
            //Chèn bảng bán ra
            String BR= "Statistics of quantity sold table";
            Paragraph BanRa = new Paragraph(BR);
            Table table2 = new Table(width);
            Cell title21 = new Cell();
            title21.add("Product ID");
            table2.addCell(title21);
            Cell title22 = new Cell();
            title22.add("Number");
            table2.addCell(title22);
            int n2 = tb1.getRowCount();
            for (int i=1; i<n2; i++)
            {
                String str = tb2.getValueAt(i, 0).toString();
                Cell cell1 = new Cell();
                cell1.add(str);
                table2.addCell(cell1);
                str = tb2.getValueAt(i, 1).toString();
                Cell cell2 = new Cell();
                cell2.add(str);
                table2.addCell(cell2);
            }
            doc.add(BanRa);
            doc.add(table2);
            doc.close();
            JOptionPane.showMessageDialog(null, "Xuất file thành công.");
        }
    }//GEN-LAST:event_btn_exportMouseClicked

    private void txdate1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txdate1InputMethodTextChanged
        
        
    }//GEN-LAST:event_txdate1InputMethodTextChanged

    private void txdate2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txdate2InputMethodTextChanged
       
    }//GEN-LAST:event_txdate2InputMethodTextChanged

    private void txdate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txdate1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txdate1MouseExited

    private void txdate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txdate1MouseClicked
        
    }//GEN-LAST:event_txdate1MouseClicked

    private void txdate1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txdate1PropertyChange

        
    }//GEN-LAST:event_txdate1PropertyChange

    private void txdate2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txdate2PropertyChange
        
        
       
    }//GEN-LAST:event_txdate2PropertyChange

    private void txdate1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txdate1FocusLost
      
    }//GEN-LAST:event_txdate1FocusLost

    private void txdate2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txdate2FocusLost
        
    }//GEN-LAST:event_txdate2FocusLost

    private void txdate1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txdate1MouseReleased
      
    }//GEN-LAST:event_txdate1MouseReleased

    public void showkh(String from , String to){
        model.setRowCount(0);
        for(HoaDonDTO hd:bushd.timtheoNgay(from, to)){
            model.addRow(new Object[]{
           hd.getMaKh(),hd.getThanhTienHd()
            });
        }
    }
    public void showhoadon(String from,String to){
        model2.setRowCount(0);
        for(HoaDonDTO hd : bushd.timtheoNgay(from, to)){
            for(ChiTietHoaDonDTO cthd:buscthd.docCTHD()){
                if(hd.getMaHd().equals(cthd.getMaHd())){

                   model2.addRow(new Object[]{
                   cthd.getMaHang(),cthd.getSoLuong()
                   });
                }
            }
        }
    }
    public void showphieunhap(String from ,String to){
        model1.setRowCount(0);
       for(PhieuNhapDTO pn:buspn.timTheoNgay(from, to)) {
        for(ChiTietPhieuNhapDTO ctpn:busctpn.docCTPN()){
            if(pn.getMaPN().equals(ctpn.getMaPN())){

                   model1.addRow(new Object[]{
                   ctpn.getMaHang(),ctpn.getSoLuong()
                   });
                }
            }
        }
    }
    public long tongchi(){
        long luong=0;
        for(NhanVienDTO nv: busnv.docNv()){
            luong+=nv.getLuong()*3;
        }
        txtc.setText(String.valueOf(luong));
        return luong;
    }
    public int showsearchngay(String from ,String to){
        int i=0;
        for(HoaDonDTO hd: bushd.timtheoNgay(from, to)){
            i++;
        }
        txlk.setText(String.valueOf(i));
        return i;
    }
    public long tongthu(String from,String to){
        long S=0;
        for(HoaDonDTO hd: bushd.timtheoNgay(from, to)){
           
           S+=hd.getThanhTienHd();
        }
       txdt.setText(String.valueOf(S));
       return S;
    }
    public long loinhuan(){
        long thunhap = tongthu(new SimpleDateFormat("yyyy-MM-dd").format(txdate1.getDate()), new SimpleDateFormat("yyyy-MM-dd").format(txdate2.getDate()));
        long chi = tongchi();
        long loinhuan = thunhap-chi;
        txln.setText(String.valueOf(loinhuan));
        return loinhuan;
    }
   
    public void maxkh(String from,String to){
         double maxkhh=0;
          for(HoaDonDTO hd: bushd.timtheoNgay(from, to)){
           for(ChiTietHoaDonDTO cthd : buscthd.docCTHD()){
                   if(hd.getMaHd().equals(cthd.getMaHd())){
                      if(hd.getThanhTienHd()>maxkhh){
                          maxkhh=hd.getThanhTienHd();
                          txkhmax.setText(hd.getMaKh());}
                       }
                    }
           }
          txslmax.setText(String.valueOf(maxkhh));
     }
    public void maxhd(String from,String to){
         int maxhd=0;
          for(HoaDonDTO hd: bushd.timtheoNgay(from, to)){
           for(ChiTietHoaDonDTO cthd : buscthd.docCTHD()){
                   if(hd.getMaHd().equals(cthd.getMaHd())){
                      if(cthd.getSoLuong()>maxhd){
                          maxhd=cthd.getSoLuong();
                          txspmax2.setText(cthd.getMaHang());
                        }
                    }
                }
           }
        txslmax2.setText(String.valueOf(maxhd));
    }
       public void maxpn(String from,String to){
         int maxpn=0;
          for(PhieuNhapDTO pn: buspn.timTheoNgay(from, to)){
           for(ChiTietPhieuNhapDTO ctpn : busctpn.docCTPN()){
                   if(pn.getMaPN().equals(ctpn.getMaPN())){
                      if(ctpn.getSoLuong()>maxpn){
                          maxpn=ctpn.getSoLuong();
                          txspmax1.setText(ctpn.getMaHang());
                        }
                    }
                }
           }
          txslmax1.setText(String.valueOf(maxpn));
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_export;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnthongke;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private com.toedter.calendar.JDateChooser txdate1;
    private com.toedter.calendar.JDateChooser txdate2;
    private javax.swing.JTextField txdt;
    private javax.swing.JTextField txkhmax;
    private javax.swing.JTextField txlk;
    private javax.swing.JTextField txln;
    private javax.swing.JTextField txslmax;
    private javax.swing.JTextField txslmax1;
    private javax.swing.JTextField txslmax2;
    private javax.swing.JTextField txspmax1;
    private javax.swing.JTextField txspmax2;
    private javax.swing.JTextField txtc;
    private com.toedter.calendar.JYearChooser txyear;
    // End of variables declaration//GEN-END:variables
}



