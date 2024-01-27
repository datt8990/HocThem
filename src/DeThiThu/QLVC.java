/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QLVC {

    ArrayList<Vaccine> x = new ArrayList<>();

    public void nhapthongtin(Vaccine a) {
        x.add(a);
    }

    public ArrayList<Vaccine> xuatThongTin() {
        return x;
    }
}
