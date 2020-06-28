package lession4;

import java.util.Scanner;

public class Activity44 {

    static Scanner scanner = new Scanner(System.in);

    // Lay gia tri va vi tri cua phan tu lon nhat trong mang
    public static void getMax(int[] a) {
        int maxElement = a[0];
        int maxPos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxElement) {
                maxElement = a[i];
                maxPos = i;
            }
        }
        System.out.println("Value and position of maximum element: Value is "
                + maxElement +"\t" + "- Position is "+ maxPos);
    }

    // Lay gia tri va vi tri cua phan tu nho nhat trong mang
    public static void getMin(int[] a) {
        int minElement = a[0];
        int minPos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minElement) {
                minElement = a[i];
                minPos = i;
            }
        }
        System.out.println("Value and position of minnimum element: Value is "
                + minElement +"\t" + "- Position is "+ minPos);
    }

    // Lay gia tri va vi tri cua phan tu lon thu 2 trong mang
    public static void getMaxSecond(int[] a) {
        int largestMax = 0;
        int secondMax = 0;
        int secondMaxPos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largestMax) {
                secondMax = largestMax;
                largestMax = a[i];
                secondMaxPos = i;
            } else if (a[i] > secondMax){
                secondMax = a[i];
                secondMaxPos = i;
            }
        }
        System.out.println("Value and position of 2nd maximum element : Value is "
                + secondMax +"\t" + "- Position is "+ secondMaxPos);
    }

    // Lay gia tri va vi tri cua phan tu nho thu 2 trong mang
    public static void getMinSecond(int[] a) {

        int smallest = Integer.MAX_VALUE;
        int smaller = Integer.MAX_VALUE;
        int smallerPos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                smaller = smallest;
                smallest = a[i];
                smallerPos = i;
            } else if (a[i] < smaller && a[i] > smallest){
                smaller = a[i];
                smallerPos = i;
            }
        }
        System.out.println("Value and position of 2nd minimum element : Value is "
                + smaller +"\t" + "- Position is "+ smallerPos);
    }

    public static int[] replaceNagativeByZero(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }
        return a;
    }

    public static int[] sortArr(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] copyArr(int[] a) {
        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];
        // Copy elements of a[] to b[]
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
    // Nhap mang
    public static void inputArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }

    // In mang
    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    //public static void {}
    public static void main(String[] args) {
        System.out.print("Enter elements of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        // Nhap mang ban dau
        inputArr(a);

        // In ra vi tri va phan tu lon nhat trong mang
        int[] d = copyArr(a);
        getMax(d);

        // In ra vi tri va phan tu nho nhat trong mang
        int[] e = copyArr(a);
        getMin(e);

        // In ra vi tri va phan tu lon thu 2 trong mang
        int[] f = copyArr(a);
        getMaxSecond(f);

        // In ra vi tri va phan tu nho thu 2 trong mang
        int[] g = copyArr(a);
        getMinSecond(g);

        // Thay the cac phan tu am thanh so 0
        System.out.print("Replace all negative element by zero: ");
        int[] b = copyArr(a);
        int[] replacedArr = replaceNagativeByZero(b);
        printArr(replacedArr);

        System.out.print("Sort the array in ascending order: ");
        int[] c = copyArr(a);
        int[] sortedArr = sortArr(c);
        printArr(sortedArr);
    }
}
