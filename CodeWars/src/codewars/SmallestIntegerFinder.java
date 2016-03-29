/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author oboff Find the smallest integer in the array.
 *
 * Given an array of integers your solution should find the smallest integer.
 * For example: Given [34, 15, 88, 2] your solution will return 2 Given [34,
 * -345, -1, 100] your solution will return -345
 *
 * You can assume, for the purpose of this kata, that the supplied array will
 * not be empty.
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    public static int findSmallestInt2(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }

}
