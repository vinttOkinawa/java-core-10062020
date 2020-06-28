package lession4;

import java.util.Arrays;
import java.util.Scanner;

public class Activity42 {

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

    // mang chi chua cac phan tu duy nhat, tra ve mang kieu int[]
    public static int[] uniqueArr(int[] a) {
        int aLength = a.length;
        for (int i = 0; i < aLength; i++) {
            for (int j = i +1; j < aLength; j++) {
                if(a[i] == a[j]) {
                    a[j] = a[aLength - 1];
                    aLength--;
                    j--;
                }
            }
        }
        int[] arrUnique = Arrays.copyOf(a, aLength);
        return arrUnique;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: n = ");
        int n = scanner.nextInt();
        // Khoi tao mang arr
        int[] a = new int[n];
        // Nhap mang ban dau
        inputArr(a);

        // Print ra mang ban dau va length
        System.out.println();
        System.out.println("Original array: ");
        printArr(n, a);

        // Remove duplicate element in array and print it
        int[] arrUnique = uniqueArr(a);
        System.out.println();
        System.out.println("Array after remove all duplicate elements: ");
        printArr(arrUnique.length, arrUnique);
    }
}
