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
 * A square of squares
 *
 * You like building blocks. You especially like building blocks that are
 * squares. And what you even like more, is to arrange them into a square of
 * square building blocks!
 *
 * However, sometimes, you can't arrange them into a square. Instead, you end up
 * with an ordinary rectangle! Those blasted things! If you just had a way to
 * know, whether you're currently working in vain… Wait! That's it! You just
 * have to check if your number of building blocks is a perfect square.
 *
 * Task
 *
 * Given an integral number, determine if it's a square number:
 *
 * In mathematics, a square number or perfect square is an integer that is the
 * square of an integer; in other words, it is the product of some integer with
 * itself. The tests will always use some integral number, so don't worry about
 * that in dynamic typed languages.
 *
 * Examples
 *
 * Square.isSquare(-1) // => false Square.isSquare( 3) // => false
 * Square.isSquare( 4) // => true Square.isSquare(25) // => true
 * Square.isSquare(26) // => false
 *
 * http://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
 */
public class Square {

    public static boolean isSquare(int n) {
        return n > 0 && n - ((int) Math.sqrt(n) * (int) Math.sqrt(n)) < 0.00001;
    }

    public static boolean isSquare2(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

}
