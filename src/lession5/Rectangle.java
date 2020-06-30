package lession5;

public class Rectangle {
    public double width;
    public double height;
    public boolean chkIsSquare;

    public void printWidth(double width) {
        System.out.println("Width da nhap: " + width);
    }

    public void printHeight(double height) {
        System.out.println("Height da nhap: " + height);
    }

    // Check xem co phai la hinh vuong khong?
    public void isSquare(double width, double height) {
        chkIsSquare = (width == height) ? true:false;
        if (chkIsSquare) {
            System.out.println("It's a square");
        } else {
            System.out.println("It's not a square");
        }
    }

    public double chuvi(double width, double height) {
        return (width + height) / 2;
    }

    public double dientich(double width, double height) {
        return width * height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
