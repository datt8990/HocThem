/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package DoneJava2;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
*/ 
public interface QuanLyNhanVien {

    List<NhanVien> fakeData();
    public String themNhanVien(NhanVien nv);
    public String xoaNhanVien(int index);
    public String suaNhanVien(int index, NhanVien newNhanVien);  
    public List<NhanVien> timKiem( String searchText);
   
    
}
