package lession5.Activity53;

import lession5.Activity52.Student;

import java.util.Scanner;

public class TestActivity53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Total record of dictionary
        System.out.print("Total of word: ");
        int n = sc.nextInt();
        sc.nextLine();

        String keyInput;
        String valueInput;
        String typeInput;
        Word[] words = new Word[n];
        // Input word
        for(int i = 0; i < n; i++){
            System.out.print("Input type of dictionary! 1: Anh Viet, 2: Viet Anh ");
            typeInput = sc.nextLine();
            System.out.print("Key of word " + (i+1) + ": ");
            keyInput = sc.nextLine();
            System.out.print("Mean of word " + (i+1) + ": ");
            valueInput = sc.nextLine();
            words[i] = new Word(keyInput, valueInput, typeInput);
        }

        Dictionary dictionary = new Dictionary(words);

        // Search word
        System.out.println("Input word search and type of dic: ");
        System.out.print("Type of dic: ");
        typeInput = sc.nextLine();
        System.out.print("Key of word: " );
        keyInput = sc.nextLine();

        Word mean = dictionary.findWord(typeInput, keyInput);
        System.out.println("Mean of word: " + mean.getName());

        // In ra thống kê của chương trình từ điển (bao nhiêu từ AV, bao nhiêu từ VA)
        CountWordTypeOfDic rs = dictionary.countWordTypeOfDic();
        System.out.println("Tong tu Anh-Viet: " +rs.getNumberOfAnhViet());
        System.out.println("Tong tu Viet-Anh: " +rs.getNumberOfVietAnh());
    }
}
