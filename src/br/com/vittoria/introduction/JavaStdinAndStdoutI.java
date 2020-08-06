package br.com.vittoria.introduction;
import java.util.*;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaStdinAndStdoutI {

    //NOTE: Input with Scanner and print respective stdin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
