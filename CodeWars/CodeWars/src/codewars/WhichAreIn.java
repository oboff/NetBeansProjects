/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;
import java.util.Set;

//2
import java.util.TreeSet;

/**
 *
 * @author oboff
 *
 * Given two arrays of strings a1 and a2 return a sorted array r in
 * lexicographical order and without duplicates of the strings of a1 which are
 * substrings of strings of a2.
 *
 * Example 1:
 *
 * a1 = ["arp", "live", "strong"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns ["arp", "live", "strong"]
 *
 * Example 2:
 *
 * a1 = ["tarp", "mice", "bull"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns []
 *
 * Notes:
 *
 * Arrays are written in "general" notation. See "Your Test Cases" for examples
 * in your language.
 *
 * Beware: rmust be without duplicates but translators to Haskell and then to
 * Coffeescript and Python introduced duplicates in a1. Don't worry about
 * duplicates in a1 in the other languages.
 * http://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> matches = new TreeSet<>();

        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    matches.add(s1);
                }
            }
        }
        String[] strings = new String[matches.size()];
        matches.toArray(strings);
        return strings;
    }

    public static String[] inArray2(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str
                        -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
