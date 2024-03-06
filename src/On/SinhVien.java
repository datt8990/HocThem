package On;

import java.io.Serializable;

public class SinhVien implements Serializable {

    private String ma;

    private String TenSV;

    private String sdt;

    private int trangThai;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public SinhVien(String ma, String TenSV, String sdt, int trangThai) {
        this.ma = ma;
        this.TenSV = TenSV;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }

    public SinhVien() {
    }

    public Object[] toRowTable() {
        return new Object[]{ma, TenSV, sdt, trangThai == 0 ? "Hoạt Động" : "Không Hoạt Động"};
    }

}
