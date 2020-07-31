package br.com.vittoria.strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())?       "Yes" : "No" );
    }
}
