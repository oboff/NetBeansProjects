/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author oboff
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is
 * allowed, so "xxx" contains 2 "xx". countXX("abcxx") → 1 countXX("xxx") → 2
 * countXX("xxxx") → 3
 */
public class countXX {

    public static int countXX2(String str) {
        int tot = Arrays.stream(str.replaceAll("[^x]", "_").split("_"))
                .filter(x -> x.matches("(xx)x*"))
                .mapToInt(x -> x.length() - 1)
                .reduce(0, (x, y) -> x + y);

        return tot;
    }

    public static int countXX(String str) {
        int tot = 0;
        ArrayList<String> m = new ArrayList(Arrays.asList(str.replaceAll("[^x]", "_").split("_")));
        for (String s : m) {
            if (!s.isEmpty()) {
                tot += (s.length() - 1);
            }
        }

        return tot;
    }
}
