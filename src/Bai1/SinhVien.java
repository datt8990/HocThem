/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class SinhVien implements Serializable {

    private String maSV;

    private String hoTen;

    private int gioiTinh;

    private String chuyenNghanh;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public SinhVien(String maSV, String hoTen, int gioiTinh, String chuyenNghanh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.chuyenNghanh = chuyenNghanh;
    }

    public SinhVien() {
    }

    public Object[] toRowTable() {
        return new Object[]{maSV, hoTen, gioiTinh == 0 ? "Nam" : "Nữ", chuyenNghanh};
    }
}
