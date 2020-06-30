package lession5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width: ");
        double widthInput = scanner.nextDouble();

        System.out.print("Input height: ");
        double heightInput = scanner.nextDouble();

        // Khoi tao lop Rectangle - Goi lop Rectangle
        Rectangle rectangle = new Rectangle(widthInput, heightInput);

        // Print width va height da nhap tu ban phim
        System.out.println();
        rectangle.printWidth(widthInput);
        rectangle.printHeight(heightInput);

        System.out.println();
        System.out.print("Chu vi cua hinh: ");
        System.out.println(rectangle.chuvi(widthInput, heightInput));

        System.out.print("Dien tich cua hinh: ");
        System.out.println(rectangle.dientich(widthInput, heightInput));

        // Check xem co phai la hinh vuong khong?
        System.out.println();
        rectangle.isSquare(widthInput, heightInput);

    }
}
