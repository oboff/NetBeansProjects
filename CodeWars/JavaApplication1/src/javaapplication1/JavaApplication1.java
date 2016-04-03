/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparingInt;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.*;

/**
 *
 * @author oboff
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            double x = Math.random();
//            int y = (int) (x * 10);
//            System.out.print(x + "\t" + (float) x + "\t" + y + "\n");
//        }
//        char c = 'a';
//        for (int i = 0; i < 'z' - 'a'; i++) {
//            System.out.print(++c + " ");
//        }
//        int z = 'z';
//        System.out.printf("%d\n", z);
//
////        Scanner input = new Scanner(System.in);
////        while (true) {
////            System.out.println("Enter text:\n");
////            System.out.println(input.next());
////        }
//        System.out.println("capple".compareToIgnoreCase("banana"));
//        System.out.printf("%d\n", 0xDEADBEEF);
//        System.out.println(Integer.toBinaryString(23));
//
//        DecimalFormat format = new DecimalFormat("#,###.00");
//        System.out.printf("$%s\n", format.format(3252521391.13));
//        System.out.println(Integer.toHexString(1234));
//
//        System.out.println(sum(1, 3, 41));
//
//        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
//        System.out.println(city);
//
//        double[] mylist = {23, 21.1, 134, 294, 2911.12};
//        List<Double> mylist2 = new ArrayList<Double>();
//        for (double item : mylist) {
//            mylist2.add(item);
//        }
////        System.out.println(mylist2.toString());
//        System.out.println(mylist2.stream().mapToDouble((x) -> x).reduce(0, (x, y) -> x + y));
//        System.out.println(sum(mylist));
//        mylist2.stream().filter((x) -> x < 300).forEach(x -> System.out.print(x + "\t"));
//        System.out.println();
//        DeckOfCards();
//        
//        int[] list = {1, 2, 3, 5, 4};
//
//        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
//// Swap list[i] with list[j]
//            int temp = list[i];
//            System.out.printf("%d\t", temp);
//            list[i] = list[j];
//            System.out.printf("%d\t", list[i]);
//            list[j] = temp;
//            System.out.println(list[j]);
//            for (int l : list) { System.out.printf("%d", l); };
//            System.out.println();
//        }
//        
//        
//        Arrays.sort(mylist);
//        
//        System.out.println(Arrays.toString(mylist));
//        
//        Point p = new Point(3,4);
//        System.out.println(p.toString());
//        System.out.println(addXY(p));
//        Shape sh = new Point(3,1);
//        sh.printMe();
//        
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello World!");
//        sb.reverse();
//        System.out.println(sb.toString());
//        System.out.println(sb.capacity());
//        
//        Deque a = new java.util.LinkedList<>();

        String text = "Good morning. Have a good class.\n"
                + "Have a good visit. Have fun!";

        //Pattern rx = Pattern.compile("[\p{Alnum}]+");
        //GOOD CODE
//        List<String> texts;
//        texts = Arrays.asList(text.split(" "));
//        System.out.println(texts);
//        List<char[]> san = texts.stream()
//                .map(x -> x.replaceAll("[\\p{Punct}]", ""))
//                //.filter(x -> Pattern.matches("[\\p{Alnum}]+", x))
//                .map(x -> x.toCharArray())
//                //.peek(System.out::println)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
        StringReader sr = new StringReader(text);
        BufferedReader br = new BufferedReader(sr);

        String longest
                = br.lines()
                .max(comparingInt(String::length))
                .get();

        System.out.println(longest);

        Ordering or = new Ordering();
        System.out.println(or.orderWord("Hello, World!"));
        
        Comparator<String> comp = (String s1, String s2) ->
                Integer.compare(s1.length(), s2.length());
        
        
        
    }

    public static class Ordering {

        public String orderWord(String s) {
            //your great code here:
            //assertEquals(" !,HWdellloor", order.orderWord("Hello, World!"));
            if (null != s && "" != s) {
                char[] ch = s.toCharArray();
                java.util.Arrays.sort(ch);
                return String.valueOf(ch);
             
            }
            return null;
        }
    }

    public static int addXY(Point x) {
        System.out.println(x.toString());
        return x.x + x.y;
    }

    public static double sum(double... a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum;
    }

    public static void DeckOfCards() {

        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
// Initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
// Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
// Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            System.out.printf("index: %-10d", index);
            int temp = deck[i];
            System.out.printf("temp: %-10d", i, temp);
            deck[i] = deck[index];
            System.out.printf("deck[%d]: %-10d", i, deck[i]);
            deck[index] = temp;
            System.out.printf("deck[%d]: %-10d\n", index, deck[index]);
        }
// Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": "
                    + rank + " of " + suit);
        }
    }
}

class Point extends Shape {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printMe() {
        System.out.println("I'm a Point.");
    }
}

class Shape {

    public void printMe() {
        System.out.println("I'm a Shape.");
    }
}
