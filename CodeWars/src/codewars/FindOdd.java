/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//3
import static java.util.Arrays.stream;

/**
 *
 * @author oboff
 *
 * Given an array, find the int that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */
public class FindOdd {

    public static int findIt(int[] A) {

        List<Integer> li = new ArrayList<>();
        for (int i : A) {
            //System.out.printf("%d ", i);
            li.add(i);
        }
        //System.out.println(li);
        Map<Integer, Long> m = li.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(m);
        m.values().removeIf(x -> x % 2 == 0);
        //System.out.println(m);
        Object[] result = m.keySet().toArray();

        return (int) result[0];
    }
    
    public static int findIt2(int[] A) {
        int odd = 0;

        for (int i : A) {
            odd ^= i;
        }

        return odd;
    }
    
    public static int findIt3(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }
}
