/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readurl;

import java.io.IOException;
import java.net.URL;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import java.util.stream.StreamSupport;

/**
 *
 * @author oboff
 */
public class ReadURLWithStreams implements IReadURL {
    public static void readURL(URL url) throws IOException {
        
        StreamSupport ss = new StreamSupport();
        
    }
  
}
