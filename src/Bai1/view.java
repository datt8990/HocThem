/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai1;

import DoneJava2.NhanVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class view extends javax.swing.JFrame {

    private List<SinhVien> list = new ArrayList<>();

    private QuanLySinhVien quanLySinhVien = new QuanLySinhVienImpl();

    private DefaultTableModel defaultTableModel;

    private DefaultComboBoxModel defaultComboBoxModel;

    File file;

    public view() {
        initComponents();
        init();
    }

    public void init() {
        file = new File("sv.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        this.setLocationRelativeTo(null);
        this.list = quanLySinhVien.fakedata();
        this.defaultTableModel = (DefaultTableModel) tblDanhSachSinhVien.getModel();
        fillTable(list);
        fillData(list.size() - 3);
    }

    public void fillTable(List<SinhVien> sinhViens) {
        defaultTableModel.setRowCount(0);
        for (SinhVien sinhVien : sinhViens) {
            defaultTableModel.addRow(sinhVien.toRowTable());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbcChuyenNghanh = new javax.swing.JComboBox<>();
        rbtnGioiTinhNam = new javax.swing.JRadioButton();
        rbtnGioiTinhNu = new javax.swing.JRadioButton();
        txtMaSinhVien = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachSinhVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Chuyên Nghành");

        cbcChuyenNghanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UDPM", "LT Web", "Quản Trị Kinh Doanh", "LT Mobile", "LT Game", " " }));

        buttonGroup1.add(rbtnGioiTinhNam);
        rbtnGioiTinhNam.setText("Nam");

        buttonGroup1.add(rbtnGioiTinhNu);
        rbtnGioiTinhNu.setText("Nữ");

        tblDanhSachSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ Tên", "Giới Tính", "Chuyên Nghành"
            }
        ));
        tblDanhSachSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDanhSachSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachSinhVien);

        btnThem.setText("Thêm");
        btnThem.setToolTipText("Thêm Sinh Viên");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setToolTipText("Reset dữ liệu");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setToolTipText("Đuổi SV à");
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

        btnDocFile.setText("Đọc File");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(16, 16, 16)
                                .addComponent(btnLamMoi)
                                .addGap(16, 16, 16)
                                .addComponent(btnXoa)
                                .addGap(16, 16, 16)
                                .addComponent(btnGhiFile)
                                .addGap(16, 16, 16)
                                .addComponent(btnDocFile))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHoTen))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbcChuyenNghanh, 0, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(32, 32, 32)
                                        .addComponent(rbtnGioiTinhNam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnGioiTinhNu)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(rbtnGioiTinhNam)
                    .addComponent(rbtnGioiTinhNu)
                    .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(cbcChuyenNghanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLamMoi)
                    .addComponent(btnXoa)
                    .addComponent(btnGhiFile)
                    .addComponent(btnDocFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        JOptionPane.showMessageDialog(this, quanLySinhVien.them(getFormData()));
        fillTable(list);
        resetForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblDanhSachSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachSinhVienMouseClicked
        int row = tblDanhSachSinhVien.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblDanhSachSinhVienMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        resetForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblDanhSachSinhVien.getSelectedRow();
        JOptionPane.showMessageDialog(this, quanLySinhVien.xoaSinhVien(row));
        fillTable(list);
        resetForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            for (SinhVien sinhVien : list) {
                oos.writeObject(sinhVien);

            }
            fos.close();
            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi thành công");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ghi thất bại");
        }

    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        docFile();
        fillTable(list);
    }//GEN-LAST:event_btnDocFileActionPerformed

    public List<SinhVien> docFile() {
        list.clear();
        File file = new File("sv.txt");
        // kiểm tra xem file đã tồn tại chưa
        if (!file.exists()) {

            return null;
        }
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis) {
        }) {
            // ghi từng đối tượng vào file
            while (fis.available() > 0) {
                list.add((SinhVien) ois.readObject());

            }
            JOptionPane.showMessageDialog(this, "Đọc thành công");
            fis.close();
            ois.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đọc file thất bại");
            return null;
        }

        return list;

    }

    public void resetForm() {
        txtMaSinhVien.setText("");
        txtHoTen.setText("");
        cbcChuyenNghanh.setSelectedIndex(0);
        buttonGroup1.clearSelection();

    }

    private SinhVien getFormData() {
        String maSV = txtMaSinhVien.getText();
        String tenSV = txtHoTen.getText();
        Integer gioiTinh = 0;
        String chuyenNghanh = String.valueOf(cbcChuyenNghanh.getSelectedItem());
        if (rbtnGioiTinhNam.isSelected()) {
            gioiTinh = 0;

        } else {
            gioiTinh = 1;
        }

        return new SinhVien(maSV, tenSV, gioiTinh, chuyenNghanh);
    }

    private void fillData(int index) {
        SinhVien sinhVien = list.get(index);
        txtMaSinhVien.setText(sinhVien.getMaSV());
        txtHoTen.setText(sinhVien.getHoTen());
        cbcChuyenNghanh.setSelectedItem(sinhVien.getChuyenNghanh());
        if (sinhVien.getGioiTinh() == 0) {
            rbtnGioiTinhNam.setSelected(true);
        } else {
            rbtnGioiTinhNu.setSelected(true);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbcChuyenNghanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnGioiTinhNam;
    private javax.swing.JRadioButton rbtnGioiTinhNu;
    private javax.swing.JTable tblDanhSachSinhVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSinhVien;
    // End of variables declaration//GEN-END:variables
}
