package lession3;

public class Activity34 {

    public static void dividedBy3(int n) {
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0) {
                if ((i == n) || (i == n-1) || (i == n-2)) {
                    System.out.println(i);
                } else
                System.out.print(i + ", ");
            }
        }
    }

    public static void dividedBy5(int n) {
        for(int i = 1; i <= n; i++){
            if(i%5 == 0) {
                if ((i == n) || (i == n-1) || (i == n-2) || (i == n-3) || (i == n-4)) {
                    System.out.println(i);
                } else
                    System.out.print(i + ", ");
            }
        }
    }

    public static void dividedBy3And5(int n) {
        for(int i = 1; i <= n; i++){
            if((i%3 == 0) && (i%5 == 0)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Divided by 3: ");
        dividedBy3(98);

        System.out.println("Divided by 5: ");
        dividedBy5(100);

        System.out.println("Divided by 3 & 5: ");
        dividedBy3And5(100);
    }
}
