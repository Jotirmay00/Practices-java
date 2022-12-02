package array;
import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b = a.length;
		System.out.println("Enter the Elements of the array");
		for(int i = 0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i =0 ; i< b-1 ; i++) {
		for (int j = 0 ; j< b-1 ; j++) {
		if (a[j+1]< a[j]) {
			int temp = a[j+1];
			a[j+1] = a[j];
			a[j]= temp;
		}	
		}
		}
		for(int item : a) {
			System.out.print(item+ " ");
		}
	}

}
