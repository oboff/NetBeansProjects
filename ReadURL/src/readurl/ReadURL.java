/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readurl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author oboff
 */
public class ReadURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com/index.html");
            //ReadURLWithScanner.readURL(url);
            ReadURLWithStreams.readURL(url);
        }
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
