package BAITAP1;

public class NhanVien {
    public String name;
    public int age;
    public String gender;
    public String phone;
    public String address;

    public NhanVien(String name,int age,String gender, String phone, String address){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phone=phone;
        this.address=address;
    }

    public void getInfor(){
        System.out.println("Thông tin nhân viên là:");
        System.out.println("Họ và tên:"+name);
        System.out.println("Giới tính:"+gender);
        System.out.println("Tuổi:"+age);
        System.out.println("Số điện thoại:"+phone);
        System.out.println("Địa chỉ:"+address);
    }

    public static void main(String[] args) {
        NhanVien nhanvien=new NhanVien("Nguyễn Thị Mai",30,"Nữ","0368226561","Nam định");
        nhanvien.getInfor();
    }
}

