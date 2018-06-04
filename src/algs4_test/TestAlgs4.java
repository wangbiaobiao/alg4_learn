package algs4_test;

import edu.princeton.cs.algs4.StdDraw;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class TestAlgs4 {
    public static void main (String[] args) {
    	int b = 0;
    	try {
    		System.out.println("begin to ready");
    		b = System.in.read();
    		System.out.println(b);
    	}catch(IOException e){
    		System.out.println(b);
    	}
    	
    }
}
