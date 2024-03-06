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
public class One {

    Scanner sc = new Scanner(System.in);

    private String hoTen;

    private int gioiTinh;

    private double canNang;

    private String noiSong;

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
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

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public One(String hoTen, int gioiTinh, double canNang, String noiSong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public One() {
    }

    public void nnhap() {
        System.out.println("Nhập vào họ tên: ");
        hoTen = sc.nextLine();
        while (!hoTen.matches("[a-zA-Z\\s]+$")) {
            System.out.println("Họ tên không hợp lệ. Mời nhập lại: ");
            hoTen = sc.nextLine();
        }
        do {
            System.out.println("Chọn giới tính: (0:Nam ; 1:Nữ)");
            try {
                gioiTinh = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                gioiTinh = -1;
            }
        } while (gioiTinh == 0 && gioiTinh == 1);
        canNang = canNang();
        System.out.println("Nhập vào địa chỉ nhà: ");
        noiSong = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Tên: " + hoTen);
        System.out.println("Giới tính: " + checkGioiTinh());
        System.out.println("Cân nặng: " + canNang);
        System.out.println("Nơi sống: " + noiSong);
    }

    public double canNang() {
        double check;
        do {
            System.out.println("Nhập vào cân nặng: ");
            try {
                check = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                check = -1;
            }
            if (check > 0) {
                break;
            } else {
                System.out.println("Cân nặng không hợp lệ. Mời nhập lại: ");
            }
        } while (check <= 0);
        return check;
    }

    public String checkGioiTinh() {
        if (gioiTinh == 0) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }
}
