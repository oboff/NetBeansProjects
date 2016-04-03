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
/*
Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

Example:    
5.5589 is rounded 5.56   
3.3424 is rounded 3.34
 */
public class FormatDecimalPlaces {

    public static double TwoDecimalPlaces(double number) {
        String s = String.format("%.2f", number);
        return Double.parseDouble(s);
    }
    
    public static double TwoDecimalPlaces2(double number) {
        return (Math.round(number * 100.0)) / 100.0;
    }
}
