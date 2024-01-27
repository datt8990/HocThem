/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Vaccine {

    private String MaVC;
    private String tenVC;
    private float Thoigiantacdung;
    private String Ngayhethan;
    Scanner sc = new Scanner(System.in);

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

    public float getThoigiantacdung() {
        return Thoigiantacdung;
    }

    public void setThoigiantacdung(float Thoigiantacdung) {
        this.Thoigiantacdung = Thoigiantacdung;
    }

    public String getNgayhethan() {
        return Ngayhethan;
    }

    public void setNgayhethan(String Ngayhethan) {
        this.Ngayhethan = Ngayhethan;
    }

    public Vaccine(String MaVC, String tenVC, float Thoigiantacdung, String Ngayhethan) {
        this.MaVC = MaVC;
        this.tenVC = tenVC;
        this.Thoigiantacdung = Thoigiantacdung;
        this.Ngayhethan = Ngayhethan;
    }

    public Vaccine() {
    }

    public void NhapThongTin() {
        System.out.println("Nhập mã VC : ");
        MaVC = sc.nextLine();
        System.out.println("Nhập tên VC: ");
        tenVC = sc.nextLine();
        System.out.println("Thời gian tác dụng của VC (tháng): ");
        Thoigiantacdung = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ngày hết hạn VC: ");
        Ngayhethan = sc.nextLine();
    }

    public void InThongTin() {
        System.out.println("Mã: " + MaVC);
        System.out.println("Tên: " + tenVC);
        System.out.println("Thời gian tác dụng: " + Thoigiantacdung);
        System.out.println("Ngày hết hạn: " + Ngayhethan);
    }

}
