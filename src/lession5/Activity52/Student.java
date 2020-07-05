package lession5.Activity52;

public class Student {
    private String name;
    private float gpa;

    // Khai bao constructor
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {
    }

    // Check gpa pass or fail
    public boolean pass() {
        if(gpa >=1.5) {
            return true;
        } else
            return false;
    }

    // Print name and gpa
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }

    // Phuong thuc get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
