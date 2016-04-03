/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readurl;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oboff
 */
public class ReadURLWithScanner implements IReadURL {
   public static void readURL(URL url) throws IOException {
       Scanner sc = new Scanner(url.openStream());

       while (sc.hasNext()) {
           System.out.println(sc.next());
       }

   }
}
