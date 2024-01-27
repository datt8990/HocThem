/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> demo = new ArrayList<>();
        demo.add("di choi");
        demo.add("hoc hanh");
        demo.add("di choi voi ny");
        demo.add("đấnh game");
        demo.add("di ngu");
        System.out.println("Danh sách ban đầu: ");
        for (String string : demo) {
            System.out.println(string); 
        }
        System.out.println("Nhập vào công việc muốn thêm: ");
        String themcongviec = sc.nextLine();
        demo.add(themcongviec);
        System.out.println("Danh sách sau khi thêm cvc: ");
        for (String string : demo) {
            System.out.println(string);
        }
        System.out.println("Vị trí muốn xóa: ");
        int vitrimuonxoa = sc.nextInt();
        demo.remove(vitrimuonxoa);
        System.out.println("Danh sách sau khi xóa");
        for (String string : demo) {
            System.out.println(string);
        }
        System.out.println("Nhập vị trí muốn update: ");
        int vitriupdate = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nội dung cần update: ");
        String noidungupdate = sc.nextLine();
        demo.set(vitriupdate, noidungupdate);
        System.out.println("Danh sách sau update:");
        for (String string : demo) {
            System.out.println(string);
        }
    }
}
