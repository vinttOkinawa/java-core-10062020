package lession2;

import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNum + " x " + i + " = " + (inputNum * i));
        }
    }
}
