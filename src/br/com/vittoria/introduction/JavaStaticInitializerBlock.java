package br.com.vittoria.introduction;

import java.util.Scanner;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaStaticInitializerBlock {

    //NOTE: use static block for try and catch, to calculate area of a paralelogram
    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
