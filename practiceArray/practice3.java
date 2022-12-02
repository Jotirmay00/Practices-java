package practiceArray;
import java.util.Scanner;
public class practice3 {
	 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int n = sc.nextInt();
		System.out.println("Enter the Elements");
	int a[] = new int[n]; 
	int temp = a[0];
		for(int i = 0 ; i< a.length; i++) {
		a[i] = sc.nextInt();
		if (a[i] > temp) { 
                temp = a[i];
		}
		}
		System.out.println("The greatest Element is " + temp);
	}

}
