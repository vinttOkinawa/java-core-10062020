package lession5.Activity51;

import java.util.Scanner;

public class TestActivity51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width: ");
        float widthInput = scanner.nextFloat();

        System.out.print("Input height: ");
        float heightInput = scanner.nextFloat();

        Rectange rectange = new Rectange(widthInput, heightInput);
        System.out.println(rectange.toString());
        System.out.println("Chu vi cua hinh: " + rectange.tinhChuVi());
        System.out.println("Dien tich cua hinh: " + rectange.tinhDienTich());
        System.out.println(rectange.isSquare()?"It's a square!":"It's not a square");


    }
}
