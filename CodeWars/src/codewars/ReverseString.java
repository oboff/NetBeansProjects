/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author oboff
 */
public class ReverseString {
    public static String reverse(String str) {
        return new StringBuilder()
                .append(str)
                .reverse()
                .toString();
    }
}
