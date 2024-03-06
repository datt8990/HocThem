/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DoneJava2;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.ButtonGroup;

/**
 *
 * @author admin
 */
public class View extends javax.swing.JFrame {

    private NhanVien nhanVien = new NhanVien();
    private List<NhanVien> listNV = new ArrayList<>();
    private QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVienImpl();
    private DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    //private DocGhiFile docGhiFile = new DocGhiFile();
    //private String path = "NV.txt";
    File file;

    public View() {
        initComponents();

        init();

    }

    public void init() {
        file = new File("NV.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        this.listNV = quanLyNhanVien.fakeData();
        this.defaultTableModel = (DefaultTableModel) tblDanhSachNhanVien.getModel();
        fillTable(listNV);
        fillCBC();
        fillData(listNV.size() - 1);
    }

    public void fillTable(List<NhanVien> list) {
        defaultTableModel.setRowCount(0);
        for (NhanVien nhanVien : list) {
            defaultTableModel.addRow(nhanVien.toRowTable());
        }
    }

    private void fillCBC() {

        defaultComboBoxModel = (DefaultComboBoxModel) cbcThamNien.getModel();
        for (int i = 1; i <= 100; i++) {
            defaultComboBoxModel.addElement(i);

        }
    }

    private boolean validation() {
        if (Validation.isEmpty(txtMaNhanVien, "Mã nhân viên không được trống")) {
            return false;
        }
        if (Validation.isEmpty(txtTenNhanVien, "Tên nhân viên không được trống")) {
            return false;
        }
        if (txtTenNhanVien.getText().contains("0") || txtTenNhanVien.getText().contains("1")
                || txtTenNhanVien.getText().contains("2") || txtTenNhanVien.getText().contains("3")
                || txtTenNhanVien.getText().contains("4") || txtTenNhanVien.getText().contains("5")
                || txtTenNhanVien.getText().contains("6") || txtTenNhanVien.getText().contains("7")
                || txtTenNhanVien.getText().contains("8") || txtTenNhanVien.getText().contains("9")) {
            JOptionPane.showMessageDialog(null, "Tên nhân viên không được chứa số");
            txtTenNhanVien.setBackground(Color.red);
            return false;
        }
        return true;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbGioiTinh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        rbtnGioiTinhNam = new javax.swing.JRadioButton();
        rbtnGioiTinhNu = new javax.swing.JRadioButton();
        cbcThamNien = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachNhanVien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        btnTK = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Tên Nhân Viên");

        jbGioiTinh.setText("Giới Tính");

        jLabel5.setText("Thâm Niên");

        buttonGroup1.add(rbtnGioiTinhNam);
        rbtnGioiTinhNam.setText("Nam");

        buttonGroup1.add(rbtnGioiTinhNu);
        rbtnGioiTinhNu.setText("Nữ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhiFile.setText("Ghi File");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        tblDanhSachNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV ", "Giới Tính", "Thâm Niên", "Thưởng"
            }
        ));
        tblDanhSachNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachNhanVien);

        jLabel6.setText("Tháng");

        btnTK.setText("Search");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        btnDocFile.setText("Đọc File");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        jLabel4.setText("Tìm Kiếm Theo Tên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btnThem))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbcThamNien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(rbtnGioiTinhNam)
                                                .addGap(55, 55, 55)
                                                .addComponent(rbtnGioiTinhNu)))
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSua)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnXoa)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnGhiFile)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnDocFile))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnTK))
                                    .addComponent(jLabel1))
                                .addContainerGap(83, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTK)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGioiTinh)
                    .addComponent(rbtnGioiTinhNam)
                    .addComponent(rbtnGioiTinhNu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbcThamNien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnGhiFile)
                    .addComponent(btnDocFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!validation()) {
            return;
        }
