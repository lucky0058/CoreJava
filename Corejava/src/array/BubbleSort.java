package array;



public class BubbleSort {

	public static void main(String[] args) {
	
		int a[] = {-3,2,6,3,6,7,8,9,7,5,3,};
		int m=a.length;
		
		for(int i=0; i<m-1; i++) {
			
			boolean sorted =true;
			
			for(int j=0;j<m-1-i; j++) {
				
				if (a[j+1] < a[j]) {
					int temp =a[j+1];
					a[j+1] =a[j];
					a[j]=temp;
					sorted =false;
					
				}
			}
		if(sorted) break;
		
		}
             for (int item: a) {
            	 System.out.print(item+" ");
             
		}
		

	}

}
