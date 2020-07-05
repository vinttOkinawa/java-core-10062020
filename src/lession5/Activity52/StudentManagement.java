package lession5.Activity52;


import java.util.Scanner;

public class StudentManagement {
    private Student[] students;
    private int totalStudent;

    // Constructor
    public StudentManagement(Student[] students, int totalStudent) {
        this.students = students;
        this.totalStudent = totalStudent;
    }

    public StudentManagement(Student[] students) {
        this.students = students;
        totalStudent = students.length;
    }

/*    // Cach khac
    public CheckPassOrFail checkPassOrFail() {
        int numberOfPass = 0;
        for (Student student: students) {
            if(student.pass()) {
                numberOfPass++;
            }
        }
        int numberOfFail = totalStudent - numberOfPass;
        CheckPassOrFail checkResult = new CheckPassOrFail(numberOfPass, numberOfFail);
        return checkResult;
    }*/

    // Number of students PASS
    public int numberOfPass() {
        int cnt = 0;
        for (Student student: students) {
            if (student.pass()) {
                cnt++;
            }
        }
        return cnt;
    }
    // Number of students fail
    public int numberOfFail() {
        int cnt = 0;
        for (Student student: students) {
            if (!student.pass()) {
                cnt++;
            }
        }
        return cnt;
    }

    // Highest Student
    public Student hightestStudent() {
        float max = students[0].getGpa();
        Student result = students[0];
        for (Student student: students) {
            if (student.getGpa() > max) {
                result = student;
                max = student.getGpa();
            }
        }
        return result;
    }

    //Lowest Student
    public Student lowestStudent() {
        float min = students[0].getGpa();
        Student result = students[0];
        for (Student student: students) {
            if (student.getGpa() < min) {
                result = student;
                min = student.getGpa();
            }
        }
        return result;
    }

    // Getter and setter

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }
}
