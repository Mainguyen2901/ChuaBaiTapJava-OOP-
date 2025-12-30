package BAITAP4;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;// Phạm vi truy cập là private nên ko thể lấy sang class khác

    // Hàm khởi tạo không có tham số
    public NhanVien(){

    }
    //Hàm khởi tạo có tham số
    public NhanVien(String maNV, String hoTen, double luongCoBan){
        this.maNV=maNV;
        this.hoTen=hoTen;
        this.luongCoBan=luongCoBan;
    }

    //Hàm Getter và Setter cho các thuộc tính maNV,hoTen,luongCoban

    public void setMaNV(String maNV){
        this.maNV=maNV;
    }
    public String getMaNV(){
        return maNV;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double tinhLuong(){
        return luongCoBan;
    }

    public String hienthiThongtin(){
        return "Mã nhân viên:"+maNV+"\n"+"Họ và tên:"+hoTen+"\n";
    }
}

