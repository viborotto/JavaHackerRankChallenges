package br.com.vittoria.strings;

import java.util.Scanner;

public class Substring {

    //NOTE: slice input string with substring
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start,end));
    }
}
