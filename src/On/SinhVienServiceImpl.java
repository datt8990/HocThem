package On;

import On.SinhVien;
import On.SinhVienService;
import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    List<SinhVien> list = new ArrayList<>();

    @Override
    public List<SinhVien> fakedata() {
        list.add(new SinhVien("SV001", "Nguyễn Văn A", "0123456789", 0));
        list.add(new SinhVien("SV002", "Nguyễn Văn B", "0123450000", 1));
        list.add(new SinhVien("SV003", "Nguyễn Văn C", "0123789", 1));
        list.add(new SinhVien("SV004", "Nguyễn Văn D", "456789", 0));
        list.add(new SinhVien("SV005", "Nguyễn Văn F", "01234567", 1));
        return list;
    }

    @Override
    public String themSinhVien(SinhVien sv) {
        if (sv != null) {
            list.add(sv);
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String xoaSinhVien(int index) {
        if (index != -1) {
            list.remove(index);
            return "Xóa thành công";

        }
        return "Xóa thất bại";
    }

}
