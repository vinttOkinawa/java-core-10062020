package lession3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao username: ");
        String userName = scanner.nextLine();

        // exits
        // co tu 2 lenh tro len thi phai cho vao {} sau if
        /*
        * Neu sau if co 2 cau lenh ma k bo vao block, thi if se thuc hien cau lenh
        * thu 2 cua if bat ke if la true hay false
        * */
        if(userName.equals("vintt")) {
            System.out.println("user da ton tai, vui long chon user khac");
            return;
        }

        System.out.println("Nhap vao password");
        String pass = scanner.nextLine();
    }
}
