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
Given a non-empty string like "Code" return a string like "CCoCodCode".  *
 * stringSplosion("Code") → "CCoCodCode" stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"

 * 
 */
public class stringSplosion {
    public static String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            sb.append(str.substring(0, i));
        }
        
        return sb.toString();
    }
}
