package br.com.vittoria.introduction;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaLoopsI {

    private static final Scanner scanner = new Scanner(System.in);

    //NOTE: Input an Int and with Regular Expression format, print respective multiplication table
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1; i<=10; i++){
            int result = N*i;
            System.out.printf("%d x %d = %d\n", N, i, result);
        }
    }
}
