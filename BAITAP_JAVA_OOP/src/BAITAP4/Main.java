package BAITAP4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1=new NhanVienKyThuat("NV01","Nguyễn Thị Mai",3000000,45);
        NhanVien nv2=new NhanVienVanphong("NV02","Tạ Thị Hòa",4000000,22);
        ArrayList<NhanVien> dsNhanVien=new ArrayList<>();
        dsNhanVien.add(nv1);
        dsNhanVien.add(nv2);

        for (NhanVien nv : dsNhanVien) {
            System.out.println(nv.hienthiThongtin());
            System.out.println("Lương:"+nv.tinhLuong());
    }

    }

}
