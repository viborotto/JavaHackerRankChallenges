package br.com.vittoria.introduction;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaOutputFormatting {

    //NOTE: Input and string and number, that will be separeted by an regular expression, and if the number have 2 digits so add a zero before like that: 060
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
    }
}
