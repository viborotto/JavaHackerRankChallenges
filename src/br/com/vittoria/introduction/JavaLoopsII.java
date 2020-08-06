package br.com.vittoria.introduction;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaLoopsII {

    //NOTE: here the logic is based in an series, check the statement to explain more clearly
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double sum=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
                sum = (Math.pow(2,j)*b)+sum;
                System.out.printf("%.0f ", a+sum);
            }
            System.out.println();
        }
    }
}
