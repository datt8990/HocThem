/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Vaccine> list = new ArrayList<>();
        VaccineService vaccineService = new VaccineService();
        Scanner sc = new Scanner(System.in);
        boolean thoat = false;
        do {

            System.out.println("MENU");
            System.out.println("1. nhập danh sách đối tượng");
            System.out.println("2. xuất danh sách đối tượng");
            System.out.println("3. nhập danh sách các vc");
            System.out.println("4. sắp xếp giảm dần theo thời gian tác dụng");
            System.out.println("5. thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    vaccineService.nhapThongTin();
                    break;
                case 2:
                    vaccineService.xuatThongTin();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    thoat = true;
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("không có chức năng này");
            }
        } while (!thoat);

    }

}
