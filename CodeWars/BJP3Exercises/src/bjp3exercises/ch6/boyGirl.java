/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bjp3exercises.ch6;

import java.util.Scanner;

/**
 *
 * @author oboff
 */
public class boyGirl {

    public static void boyGirl(Scanner sc) {
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

        System.out.printf(
                "%d boys, %d girls\n", boycount, girlcount);
        System.out.printf(
                "Difference between boys' and girls' sums: %d\n", Math.abs(boy - girl));
    }
}
