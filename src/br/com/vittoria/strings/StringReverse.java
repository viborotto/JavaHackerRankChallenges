package br.com.vittoria.strings;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class StringReverse {

    //NOTE: input string to compare reverse. EqualsIgnoreCase compare length and letters, if the string equals reverse string YES, else NO
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(A.equalsIgnoreCase(new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}
