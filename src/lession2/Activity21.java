package lession2;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tong = a + b;
        int hieu =  a - b;
        int tich = a * b;
        int thuong = a / b;
        int sodu = a % b;
        System.out.println(a + " + " + b + " = " + tong);
        System.out.println(a + " - " + b + " = " + hieu);
        System.out.println(a + " * " + b + " = " + tich);
        System.out.println(a + " / " + b + " = " + thuong);
        System.out.println(a + " mod " + b + " = " + sodu);
    }
}
