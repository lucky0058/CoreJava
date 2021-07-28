package array;

import java.util.Scanner;

public class IntegerInput3 {
// question no 2:take 10 integer inputs form user and store them in an array .Again ask user to give a number .
	//now,tell user whether that number is present in array or not.
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
  System.out.println("enter the data");
      int n=sc.nextInt();
	
	int a [] = new int[n];
	for(int i=0; i<n;i++) {
		System.out.println("enter the number:"+(i+1));
		a[i]=sc.nextInt();
	}
	
	System.out.println("enter the find number:");
	int find=sc.nextInt();
	
	boolean check=false;
	for(int i=0; i<n; i++) {
	
		if(a[i]==find) {
		check=true;
			break;
			}
	}
		if(  check==true) {
			
			System.out.println("number is present:"+find);
		}
		else {
			System.out.println("number is not present:" +find);
		}
	}
	
	

	
	}


