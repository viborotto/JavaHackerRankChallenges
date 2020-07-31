package br.com.vittoria.strings;

import java.util.Scanner;


/**
 * @author Vittoria Borotto
 *
 */
public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int len = A.length() + B.length();
        String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(len);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(output);
    }
}
