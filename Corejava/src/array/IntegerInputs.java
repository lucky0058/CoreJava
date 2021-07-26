package array;
//question 1: take 10 integer inputs from user and store them in an array and them on screen.
import java.util.Scanner;

public class IntegerInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[] z = new int[10];
		    for(int i = 0;i<z.length;i++){
		      System.out.println("Print the value of z["+i+"]");
		      z[i] = sc.nextInt();
		    }
		    for(int i = 0;i<z.length;i++){
		      System.out.println("The value of z["+i+"] is "+z[i]);
	
		
		    }
		
	}

}
