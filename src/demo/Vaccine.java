/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Vaccine {

    private String maVC;

    private String tenVC;

    private Float thoiGianTacDung;

    private String ngayHetHan;

    Scanner sc = new Scanner(System.in);

    public String getMaVC() {
        return maVC;
    }

    public void setMaVC(String maVC) {
        this.maVC = maVC;
    }

    public String getTenVC() {
        return tenVC;
    }

    public void setTenVC(String tenVC) {
        this.tenVC = tenVC;
    }

    public Float getThoiGianTacDung() {
        return thoiGianTacDung;
    }

    public void setThoiGianTacDung(Float thoiGianTacDung) {
        this.thoiGianTacDung = thoiGianTacDung;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public Vaccine(String maVC, String tenVC, Float thoiGianTacDung, String ngayHetHan) {
        this.maVC = maVC;
        this.tenVC = tenVC;
        this.thoiGianTacDung = thoiGianTacDung;
        this.ngayHetHan = ngayHetHan;
    }

    public Vaccine() {
    }

    public void nhap() {
        System.out.println("Mã: ");
        maVC = sc.nextLine();
        System.out.println("tên: ");
        tenVC = sc.nextLine();
        System.out.println("Thời gian tác dụng(tháng): ");
        thoiGianTacDung = Float.parseFloat(sc.nextLine());
        System.out.println("Ngày hết hạn: ");
        ngayHetHan = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã: " + maVC);
        System.out.println("tên: " + tenVC);
        System.out.println("Thời gian tác dụng: " + thoiGianTacDung);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
    }
}
