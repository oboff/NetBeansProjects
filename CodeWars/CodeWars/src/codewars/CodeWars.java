/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oboff
 */
public class CodeWars {

    public static void main(String[] args) {
        String s = "Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 10"; // 3 14 4 6
                                                                                     // 7 13 9 
        Scanner sc = new Scanner(s);

        int boy = 0, girl = 0;
        int boycount = 0, girlcount = 0;
        while (sc.hasNext()) {
            if (sc.hasNext("[a-zA-Z]+")) {
                ++boycount;
                sc.next();
            }
            if (sc.hasNext("[0-9]+")) {
                boy += Integer.parseInt(sc.next());
            }
            if (sc.hasNext("[a-zA-Z]+")) {
                ++girlcount;
                sc.next();
            }
            if (sc.hasNext("[0-9]+")) {
                girl += Integer.parseInt(sc.next());
            }

        }
        sc.close();
        System.out.printf("%d boys, %d girls\n", boycount, girlcount);
        System.out.printf("Difference between the boys' and girls' sums: %d\n", boy - girl);
    }
}
