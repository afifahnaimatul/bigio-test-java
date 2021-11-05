package tesbigio1;

import java.util.ArrayList;
import java.util.Scanner;

public class number9 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String reverse = "";
        String teks = "";

        System.out.println("Input total character: ");
        int input = myObj.nextInt();
        
        for (int i = 0; i < input; i++) {
            System.out.println("Input char-" + (i+1) );
            teks += myObj.next();
        }
        
        reverse = teks;
        for (int i = teks.length()-1; i >= 0; i--) {
            reverse += teks.charAt(i);
        }
        
        System.out.println("\n=====");
        System.out.println("Palindrome result: " + reverse);
    }

}
