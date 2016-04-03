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
 *
 * Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo".
 *
 * stringBits("Hello") → "Hlo" stringBits("Hi") → "H" stringBits("Heeololeo") →
 * "Hello"
 */
public class stringBits {

    public static String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
