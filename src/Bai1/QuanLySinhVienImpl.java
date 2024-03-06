/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLySinhVienImpl implements QuanLySinhVien {

    private List<SinhVien> listSV = new ArrayList<>();

    @Override
    public List<SinhVien> fakedata() {
        listSV.add(new SinhVien("SV000", "Nguyễn Văn A", 0, "UDPM"));
        listSV.add(new SinhVien("SV001", "Trịnh Thị Quyên", 1, "LT Game"));
        listSV.add(new SinhVien("SV002", "Nguyễn Thị Hai Lúa", 1, "LT Web"));
        listSV.add(new SinhVien("SV003", "Trần Văn Trọng", 0, "LT Mobile"));
        listSV.add(new SinhVien("SV004", "Quyết Tiến Long", 0, "UDPM"));
        return listSV;
    }

    @Override
    public String them(SinhVien sinhVien) {
        if (sinhVien != null) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
    
    @Override
    public String xoaSinhVien(int index) {
        if (index != -1) {
            listSV.remove(index);
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
