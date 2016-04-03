/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalinterfaces;

import java.util.function.Supplier;

/**
 *
 * @author oboff
 */
class Timeit {
//    @FunctionalInterface
//    public interface Block {
//        public void run();
//    }

    public static void code(Runnable codeBlock) {
        long start = System.nanoTime();
        try {
            codeBlock.run();
        } finally {
            long end = System.nanoTime();
            System.out.println("Time taken(s): " + (end - start) / 1e9);
        }
    }
    
//    public interface Factory {
//        int produce();
//    }
    
    public static <T> T code(Supplier<T> codeBlock) {
        long start = System.nanoTime();
        try {
            return codeBlock.get();
        } finally {
            long end = System.nanoTime();
            System.out.println("Time taken(s): " + (end - start) / 1e9);
        }
    }
}
