/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oboff
 *
 * Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square
 * all numbers k (0 <= k <= n) between 0 and n. Count the numbers of digits d
 * used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the
 * function taking n and d as parameters and returning this count.
 *
 * Examples:
 *
 * n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 We are
 * using the digit 1 in 1, 16, 81, 100. The total count is then 4.
 *
 * nb_dig(25, 1): the numbers of interest are 1, 4, 9, 10, 11, 12, 13, 14, 19,
 * 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441 so there
 * are 11 digits `1` for the squares of numbers between 0 and 25. Note that 121
 * has twice the digit 1.
 */
public class CountTheDigit {

    public static int nbDig(int n, int d) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            squares.add(i * i);
        }

        StringBuilder sb = new StringBuilder();
        for (int t : squares) {
            if (String.valueOf(t).contains(String.valueOf(d))) {
                sb.append(t);
            }
        }
        String str = sb.toString();
        str = str.replaceAll("[^" + d + "]", "");
        return str.length();
    }
    
    public static int nbDig2(int n, int d) {
        int needle = String.valueOf(d).charAt(0);
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String haystack = String.valueOf(i * i);
            count += (int) haystack.chars().filter(ch -> ch == needle).count();
        }
        return count;
    }
}
