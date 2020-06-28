package lession4;

public class Activity41 {
    public static void main(String[] args) {
        int n, b, sum = 0;
        System.out.print("Armstrong numbers from 1 to 500: ");
        for(int i = 1; i <= 500; i++) {
            n = i;
            while(n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i+ "\t");
            }
            sum = 0;
        }
    }
}
