package lession6;

import lession5.Activity53.Word;

import java.util.Scanner;

public class Activity61 {;
    public static void main(String[] args) {
        System.out.print("Input total employee: ");
        Scanner sc = new Scanner(System.in);
        int totalEmployee = sc.nextInt();

        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee();
        ParttimeEmployee parttimeEmployee = new ParttimeEmployee();
        String name = null;
        int yearOld = 0;
        String sex = null;
        int typeContract;
        int typeEmployee = 0;
        int overTimeDay = 0;

        // Input info of employee
        for(int i = 0; i < totalEmployee; i++){
            System.out.print("Name employee " + (i+1) +": ");
            name = sc.nextLine();
            sc.nextLine();
            System.out.print("Year old employee " + (i+1) + ": ");
            yearOld = sc.nextInt();
            System.out.print("Sex employee " + (i+1) + ": ");
            sex = sc.nextLine();
            sc.nextLine();
            System.out.print("Type contract? 1: Fulltime, 2: Parttime ");
            typeContract = sc.nextInt();
            sc.nextLine();

            // if typeContract:1 => Full time => Input day overtime

            if(typeContract == 1) {
                System.out.print("Type employee? 1: Leader, 2: Normal Employee ");
                typeEmployee = sc.nextInt();

                System.out.print("Overtime Day of employee: " + (i+1) + ": ");
                overTimeDay = sc.nextInt();

                fulltimeEmployee.salaryOfMonth(typeEmployee, overTimeDay);
            } else {
                System.out.print("Working time hour of employee: " + (i+1) + ": ");
                int workingTimeHour = sc.nextInt();

                parttimeEmployee.salaryOfMonth(workingTimeHour);
            }

        }

    }
}
