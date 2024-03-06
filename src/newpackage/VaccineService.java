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
public class VaccineService {

    ArrayList<Vaccine> listVaccine = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        String check;
        do {
            Vaccine vaccine = new Vaccine();
            vaccine.nhapThongTin();
            listVaccine.add(vaccine);
            System.out.println("Bạn có muốn nhập nữa không: Y/N");
            check = sc.nextLine();
            if (!check.equalsIgnoreCase("Y")) {
                System.out.println("bạn đã thoát chức năng 1");
                return;
            }

        } while (true);
    }

    public void xuatThongTin() {
        VaccineVN vn = new VaccineVN();
        vn.inthongtin();
        for (Vaccine vaccine : listVaccine) {
            vaccine.xuatThongTin();

        }
    }
}