//         if(Validation.isEmpty(txtMaNhanVien, "Mã nhân viên không được trống"))
//             return;
        JOptionPane.showMessageDialog(this, quanLyNhanVien.themNhanVien(getFormData()));
        fillTable(listNV);
        resetForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblDanhSachNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachNhanVienMouseClicked
        int row = tblDanhSachNhanVien.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblDanhSachNhanVienMouseClicked

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
//        String searchText = txtTK.getText().toLowerCase();
//        List<NhanVien> listSearch = new ArrayList<>();
//        this.quanLyNhanVien.timKiem(listNV);
//        for (NhanVien nhanVien1 : listNV) {
//            String ten = nhanVien1.getTenNV().toLowerCase();
//            if (ten.equalsIgnoreCase(searchText.toLowerCase())) {
//                listSearch.add(nhanVien1);
//
//            }
//
//        }
//        fillTable(listSearch);

        String searchText = txtTK.getText().toLowerCase();
        List<NhanVien> listSearch = new ArrayList<>();
        listSearch = this.quanLyNhanVien.timKiem(searchText);
        if (Validation.isEmpty(txtTK, "Cần nhập tên nhân viên")) {
            return;
        }
        fillTable(listSearch);
    }//GEN-LAST:event_btnTKActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblDanhSachNhanVien.getSelectedRow();
        JOptionPane.showMessageDialog(this, quanLyNhanVien.xoaNhanVien(row));
        fillTable(listNV);
        resetForm();

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (!validation()) {
            return;
        }
        int row = tblDanhSachNhanVien.getSelectedRow();
        JOptionPane.showMessageDialog(this, quanLyNhanVien.suaNhanVien(row, getFormData()));
        fillTable(listNV);
        resetForm();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
//        FileOutputStream fos;
//        ObjectOutputStream oos;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (NhanVien nhanVien1 : listNV) {
                oos.writeObject(nhanVien1);

            }
            fos.close();
            oos.close();
            JOptionPane.showMessageDialog(this, "Lưu thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lưu thất bại");
        }

    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed

        docFile();
        fillTable(listNV);

    }//GEN-LAST:event_btnDocFileActionPerformed

    public List<NhanVien> docFile() {
        listNV.clear();
        File file = new File("NV.txt");
        // kiểm tra xem file đã tồn tại chưa
        if (!file.exists()) {

            return null;
        }
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis) {
        }) {
            // ghi từng đối tượng vào file
            while (fis.available() > 0) {
                listNV.add((NhanVien) ois.readObject());

            }
            JOptionPane.showMessageDialog(this, "Đọc thành công");
            fis.close();
            ois.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đọc file thất bại");
            return null;
        }

        return listNV;

    }

    public void resetForm() {
        txtMaNhanVien.setText("");
        txtTenNhanVien.setText("");
        cbcThamNien.setSelectedIndex(0);
        buttonGroup1.clearSelection();

    }

    private NhanVien getFormData() {

        String maNV = txtMaNhanVien.getText();
        String tenNV = txtTenNhanVien.getText();
        Integer gioiTinh = 0;
        int thamNien = (int) cbcThamNien.getSelectedItem();

        if (rbtnGioiTinhNam.isSelected()) {
            gioiTinh = 0;
        }
        if (rbtnGioiTinhNu.isSelected()) {
            gioiTinh = 1;
        }
        return new NhanVien(maNV, tenNV, gioiTinh, thamNien);
    }

    private void fillData(int index) {
        NhanVien nhanVien = listNV.get(index);
        txtMaNhanVien.setText(nhanVien.getMaNV());
        txtTenNhanVien.setText(nhanVien.getTenNV());
        cbcThamNien.setSelectedItem(nhanVien.getThamNien());
        if (nhanVien.getGioiTinh() == 0) {
            rbtnGioiTinhNam.setSelected(true);
        } else {
            rbtnGioiTinhNu.setSelected(true);
        }

    }

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbcThamNien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbGioiTinh;
    private javax.swing.JRadioButton rbtnGioiTinhNam;
    private javax.swing.JRadioButton rbtnGioiTinhNu;
    private javax.swing.JTable tblDanhSachNhanVien;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
