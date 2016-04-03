/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalinterfaces;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author oboff
 */
public class FunctionalInterfaces {

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public static void useless(int value) {
        if (value == 0) {
            throw new RuntimeException("I don't like this value.");
        }
        sleep();
        System.out.println("called useless with " + value);
    }

    public static int op1(int value) {
        sleep();
        return value * 2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timeit.code(() -> useless(1));
        Timeit.code(() -> useless(2));
        try {
            Timeit.code(() -> useless(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Timeit.code(() -> op1(2));
        
        List<Integer> values = Arrays.asList(1,2,3);
        values.forEach(x -> Timeit.code(() -> op1(x)));
    }

}
