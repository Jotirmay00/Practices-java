package array;
import java.util.Scanner;
public class dimension1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		System.out.println("Enter the marks ");
		
		for(int i = 0 ; i < n ; i++){
			marks[i] = sc.nextInt();
		}
		int avg  = 0;
		
		for(int i = 0 ; i < n; i++){
			avg += marks[i];
		}
		avg /= n;
		System.out.println("The average is " + avg);
	}

}
