/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLVC ql = new QLVC();
        ArrayList<Vaccine> list = new ArrayList<>();
        int chon;
        while (true) {
            System.out.println("1.Nhập danh sách đối tượng: ");
            System.out.println("2.Xuất danh sách: ");
            System.out.println("3.Xuất danh sách các VC(Thoigiantacdung>=6 tháng): ");
            System.out.println("4.Sắp xếp giảm dần thoe thời gian tác dụng: ");
            System.out.println("0.Thoát. ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    String check;
                    do {
                        Vaccine nhap = new Vaccine();
                        nhap.NhapThongTin();
                        ql.nhapthongtin(nhap);
                        System.out.println("Bạn có muốn nhập nữa không? (Y để nhập tiếp)");
                        check = sc.nextLine();
                        sc.nextLine();
                    } while (check.equalsIgnoreCase("y"));

                    break;
                case 2:
                    System.out.println("Danh sách đã nhập: ");
                    list = ql.xuatThongTin();
                    for (Vaccine vaccine : list) {
                        vaccine.InThongTin();

                    }
                    break;
                case 3:

                    ArrayList<Vaccine> sapxep = new ArrayList<>();
                    for (Vaccine vaccine : list) {
                        if (vaccine.getThoigiantacdung() >= 6) {
                            sapxep.add(vaccine);
                            System.out.println("Danh sách các VC (Thời gian tác dụng >= 6 tháng): ");
                        }
                        if (sapxep.isEmpty()) {
                            System.out.println("Không có VC thỏa mãn.");
                        }
                        for (Vaccine vaccine1 : sapxep) {
                            vaccine1.InThongTin();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sắp xếp giảm dần theo thời gian tác dụng: ");

                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
