package br.com.vittoria.data_structure;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class Java1DArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
