/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

/**
 *
 * @author oboff
 * 
 * Given a string and a non-negative int n, return a larger string that is n
 * copies of the original string.  *
 * stringTimes("Hi", 2) → "HiHi" stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 * 
 */
public class stringTimes {
    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <n; i++ ) {
            result.append(str);
        }
        return result.toString();
    }
}
