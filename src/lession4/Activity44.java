package lession4;

import java.util.Scanner;

public class Activity44 {

    static Scanner scanner = new Scanner(System.in);

    // Nhap mang
    public static void inputArr(int[] a) {
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }

    // In mang
    public static void printArr(int n, int[] a) {
        System.out.print("Length = " + n + "; ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    //public static void {}
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu mang: ");
        int n = scanner.nextInt();
        // Khoi tao mang arr
        int[] a = new int[n];
        // Nhap mang ban dau
        inputArr(a);

    }
}
