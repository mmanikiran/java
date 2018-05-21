import java.io.*;
import java.util.*;

class MatrixChain{
	
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		String[] sizes = br.readLine().split("\\s+");
		for(String a : sizes)
		System.out.println(a);
		
		int[][] b = new int[n+1][n+1];
		//int[][] s = new int[n+1][n+1];
		
		for(int i = 1; i < n+1; i++){
			b[i][i] = 0;
		}

		for(int l = 2; l <=n; l++){
			for(int start = 1; start <= n-l+1; start++){
				int end = start+l-1;
				int q = 0, minq = 1000000000;
				for(int k = start; k <= end-1; k++){
					int pi = Integer.parseInt(sizes[start-1]);
					int pk = Integer.parseInt(sizes[k]);
					int pj = Integer.parseInt(sizes[end]);
	
	
	
					q = b[start][k] + b[k+1][end] + pi*pk*pj;
					if(q < minq)
						minq = q;
				}
				
				b[start][end] = minq;

			}

		}
		System.out.println(b[1][n]);

	}
		

}
