package loop;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		
		while (temp > 0 ) {
			int last = temp % 10 ; 
			reverse = reverse * 10 + last;
			temp /= 10;
		}
		if(reverse == n) {
			System.out.println(n + " is Palindrome");
		}
		else {
			System.out.println(n + " is not Palindrome");
		}
				

	}

}
