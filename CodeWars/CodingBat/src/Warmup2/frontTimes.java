/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

/**
 *
 * @author oboff
 */
public class frontTimes {
    public static String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        String sub = str.length() < 3 ? str : str.substring(0, 3);
        for (int i = 0; i < n; i++) {
            result.append(sub);
        }
        return result.toString();
    }
}
