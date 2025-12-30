package BAITAP4;

public class NhanVienVanphong extends NhanVien{
    public int songayLamViec;

    public NhanVienVanphong(String maNV, String hoTen, double luongCoBan, int songayLamViec){
        super(maNV,hoTen,luongCoBan);
        this.songayLamViec=songayLamViec;
    }
    public double tinhLuong(){
        return getLuongCoBan()+songayLamViec*200000;// Vì attribute luongCoBan có modifier access ="Private"
                                                   //--> không lấy được trực tiếp và phải lấy bằng hàm get
    }
}
