package br.com.vittoria.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaPrimalityTest {
        //NOTE: verify if n is prime number or not.
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            BigInteger n = scanner.nextBigInteger();

            if(n.isProbablePrime(100)){
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
}

