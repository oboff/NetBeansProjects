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
 * Given a string, return true if the first instance of "x" in the string is
 * immediately followed by another "x".  *
 * doubleX("axxbb") → true doubleX("axaxax") → false doubleX("xxxxx") → true
 */
public class doubleX {
    public static boolean doubleX(String str) {
        return str.matches("[^x]*(xx)x*.*");
    }
}
