package lession3;

import java.util.Scanner;

public class Activity33 {

    public static void binaryNum(int n) {
        if (n > 1) {
            binaryNum(n / 2);
        }
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        System.out.print("Input a Decimal Number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Binary number is: ");
        binaryNum(n);
    }
}
