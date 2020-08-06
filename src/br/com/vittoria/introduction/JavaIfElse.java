package br.com.vittoria.introduction;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    //NOTE: Input a value N. RegularExpressions:
    // The condicional say: if N is divisible by N or, greater than 6 and less than 20 print Weird. Else print Not Weird
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if ((N%2!=0) || (N >= 6 && N <= 20)){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
