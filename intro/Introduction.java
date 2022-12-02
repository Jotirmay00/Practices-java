package intro;

import java.util.*;
public class Introduction {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i = 0 ; i<n ; i++) {
			a[i] = sc.nextInt();
			
			}
		for(int j =-n ; j<=a.length ; j = j-1) {
				System.out.println(a[j] + " ");
		
		}
		System.out.println();
	}
}
