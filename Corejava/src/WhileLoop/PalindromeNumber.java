package WhileLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		int temp = n;
		int reversednumber =0;
		while (temp>0) {
			int lestDigit= temp %10;
			
			reversednumber = reversednumber *10+lestDigit;
			temp/=10;
			}

		if(reversednumber ==n) {
			System.out.println(n+"is palindrome");
		}else {
			System.out.println(n+"is not palindrome");
		}
	
		
	}

}
