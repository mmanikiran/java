/* IMPORTANT: Multiple classes and nested static classes are supported */



//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class SortList {

    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> elements = new ArrayList<Integer>();
        String line = br.readLine();
        int count = 0;
        while (count != n){
            String[] nums = line.trim().split("\\s+");
            for(String s : nums){
		count++;                
                elements.add(Integer.valueOf(s));
            }
	    if(count != n)
            line = br.readLine();    
	}
        Collections.sort(elements);
            
	System.out.println(maxmin(elements));
        // Write your code here

    }
	
	public static int maxmin(List<Integer> elements){
		int sum = 0;
		for(int i = 0; i <= elements.size()-2; i++){
			int no_of_subsets = 0, prev_subsets = 0;
			for( int j = i+1; j <= elements.size()-1; j++){
				if(j == i+1){
				no_of_subsets = 1;
				} else {
					no_of_subsets = (2<<(j-i-1)) - 1 - prev_subsets;
				}
				prev_subsets += no_of_subsets;
				System.out.println("i j no :" + i + " " + j + " " + no_of_subsets);
				sum += (bitwiseOR(elements.get(i), elements.get(j)) * no_of_subsets) % 1000000007;
			}

		}
		return sum;

	}

	public static int bitwiseOR(Integer i1, Integer i2){
		return i1 | i2;
	}


}


