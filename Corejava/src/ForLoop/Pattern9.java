package ForLoop;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = Sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			for(int j=3; j<=n-i+1; j++) {	
			
				System.out.print(" ");
			}
		for(int j=1; j<=i; j++) {
			System.out.print("^");
		}
			System.out.println();
		}
	}

}
