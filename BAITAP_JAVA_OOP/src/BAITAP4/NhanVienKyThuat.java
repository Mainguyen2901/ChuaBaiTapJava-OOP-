package BAITAP4;

public class NhanVienKyThuat extends NhanVien{
    public int sogioLamThem;
    public NhanVienKyThuat(String maNV, String hoTen, double luongCoBan, int sogioLamThem){
        super(maNV,hoTen,luongCoBan);
        this.sogioLamThem=sogioLamThem;
    }

    public double tinhLuong(){
        return getLuongCoBan()+sogioLamThem*150000;
    }


}
