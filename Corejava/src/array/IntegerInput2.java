package array;

import java.util.Scanner;

public class IntegerInput2 {
// question no 2:take 10 integer inputs form user and store them in an array .Again ask user to give a number .
	//now,tell user whether that number is present in array or not.
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
  
	int b[]  = new int[0];
	int a [] = new int[10];
	for(int i=0; i<a.length;i++) {
		System.out.println("a["+i+"]");
		a[i]=sc.nextInt();
	}
	
	System.out.println("enter the number:");
	for(int i=0; i<a.length;i++) {
		System.out.println("a["+i+"]");
		b[i]=sc.nextInt();
	}
	
System.out.println();
	
	}

}
