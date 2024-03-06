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
public class Vaccine {

    Scanner nhap = new Scanner(System.in);
    private String MaVC;
    private String tenVC;
    private Float thoigiantacdung;
    private String ngayhethan;

    public Vaccine() {
    }

    public Vaccine(String MaVC, String tenVC, Float thoigiantacdung, String ngayhethan) {
        this.MaVC = MaVC;
        this.tenVC = tenVC;
        this.thoigiantacdung = thoigiantacdung;
        this.ngayhethan = ngayhethan;
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return tenVC;
    }

    public void setTenVC(String tenVC) {
        this.tenVC = tenVC;
    }

    public Float getThoigiantacdung() {
        return thoigiantacdung;
    }

    public void setThoigiantacdung(Float thoigiantacdung) {
        this.thoigiantacdung = thoigiantacdung;
    }

    public String getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(String ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public void nhapThongTin() {
        System.out.println("mã vc:");
        MaVC = nhap.nextLine();
        System.out.println("tên vc:");
        tenVC = nhap.nextLine();
        System.out.println("thời gian tác dụng: ");
        thoigiantacdung = nhap.nextFloat();
        System.out.println("ngày hết hạn :");
        ngayhethan = nhap.nextLine();
        nhap.nextLine();

    }

    public void xuatThongTin() {
        System.out.println("mã vc: " + MaVC);
        System.out.println("tên vc:" + tenVC);
        System.out.println("thời gian tác dụng: " + thoigiantacdung);
        System.out.println("ngày hết hạn: " + ngayhethan);
    }
}
