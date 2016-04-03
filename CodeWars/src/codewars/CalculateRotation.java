/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author oboff
 *
 * The goal of this exercise is to write a method that takes two strings as
 * parameters and returns an integer n, where n is equal to the amount of spaces
 * "rotated forward" the second string is relative to the first string (more
 * precisely, to the first character of the first string).
 *
 * For instance, take the strings "fatigue" and "tiguefa". In this case, the
 * first string has been rotated 5 characters forward to produce the second
 * string, so 5 would be returned.
 *
 * If the second string isn't a valid rotation of the first string, the method
 * returns -1. Examples:
 *
 * "coffee", "eecoff" => 2
 *
 * "eecoff", "coffee" => 4
 *
 * "moose", "Moose" => -1
 *
 * "isn't", "'tisn" => 2
 *
 * "Esham", "Esham" => 0
 *
 * "dog", "god" => -1
 *
 * http://www.codewars.com/kata/5596f6e9529e9ab6fb000014/train/java
 */
public class CalculateRotation {

    static int shiftedDiff(String first, String second) {
        if (first.matches("[\\p{Blank}+]")) return -1;
        String secondo = second + second;
        return secondo.indexOf(first);
    }
}
