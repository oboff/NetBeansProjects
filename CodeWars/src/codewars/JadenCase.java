package codewars;

import java.util.ArrayList;
import java.util.Arrays; //2
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oboff
 *
 * Description:
 *
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate
 * Kid (2010) and After Earth (2013). Jaden is also known for some of his
 * philosophy that he delivers via Twitter. When writing on Twitter, he is known
 * for almost always capitalizing every word.
 *
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized
 * in the same way he originally typed them.
 *
 * Example:
 *
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real" Note that the
 * Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] split = phrase.split(" ");
        List<String> list = new ArrayList<>();
        for (String s : split) {
            list.add(Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()));
        }
        String result = list.stream()
                .collect(Collectors.joining(" "));
        return result;
    }

    public String toJadenCase2(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

}
