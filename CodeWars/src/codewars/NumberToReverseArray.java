/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;
import java.util.List;

/*
Given a non-negative integer, return an array containing a list of independent digits in reverse order.

Example:

348597 => [7,9,5,8,4,3]
 */
public class NumberToReverseArray {

    public static int[] digitize(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();
        List<String> list = Arrays.asList(sb.toString().split(""));
        int[] ar = new int[list.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(list.get(i));
        }
        return ar;
    }
    
    public static int[] digitize2(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
