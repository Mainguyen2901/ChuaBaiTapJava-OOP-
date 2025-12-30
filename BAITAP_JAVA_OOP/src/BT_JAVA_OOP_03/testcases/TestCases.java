package BT_JAVA_OOP_03.testcases;

import BT_JAVA_OOP_03.common.BaseTest;

public class TestCases extends BaseTest {

    public void loginCRM(){
        System.out.println("Mở trình duyệt web và nhập URL https://cms.anhtester.com/login");
        System.out.println("Nhập email và password hợp lệ");
        System.out.println("Nhấn nút Login để thực hiện đăng nhập");
        System.out.println("Chuyển hướng đến được trang admin CMS");
    }
    public void testLogin(){
        CreateDriver();// vì kế thừa nên đc sử dụng luôn hàm
        loginCRM();
        closeDriver();
    }
    public void testAddCateory(){
        System.out.println("===========================================");
        CreateDriver("Edge");// vì kế thừa nên đc sử dụng luôn hàm
        loginCRM();

        System.out.println("Nhấn menu Category đến trang List Category");
        System.out.println("Nhấn add new category");
        System.out.println("Nhập đầy đủ thông tin yêu cầu cho category");
        System.out.println("Nhấn nút Save");
        System.out.println("Kiểm tra Category mới được thêm vào trang Category List");
        closeDriver("Edge");

    }

    public static void main(String[] args) {
        TestCases testcase=new TestCases();
        testcase.testLogin();
        testcase.testAddCateory();
    }
}
