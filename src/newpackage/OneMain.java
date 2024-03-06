/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import OnJ1P3.PersonService;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class OneMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OneService one = new OneService();

        int choice;

        do {
            System.out.println("|==================Menu==================|");
            System.out.println("1.Thêm đối tượng");
            System.out.println("2.Xuất đối tượng");
            System.out.println("3.kế thừa");
            System.out.println("4.Thoát.");
            System.out.println("5.Sửa theo tên");
            System.out.println("6.sắp xếp");
            System.out.println("7.sắp xếp theo cn");
            System.out.println("Mời bạn chọn:");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    one.nhapTT();
                    break;
                case 2:
                    one.xuatTT();
                    break;
                case 3:
                    one.keThua();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Nhập họ tên muốn sửa: ");
                    String ten = sc.nextLine();
                    one.sua(ten);
                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("Mời chọn lại!");
            }
        } while (true);
    }
}
