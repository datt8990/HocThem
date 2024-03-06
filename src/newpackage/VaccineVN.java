/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author admin
 */
public class VaccineVN extends Vaccine{
    private String quocgia;

    public VaccineVN() {
    }

    public VaccineVN(String quocgia) {
        this.quocgia = quocgia;
    }

    public VaccineVN(String quocgia, String MaVC, String tenVC, Float thoigiantacdung, String ngayhethan) {
        super(MaVC, tenVC, thoigiantacdung, ngayhethan);
        this.quocgia = quocgia;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }
    public void inthongtin(){
        System.out.println("quốc gia: việt nam");
    
}
}
