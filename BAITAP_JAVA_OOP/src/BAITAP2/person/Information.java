package BAITAP2.person;

public class Information {
    public static void main(String[] args) {
        Person person =new Person("Nguyễn Thị Mai",30,"Nữ","Nam Định","0368226561");
        System.out.println(person.getName());;
        System.out.println(person.getAge());;
        System.out.println(person.getGender());;
        System.out.println(person.getAddress());;
        System.out.println(person.getPhone());;
    }
}
