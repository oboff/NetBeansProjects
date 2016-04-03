/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;

/**
 *
 * @author oboff
 */
public class VowelCount {
    public static int getCount(String str) {
        return new StringBuilder().append(str).toString().replaceAll("[^aeiou]", "").length();
    }
    
    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
