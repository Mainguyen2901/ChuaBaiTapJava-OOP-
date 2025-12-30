package BAITAP3;

public class FullTimeEmployee extends Employee {
    public double bonus;
    public FullTimeEmployee(String id, String name, double baseSalary, double bonus){

        super(id,name,baseSalary);
        this.bonus=bonus;

    }

    public double caculateSalary(){

        return getBaseSalary()+bonus;// Vì phạm vi truy cập của baseSalary là private nên ko thể lấy trực tiếp
                                     // Do đó return baseSalary+bonus-> getBaseSalary()+bonus
    }

}
