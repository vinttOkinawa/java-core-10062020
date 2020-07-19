package lession6;

public class FulltimeEmployee extends Employee {
    private int typeEmployee;
    private int overTimeDay;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int typeEmployee, int overTimeDay) {
        this.typeEmployee = typeEmployee;
        this.overTimeDay = overTimeDay;
    }

    public FulltimeEmployee(String name, int yearOld, String sex, int typeEmployee, int overTimeDay) {
        super(name, yearOld, sex);
        this.typeEmployee = typeEmployee;
        this.overTimeDay = overTimeDay;
    }

    public int getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(int typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    public float salaryOfMonth(int typeEmployee, int overTimeDay) {
        // typeEmployee = 1 => Leader, else => Normal Employee
        if(typeEmployee == 1) {
            return (20000000 + (800000*overTimeDay));
        } else {
            return (10000000 + (800000*overTimeDay));
        }
    }

    public void print(String name, int yearOld, String sex, int typeEmployee, int overTimeDay) {
        super.print(name, yearOld, sex);
        System.out.println("Salary: " + salaryOfMonth(typeEmployee, overTimeDay));
    }

}
