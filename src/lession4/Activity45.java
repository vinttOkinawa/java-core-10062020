package lession4;

import java.util.Scanner;

public class Activity45 {

    public static void reverseStr(String strInput) {
        String rs = "";
        for (int i = strInput.length()-1; i>=0; i--) {
            rs = rs + strInput.charAt(i);
        }
        System.out.println("Reverse of that string is: " + rs);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();

        reverseStr(strInput);
    }
}
