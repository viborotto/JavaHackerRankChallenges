package br.com.vittoria.data_structure;

import java.lang.reflect.Method;

/**
 * @author Vittoria Borotto
 *
 */
class Printer {
    //Generic Methods:
    public <T> void printArray(T[] array){
        for(T item: array){
            System.out.println(item);
        }
    }
}

public class Java2DArray {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
