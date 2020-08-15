package org.mani.oldexamples;

import java.lang.*;
import java.io.*;
import java.util.*;
class ScannerSample{

	public static void main(String[] args){
		
		int no_of_elephants = 0;
		int no_of_candies   = 0;
		Scanner sc = new Scanner(System.in);
		int t = sc.hasNextLine() ? sc.nextInt() : 0 ;
		String[] outputs = new String[t];

		while(t-- > 0){

			no_of_elephants = sc.nextInt();
			no_of_candies   = sc.nextInt();

			for(int i = 0; i < no_of_elephants && 
						no_of_candies >= 0; i++){
				no_of_candies -= sc.nextInt();
				
			}
			String s = sc.nextLine();
			outputs[t] = no_of_candies < 0 ? "No" : "Yes";
			

		}

			for(int i = (outputs.length)-1; i >= 0; i--)
				System.out.println(outputs[i]);
	}
	
}
