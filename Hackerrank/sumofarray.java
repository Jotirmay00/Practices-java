package Hackerrank;
import java.util.*;
public class sumofarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		System.out.println("Enter the size of the Array");
		
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the Elements of the Array");
		int i; 
		for(i=0; i<n ; i++) {
			a[i] = sc.nextInt(); 
			sum +=a[i];
		}
			System.out.println("The sum of array is "+ " " + sum);
			
			
		
		 

	}

}
