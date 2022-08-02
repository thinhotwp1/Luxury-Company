/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.IOFile;
import controller.SoExeption;
import controller.TrongExeption;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sanpham;
import model.Nhanvien;


/**
 *
 * @author onthi
 */
public class Main extends javax.swing.JFrame {

    String fNV,fSP;
    List<Nhanvien> lNV;
    List<Sanpham> lSP ;   
    DefaultTableModel tmNV,tmSP;
            
    public Main() {
        
//        setLocation(200, 200); //set vi tri cua tab
        setLocationByPlatform(rootPaneCheckingEnabled);
        initComponents();
        fNV="src/controller/Nhanvien.dat";
        fSP="src/controller/Sanpham.dat";
//        fQL="src/controller/Quanly.dat";
        
        String[] nv = {"Mã nhân viên","Tên nhân viên","Chức vụ","Lương cứng"};
        tmNV = new DefaultTableModel(nv, 0);
        String[] sp = {"Mã sản phẩm","Tên sản phẩm","Loại sản phẩm","Giá sản phẩm","Số lượng đã bán"};
        tmSP = new DefaultTableModel(sp, 0);
//        String[] qlnv = {"Mã nhân viên","Tên nhân viên","Chức vụ","Lương cứng"};
//        tmQL = new DefaultTableModel(qlnv,0);
        
        TabNV.setModel(tmNV);
        TabSP.setModel(tmSP);
        loadNV();   // Lay du lieu tu file nhanvien.dat
        loadSP();
        showNV(lNV);// Show du lieu tu file len bang
        showSP(lSP);
    }
    
    public void loadNV(){
        File f = new File(fNV);
        if(f.exists())  
            lNV = IOFile.doc(fNV);
        else
            lNV = new ArrayList<>();              
    }
    public void loadSP(){
        File f = new File(fSP);
        if(f.exists())  
            lSP=IOFile.doc(fSP);
        else
            lSP = new ArrayList<>();              
    }
    
    public void showNV(List<Nhanvien> list){
        loadNV();
        tmNV.setRowCount(0);
        for(Nhanvien i:list){
            tmNV.addRow(i.toObjects());
        }
    }
    
