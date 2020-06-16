package lession2;

public class Bai1 {
    public static void main(String[] args) {
        int a = 10;
        int b, c = 20;
        float d = 20.4f;

        // 1 bit => 2 gia tri
        // *
        // 0 va 1
        boolean flag = true;
        boolean flag2 = false;

        /* byte: 8 bit
         * **** **** => 2^8 = 256 gia tri
         * 1111 1111
         * 0000 0000
         * x111 1111: x de bieu hien dau - va + => 2^7 = 128 gia tri moi nua
         * x000 0000
        */
        byte maxByte = 127; // 0 ~ 127: 127 tduong 2^7 - 1
        byte minByte = -128; // -1 ~ -127
        // de bi tran so neu nguoi dung nhap tuoi 130
        // byte, bit thuong dung trong lap trinh nhung thoi. Vi nhu tivi tu lanh thi rat
        // han che bo nho.

        /*
        * int: 32 bit => 4 byte
        * minInt: -2^31
        * maxInt: 2^32 - 1
        *
        * */
        // K dung kieu int de luu tru tien duoc
        int maxInt = 999999999;


        /*
        * long: 64 bit
        * minLong: -2^63
        * maxLong: 2^63 - 1
        *
        * */


        /*
        * float: 32 bit => 4 byte
        *
        *
        * */
        float A = 3.5f;
        double B = 3.5;

        // String phai de trong dau ngoac kep, char thi trong dau nhay kep
        char X = ' ';
        String s = "ddd";
    }
}
