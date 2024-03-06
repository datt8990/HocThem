/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class OneService {

    Scanner sc = new Scanner(System.in);

    One one = new One();

    List<One> list = new ArrayList<>();

    public void nhapTT() {
        String check;
        do {
            System.out.println("Nhập thông tin sv: ");
            one.nnhap();
            list.add(one);
            System.out.println("Bạn có muốn nhập nữa không? y/n");
            check = sc.nextLine();
        } while (check.equalsIgnoreCase("y"));
    }

    public void xuatTT() {
        if (list.isEmpty()) {
            System.out.println("Ds trống");
        } else {
            for (One one1 : list) {
                one1.xuat();
            }
        }
    }

    public void keThua() {
        String check;
        boolean luaChon = true;
        do {
            OneKeThua keThua = new OneKeThua();
            System.out.println("Nhập vào thồng tin mới: ");
            keThua.nnhap();
            list.add(keThua);
            System.out.println("Bạn có muốn nhập nữa không: y/n");
            check = sc.nextLine();
            luaChon = true;
            if (check.equalsIgnoreCase("n")) {
                luaChon = false;
                System.out.println("Thông tin sinh viên đã thêm: ");
                keThua.xuat();
                break;
            }
        } while (check.equalsIgnoreCase("y"));
    }

    public One timKiem(String ten) {
        for (One one1 : list) {
            if (one1.getHoTen().equalsIgnoreCase(ten)) {
                return one1;
            }
        }
        return null;
    }

    public void sua(String ten) {
        if (timKiem(ten) != null) {
            One one = timKiem(ten);
            System.out.println("Người cần tìm là: " + ten);
            System.out.println("Nhập vào giới tính mới: ");
            int gioiTinh = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cân nặng: ");
            double canNang = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập địa chỉ mới: ");
            String diaChi = sc.nextLine();
            one.setGioiTinh(gioiTinh);
            one.setCanNang(canNang);
            one.setNoiSong(diaChi);

        } else {
            System.out.println("Không có ai có họ tên : "+ten);
        }
    }
}
