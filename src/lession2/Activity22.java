package lession2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = n * 11;
        int n3 = n * 111;
        int tong = n + n2 + n3;
        System.out.println(n + " + " + n2 + " + " + n3 + " = " + tong);
    }
}
