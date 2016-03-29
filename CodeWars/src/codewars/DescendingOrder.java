/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

//solution 2
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author oboff
 * 
 * Description:
 *
 * Your task is to make a function that can take any non-negative integer as a
 * argument and return it with it's digits in descending order. Descending order
 * means that you take the highest digit and place the next highest digit
 * immediately after it.
 *
 * Examples:
 *
 * Input: 145263 Output: 654321
 *
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {

    public static int sortDesc(final int num) {
        // single-digit num returns num
        if (Integer.toString(num).length() < 2) {
            return num;
        }

        LinkedList<Integer> ll = new LinkedList<>();
        int input = num;
        while (input > 0) {
            ll.addFirst(input % 10);
            input /= 10;
        }
        Collections.sort(ll, (x, y) -> -1 * (x - y));
        String ss = ll.stream().map(x -> x.toString()).collect(Collectors.joining(""));
        return Integer.parseInt(ss);
    }

    public static int sortDesc2(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
