package BT_JAVA_OOP_03.common;
public class BaseTest {
    public void CreateDriver(){
        // Biến static thì lấy tên hàm.thuộc tính
        System.out.println("Browser:"+Constants.browser);
        System.out.println("Browser:"+Constants.report);
        System.out.println("Browser:"+Constants.headless);
    }

    public void CreateDriver(String browser){
        // Biến static thì lấy tên hàm.thuộc tính
        System.out.println("Browser:"+browser);
        System.out.println("Browser:"+Constants.report);
        System.out.println("Browser:"+Constants.headless);
    }
    public void closeDriver(){
        System.out.println("Closed Browser:"+Constants.browser);
    }
    public void closeDriver(String browser){
        System.out.println("Closed Browser:"+browser);// Đa hình

    }
}
