package lession3;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap va so nguyen n: ");
        int n = scanner.nextInt();

        // so luong * (1,3,5,7,9...)
        for (int i=1; i< n*2 ; i += 2)
        {
            // so luong " " in ra truoc roi den *
            for (int k=0; k < ((n-1) - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
