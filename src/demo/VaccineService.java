/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class VaccineService {

    ArrayList<Vaccine> listPH = new ArrayList<>();

    public void nhapThongTin(Vaccine ph) {
        listPH.add(ph);
    }

    public ArrayList<Vaccine> xuatThongTin() {
        return listPH;
    }

    public void sapXep() {
        listPH.sort((o1, o2) -> {
            return Float.compare(o2.getThoiGianTacDung(), o1.getThoiGianTacDung()); 
        });
    }
}
