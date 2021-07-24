package ForLoop;

import java.util.Scanner;

public class table1to20 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in) ;
	 
    int n=sc.nextInt();			 
		
		int tableof=n;
		for(int i=1; i<=10; i++) {
			System.out.println(tableof * i + "");
		}
	}



}
