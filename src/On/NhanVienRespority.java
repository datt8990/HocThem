package On;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NhanVienRespority {

    List<SinhVien> listSV = new ArrayList<>();

    public List<SinhVien> getDataFromDB() {
        String query = "select MaNV,MatKhau,HoTen,VaiTro from NhanVien";
        try (Connection conn = ) {

        } catch (Exception e) {
        }
    }

}
