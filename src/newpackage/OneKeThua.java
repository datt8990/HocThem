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
public class OneKeThua extends One {

    Scanner ac = new Scanner(System.in);
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public OneKeThua(String hoTen, int gioiTinh, double canNang, String noiSong, String school) {
        super(hoTen, gioiTinh, canNang, noiSong);
        this.school = school;
    }

    public OneKeThua(String school) {
        this.school = school;
    }

    public OneKeThua() {
    }

    @Override
    public void nnhap() {
        super.nnhap(); 
        System.out.println("Nhập vào tên trường: ");
        school = sc.nextLine();
        while (!school.matches("[a-zA-Z\\s]+$")) {
            System.out.println("Không hợp lệ. Mời nhập lại");
            school = sc.nextLine();
        }
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Tên trường: "+school);
    }
    
}
