package br.com.vittoria.bignumber;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger a = new java.math.BigInteger(sc.next());
        java.math.BigInteger b = new java.math.BigInteger   (sc.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
