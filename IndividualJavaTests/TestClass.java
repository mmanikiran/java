package org.mani.oldexamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());                
        String line = br.readLine();
        int sum = 0, count = 0;
        while(count != n && line != null){
            
            String[] numbers = line.split("\\s+");
            for(String number: numbers){
		count++;
                int ni = Integer.parseInt(number);
                sum += ni;
            }
	    line = br.readLine();
        }
	Integer ii = sum/n;ii++;
        System.out.println(ii);
    }
}

