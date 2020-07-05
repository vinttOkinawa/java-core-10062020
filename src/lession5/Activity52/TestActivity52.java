package lession5.Activity52;

import java.util.Scanner;

public class TestActivity52 {
    public static void main(String[] args) {
        // Nhap tong so SV
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int n = sc.nextInt();
        String name;
        float gpa;
        Student[] students = new Student[n];
        // Nhap SV
        for(int i=0; i<n; i++){
            System.out.print("Ten sinh vien thu " + (i+1) + ": ");
            name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("GPA sinh vien thu " + (i+1) + ": ");
            gpa = sc.nextFloat();
            students[i] = new Student(name, gpa);
        }

        StudentManagement st = new StudentManagement(students);

        // Print tong sv co GPA Pass
        System.out.println("Number of students pass: " + st.numberOfPass());

        // Print tong sv co GPA fail
        System.out.println("Number of students fail: " + st.numberOfFail());

/*        // Cach khac, dung class CheckPassOrFail
        CheckPassOrFail rs = st.checkPassOrFail();
        System.out.println("Total Fail: " + rs.getNumberOfFail());
        System.out.println("Total Pass: " + rs.getNumberOfPass());*/

        // Print SV co GPA cao nhat
        Student hightestStudent = st.hightestStudent();
        System.out.println("SV cao nhat: Ten: " + hightestStudent.getName() +
                ", GPA: " + hightestStudent.getGpa());

        // Print SV co GPA thap nhat
        Student lowestStudent = st.lowestStudent();
        System.out.println("SV thap nhat: Ten " + lowestStudent.getName() +
                ", GPA: " + lowestStudent.getGpa());



    }
}
