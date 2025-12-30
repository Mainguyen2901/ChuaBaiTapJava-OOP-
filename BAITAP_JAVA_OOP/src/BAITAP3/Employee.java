package BAITAP3;

public class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double caculateSalary(){
        return baseSalary;
    }

    public double caculateSalary(double tax){
        return caculateSalary()*(1-tax/100);
    }

    public String getInfor(){
        return "ID:"+id+"\n"+ "Name:"+name;// Trả về 1 chuỗi
    }

    public static void main(String[] args) {

    }

}
