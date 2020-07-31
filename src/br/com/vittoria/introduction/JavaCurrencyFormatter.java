package br.com.vittoria.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        scanner.close();

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
