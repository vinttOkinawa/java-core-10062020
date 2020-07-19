package lession6;

public class Employee {
    private String name;
    private int yearOld;
    private String sex;

    public Employee() {

    }

    public Employee(String name, int yearOld, String sex) {
        this.name = name;
        this.yearOld = yearOld;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float salaryOfMonth(String name, int yearOld, String sex) {
        return 0f;
    }

    public void print(String name, int yearOld, String sex) {
        System.out.println(getName() + getYearOld() + getSex());
    }


}
