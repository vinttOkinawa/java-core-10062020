package lession4;

import java.util.Scanner;

public class Acitivity43 {

    static void printArr(int n, int[] a) {
        System.out.print("Length = " + n + "; " + "elements = ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    static void mergedArray(int totalLength, int[] a, int[] b) {
        int[] mergedArray = new int[totalLength];
        int pos = 0;
        for (int element : a) {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : b) {
            mergedArray[pos] = element;
            pos++;
        }

        System.out.print("Length = " + totalLength + "; " + "elements = ");
        for (int i = 0; i < totalLength; i++) {
            System.out.print(mergedArray[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mang thu 1
        System.out.print("Enter the size of the 1st array: n = ");
        int n = scanner.nextInt();
        // Khoi tao va nhap mang thu nhat
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }

        // Mang thu 2
        System.out.print("Enter the size of the 2nd array: n = ");
        int m = scanner.nextInt();
        // Khoi tao va nhap mang thu hai
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("b["+i+"] = ");
            b[i] = scanner.nextInt();
        }

        // Print length va mang arr
        System.out.println();
        System.out.println("Original array: ");
        printArr(n, a);
        printArr(m, b);

        // Merge array
        System.out.println();
        System.out.println("Merged array: ");
        int totalLength = n + m;
        int[] mergedArr = new int[totalLength];

        mergedArray(totalLength, a, b);
    }
}
