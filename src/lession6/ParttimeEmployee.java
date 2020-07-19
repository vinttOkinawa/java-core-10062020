package lession6;

public class ParttimeEmployee extends Employee {
    private int workingTimeHour;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(int workingTimeHour) {
        this.workingTimeHour = workingTimeHour;
    }

    public ParttimeEmployee(String name, int yearOld, String sex, int workingTimeHour) {
        super(name, yearOld, sex);
        this.workingTimeHour = workingTimeHour;
    }

    public int getWorkingTimeHour() {
        return workingTimeHour;
    }

    public void setWorkingTimeHour(int workingTimeHour) {
        this.workingTimeHour = workingTimeHour;
    }

    public float salaryOfMonth(int workingTimeHour) {
        return (100000 * workingTimeHour);
    }
}
