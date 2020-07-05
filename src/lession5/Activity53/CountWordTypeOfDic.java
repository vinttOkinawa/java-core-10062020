package lession5.Activity53;

public class CountWordTypeOfDic {
    private int numberOfAnhViet;
    private int numberOfVietAnh;

    public CountWordTypeOfDic() {
    }

    public CountWordTypeOfDic(int numberOfAnhViet, int numberOfVietAnh) {
        this.numberOfAnhViet = numberOfAnhViet;
        this.numberOfVietAnh = numberOfVietAnh;
    }

    public int getNumberOfAnhViet() {
        return numberOfAnhViet;
    }

    public void setNumberOfAnhViet(int numberOfAnhViet) {
        this.numberOfAnhViet = numberOfAnhViet;
    }

    public int getNumberOfVietAnh() {
        return numberOfVietAnh;
    }

    public void setNumberOfVietAnh(int numberOfVietAnh) {
        this.numberOfVietAnh = numberOfVietAnh;
    }
}
