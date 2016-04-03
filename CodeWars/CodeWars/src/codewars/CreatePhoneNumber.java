/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author oboff
 * 
 * Write a function that accepts an array of 10 integers (between 0 and 9), that
 * returns a string of those numbers in the form of a phone number.
 *
 * Example:
 *
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // =>
 * returns "(123) 456-7890" The returned format must be correct in order to
 * complete this challenge. Don't forget the space after the closing parenthese!
 * http://www.codewars.com/kata/create-phone-number/train/java
 */
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < 3; i++)
            sb.append(numbers[i]);
        sb.append(") ");
        for (int i = 3; i < 6; i++) {
            sb.append(numbers[i]);
        }
        sb.append("-");
        for (int i = 6; i < 10; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }
    
    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}
