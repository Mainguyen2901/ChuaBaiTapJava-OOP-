package BAITAP3;

public class PartTimeEmployee extends Employee {
    private int workingHours;
    private double ratePerHour;
    public PartTimeEmployee(String name, String id,int workingHours, double ratePerHour ) {
        super(name, id, 0);// ngầm truyền qua constructor của cha
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public double caculateSalary(){
        return workingHours*ratePerHour;
    }
}
