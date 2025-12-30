package BAITAP3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees= new Employee[2];
        employees[0]=new FullTimeEmployee("E01", "Mai", 10000000, 2000000);
        employees[1]=new PartTimeEmployee("E02", "An", 80, 100000);

        for (Employee e:employees){
            System.out.println("Lương của bạn là:"+e.caculateSalary()+" đồng");
        }
    }
}
