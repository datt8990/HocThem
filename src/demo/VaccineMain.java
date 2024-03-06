/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class VaccineMain {

    public static void main(String[] args) {

        VaccineService vaccineService = new VaccineService();

        ArrayList<Vaccine> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        list = vaccineService.listPH;

        int choice;

        while (true) {

            System.out.println("================MENU===================");
            System.out.println("1.Nhập danh sách: ");
            System.out.println("2.Xuất danh sách: ");
            System.out.println("3.Xuất danh sách các VC (thời gian tác dụng >=6 tháng)");
            System.out.println("4.Sắp xếp giảm dần theo thời gian tác dụng");
            System.out.println("Mời bạn chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String check;
                    do {
                        Vaccine vaccine = new Vaccine();
                        vaccine.nhap();
                        vaccineService.nhapThongTin(vaccine);
                        System.out.println("Bạn có muốn nhập nữa không? (nhập y để tiếp tục)");
                        check = sc.nextLine();
                        sc.nextLine();

                    } while (check.equals("y"));
                    break;
                case 2:
                    System.out.println("Danh sách: ");
                    for (Vaccine vaccine : list) {
                        vaccine.xuat();
                    }
                    break;
                case 3:
                    ArrayList<Vaccine> listVC = new ArrayList<>();
                    for (Vaccine vaccine : list) {
                        if (vaccine.getThoiGianTacDung() >= 6) {
                            listVC.add(vaccine);
                        }
                        if (listVC.isEmpty()) {
                            System.out.println("Không có dữ liệu VC tương ứng: ");
                        }
                        for (Vaccine vaccine1 : listVC) {
                            vaccine1.xuat();
                        }
                    }
                    break;
                case 4:
                    vaccineService.sapXep();
                    for (Vaccine vaccine : list) {
                        vaccine.xuat();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