    public void showSP(List<Sanpham> list){
        loadSP();
        tmSP.setRowCount(0);
        for(Sanpham i:list){
            tmSP.addRow(i.toObjects());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        TabQLNV = new javax.swing.JTabbedPane();
        p1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabNV = new javax.swing.JTable();
        btThemNV = new javax.swing.JButton();
        btXoaNV = new javax.swing.JButton();
        btSuaNV = new javax.swing.JButton();
        btLuuNV = new javax.swing.JButton();
        jLabelMaNv = new javax.swing.JLabel();
        jLabelTenNv = new javax.swing.JLabel();
        jLabelChucvu = new javax.swing.JLabel();
        jLabelLuongthang = new javax.swing.JLabel();
        jTextFieldMaNV = new javax.swing.JTextField();
        jTextFieldTenNV = new javax.swing.JTextField();
        jTextFieldLuongThang = new javax.swing.JTextField();
        jComboBoxChucVu = new javax.swing.JComboBox<>();
        jButtonCapnhatNV = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabSP = new javax.swing.JTable();
        btThemSP = new javax.swing.JButton();
        btXoaSP = new javax.swing.JButton();
        btSuaSP = new javax.swing.JButton();
        btLuuSP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldMaSp = new javax.swing.JTextField();
        jTextFieldTenSp = new javax.swing.JTextField();
        jTextFieldGiaSp = new javax.swing.JTextField();
        jComboBoxLoaiSp = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldGiaSp1 = new javax.swing.JTextField();
        p3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btThemNV1 = new javax.swing.JButton();
        btXoaNV1 = new javax.swing.JButton();
        btSuaNV1 = new javax.swing.JButton();
        btLuuNV1 = new javax.swing.JButton();
        jLabelMaNv1 = new javax.swing.JLabel();
        jLabelTenNv1 = new javax.swing.JLabel();
        jLabelLuongthang1 = new javax.swing.JLabel();
        jTextFieldMaNV1 = new javax.swing.JTextField();
        jTextFieldTenNV1 = new javax.swing.JTextField();
        jTextFieldLuongThang1 = new javax.swing.JTextField();
        jLabelLuongthang2 = new javax.swing.JLabel();
        jTextFieldLuongThang2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabNV);

        btThemNV.setText("Thêm");
        btThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemNVActionPerformed(evt);
            }
        });

        btXoaNV.setText("Xóa");
        btXoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaNVActionPerformed(evt);
            }
        });

        btSuaNV.setText("Sửa");
        btSuaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaNVActionPerformed(evt);
            }
        });

        btLuuNV.setText("Lưu vào file");
        btLuuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuNVActionPerformed(evt);
            }
        });

        jLabelMaNv.setText("Mã nhân viên:");

        jLabelTenNv.setText("Tên nhân viên:");

        jLabelChucvu.setText("Chức vụ:");

        jLabelLuongthang.setText("Lương cứng:");

        jComboBoxChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bán hàng phòng khách", "Bán hàng phòng ngủ", "Bán hàng nhà bếp" }));

        jButtonCapnhatNV.setText("Cập nhật");
        jButtonCapnhatNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapnhatNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMaNv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTenNv, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabelChucvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLuongthang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTextFieldLuongThang, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTextFieldMaNV)
                    .addComponent(jComboBoxChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 260, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThemNV)
                .addGap(52, 52, 52)
                .addComponent(btXoaNV)
                .addGap(36, 36, 36)
                .addComponent(btSuaNV)
                .addGap(45, 45, 45)
                .addComponent(btLuuNV)
                .addGap(28, 28, 28)
                .addComponent(jButtonCapnhatNV, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMaNv)
                            .addComponent(jTextFieldMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTenNv)
                            .addComponent(jTextFieldTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelChucvu)
                            .addComponent(jComboBoxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLuongthang)
                            .addComponent(jTextFieldLuongThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemNV)
                    .addComponent(btXoaNV)
                    .addComponent(btSuaNV)
                    .addComponent(btLuuNV)
                    .addComponent(jButtonCapnhatNV))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        TabQLNV.addTab("Nhân viên", p1);

        TabSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TabSP);

        btThemSP.setText("Thêm");
        btThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemSPActionPerformed(evt);
            }
        });

        btXoaSP.setText("Xóa");
        btXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaSPActionPerformed(evt);
            }
        });

        btSuaSP.setText("Sửa");

        btLuuSP.setText("Lưu vào file");
        btLuuSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuSPActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã sản phẩm:");

        jLabel6.setText("Tên sản phẩm:");

        jLabel7.setText("Loại sản phẩm:");

        jLabel8.setText("Giá sản phẩm:");

        jComboBoxLoaiSp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tivi", "Tủ lạnh", "Máy giặt", "Chăn", "Đệm" }));

        jLabel9.setText("Số lượng đã bán:");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTenSp, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTextFieldGiaSp, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTextFieldMaSp)
                    .addComponent(jComboBoxLoaiSp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldGiaSp1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(0, 260, Short.MAX_VALUE))
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThemSP)
                .addGap(52, 52, 52)
                .addComponent(btXoaSP)
                .addGap(36, 36, 36)
                .addComponent(btSuaSP)
                .addGap(45, 45, 45)
                .addComponent(btLuuSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxLoaiSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGiaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGiaSp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemSP)
                    .addComponent(btXoaSP)
                    .addComponent(btSuaSP)
                    .addComponent(btLuuSP))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        TabQLNV.addTab("Sản phẩm", p2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        btThemNV1.setText("Thêm");

        btXoaNV1.setText("Xóa");

        btSuaNV1.setText("Sửa");

        btLuuNV1.setText("Lưu vào file");

        jLabelMaNv1.setText("Mã nhân viên:");

        jLabelTenNv1.setText("Tên nhân viên:");

        jLabelLuongthang1.setText("Tổng sản phẩm bán:");

        jLabelLuongthang2.setText("Lương cứng:");

        jLabel1.setText("Hoa hồng:");

        jLabel2.setText("Tổng thu nhập:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bán trên 1000 sản phẩm hoa hồng 10%\nBán trên 2000 sản phẩm hoa hồng 20%\nBán trên 3000 sản phẩm hoa hồng 30%\n");
        jTextArea1.setFocusable(false);
        jTextArea1.setName(""); // NOI18N
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMaNv1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTenNv1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLuongthang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLuongthang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTenNV1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jTextFieldLuongThang1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jTextFieldMaNV1)
                    .addComponent(jTextFieldLuongThang2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3)
                    .addComponent(jScrollPane4))
                .addGap(0, 238, Short.MAX_VALUE))
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThemNV1)
                .addGap(52, 52, 52)
                .addComponent(btXoaNV1)
                .addGap(36, 36, 36)
                .addComponent(btSuaNV1)
                .addGap(45, 45, 45)
                .addComponent(btLuuNV1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemNV1)
                    .addComponent(btXoaNV1)
                    .addComponent(btSuaNV1)
                    .addComponent(btLuuNV1))
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaNv1)
                    .addComponent(jTextFieldMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTenNV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTenNv1))
                .addGap(25, 25, 25)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLuongthang1)
                    .addComponent(jTextFieldLuongThang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLuongthang2)
                    .addComponent(jTextFieldLuongThang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabQLNV.addTab("Quản lý nhân viên", p3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabQLNV)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabQLNV)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLuuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuNVActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fNV, lNV);
        JOptionPane.showMessageDialog(this,"Đã lưu");
    }//GEN-LAST:event_btLuuNVActionPerformed

    private void btLuuSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuSPActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fSP, lSP);
        JOptionPane.showMessageDialog(this,"Đã lưu");
        
    }//GEN-LAST:event_btLuuSPActionPerformed

    private void btThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThemSPActionPerformed

    private void btXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaSPActionPerformed
        // TODO add your handling code here:
        int r = TabSP.getSelectedRow();
        if(r>=0 && r<TabSP.getRowCount()){
            tmSP.removeRow(r);
            lSP.remove(r);
        }
        else{
            JOptionPane.showMessageDialog(this,"Chọn sản phẩm để xóa");
            return;
        }
    }//GEN-LAST:event_btXoaSPActionPerformed

    private void btXoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaNVActionPerformed
        // TODO add your handling code here:
        int r = TabNV.getSelectedRow();
        if(r>=0 && r<TabNV.getRowCount()){
            tmNV.removeRow(r);
            lNV.remove(r);
        }
        else
            JOptionPane.showMessageDialog(this,"Chọn nhân viên để xóa");
            
    }//GEN-LAST:event_btXoaNVActionPerformed

    private void TabNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabNVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabNVMouseClicked

    private void btSuaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaNVActionPerformed
        // TODO add your handling code here:
        int r = TabNV.getSelectedRow();
        if(r>=0 && r < tmNV.getRowCount()) 
        {
            jTextFieldMaNV.setText(tmNV.getValueAt(r,0).toString());
            jTextFieldTenNV.setText(tmNV.getValueAt(r,1).toString());
            jTextFieldLuongThang.setText(tmNV.getValueAt(r,3).toString());
            String chucvu=tmNV.getValueAt(r,2).toString();
            for(int i=0;i<jComboBoxChucVu.getItemCount();i++){
                if(tmNV.getValueAt(r,2).equals(jComboBoxChucVu.getItemAt(i))){
                jComboBoxChucVu.setSelectedIndex(i);
                }         
            }            
        }
        else{
            JOptionPane.showMessageDialog(this,"Chọn nhân viên để sửa");
        }
            
    }//GEN-LAST:event_btSuaNVActionPerformed

    private void btThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemNVActionPerformed
        // TODO add your handling code here:
        int n = lNV.size();
        if(n>0){
            Nhanvien.setSma(lNV.get(n-1).getMa()+1);
        }
        jTextFieldMaNV.setText(Nhanvien.getSma()+"");
        String ten,chucvu;
        double luong;
        try{
            ten=jTextFieldTenNV.getText();
            chucvu=jComboBoxChucVu.getSelectedItem().toString();
            luong=Double.parseDouble(jTextFieldLuongThang.getText());
            Nhanvien nv = new Nhanvien(ten, chucvu, luong);
            tmNV.addRow(nv.toObjects());
            lNV.add(nv);
            if(ten.isEmpty() || chucvu.isEmpty()) throw new TrongExeption();
            }catch(TrongExeption e){
                JOptionPane.showMessageDialog(this,"Không được để trống");
                jTextFieldTenNV.requestFocus();
                return;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Phải nhập số");
                jTextFieldLuongThang.requestFocus();
                return;
            }
    }//GEN-LAST:event_btThemNVActionPerformed

    private void jButtonCapnhatNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapnhatNVActionPerformed
        // TODO add your handling code here:
        int r = TabNV.getSelectedRow();
        if(r>=0 ){
            try{
                int ma;
                String ten,chucvu;
                double luong;
                ma=Integer.parseInt(jTextFieldMaNV.getText());
                ten=jTextFieldTenNV.getText();
                chucvu=jComboBoxChucVu.getSelectedItem().toString();
                luong = Double.parseDouble(jTextFieldLuongThang.getText());
                Nhanvien nv = new Nhanvien(ma,ten, chucvu, luong);
                tmNV.setValueAt(ma, r, 0);
                tmNV.setValueAt(ten, r, 1);
                tmNV.setValueAt(chucvu, r, 2);
                tmNV.setValueAt(luong, r, 3);
                if(ten.isEmpty() || chucvu.isEmpty()) throw new TrongExeption();
            }catch(TrongExeption e){
                JOptionPane.showMessageDialog(this,"Không được để trống");
                jTextFieldTenNV.requestFocus();
                return;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Phải nhập số");
                jTextFieldLuongThang.requestFocus();
                return;
            }   
        }
        else{
            JOptionPane.showMessageDialog(this,"Chọn nhân viên cần cập nhật dữ liệu");
        }
        
            
        
    }//GEN-LAST:event_jButtonCapnhatNVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabNV;
    private javax.swing.JTabbedPane TabQLNV;
    private javax.swing.JTable TabSP;
    private javax.swing.JButton btLuuNV;
    private javax.swing.JButton btLuuNV1;
    private javax.swing.JButton btLuuSP;
    private javax.swing.JButton btSuaNV;
    private javax.swing.JButton btSuaNV1;
    private javax.swing.JButton btSuaSP;
    private javax.swing.JButton btThemNV;
    private javax.swing.JButton btThemNV1;
    private javax.swing.JButton btThemSP;
    private javax.swing.JButton btXoaNV;
    private javax.swing.JButton btXoaNV1;
    private javax.swing.JButton btXoaSP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonCapnhatNV;
    private javax.swing.JComboBox<String> jComboBoxChucVu;
    private javax.swing.JComboBox<String> jComboBoxLoaiSp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelChucvu;
    private javax.swing.JLabel jLabelLuongthang;
    private javax.swing.JLabel jLabelLuongthang1;
    private javax.swing.JLabel jLabelLuongthang2;
    private javax.swing.JLabel jLabelMaNv;
    private javax.swing.JLabel jLabelMaNv1;
    private javax.swing.JLabel jLabelTenNv;
    private javax.swing.JLabel jLabelTenNv1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldGiaSp;
    private javax.swing.JTextField jTextFieldGiaSp1;
    private javax.swing.JTextField jTextFieldLuongThang;
    private javax.swing.JTextField jTextFieldLuongThang1;
    private javax.swing.JTextField jTextFieldLuongThang2;
    private javax.swing.JTextField jTextFieldMaNV;
    private javax.swing.JTextField jTextFieldMaNV1;
    private javax.swing.JTextField jTextFieldMaSp;
    private javax.swing.JTextField jTextFieldTenNV;
    private javax.swing.JTextField jTextFieldTenNV1;
    private javax.swing.JTextField jTextFieldTenSp;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    // End of variables declaration//GEN-END:variables
}