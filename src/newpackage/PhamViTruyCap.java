/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhamViTruyCap {

    private String hoTen;

    String diaChi;

    protected String maSV;

    public String chuyenNghanh;

    Scanner sc = new Scanner(System.in);


    public void nhap() {
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập địa chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập mã: ");
        maSV = sc.nextLine();
        System.out.println("Nhập chuyên nghành: ");
        chuyenNghanh = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Tên: "+hoTen);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Mã SV: "+maSV);
        System.out.println("Chuyên nghành: "+chuyenNghanh);
    }
}
