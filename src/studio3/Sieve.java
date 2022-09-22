package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.println("Please put in n (up to n prime numbers)");
	int n = in.nextInt();
	boolean[] A = new boolean[n+1];
	
	for (int i=2; i<=Math.round(Math.sqrt(n)); ++i) {
		if (A[i] == false) {
			for (int j=0 ;i*(i+j)<=n; ++j ) {
				A[i*(i+j)]= true;
			}
		}
	}
		for (int l=2; l<n+1; ++l) {
			//System.out.println(A[l]);
			if (A[l]== false){
				System.out.println("Number "+ (l));
				
			}
		}
		
	}
	
}
