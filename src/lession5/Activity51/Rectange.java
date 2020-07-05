package lession5.Activity51;

public class Rectange {
    private float width;
    private float height;

    // Tinh chu vi
    public float tinhChuVi() {
        return (width + height) * 2;
    }

    // Tinh dien tich
    public float tinhDienTich() {
        return width * height;
    }

    // Check la hinh vuong hay khong?
    public boolean isSquare() {
        if (width == height) {
            return true;
        } else
            return false;
    }

    // In thong tin width va height
    @Override
    public String toString() {
        return "Rectange{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    // Constructor
    public Rectange() {
    }

    public Rectange(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
