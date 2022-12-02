package loop;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int a = sc.nextInt();
		
		boolean isPrime = true;
		 
		for(int i = 2; i*i < a; i++){
			
			if(a % 2 == 0) {
				isPrime = false;
				break;
			}
			if(a < 2) isPrime = false;
		}
		System.out.println("isPrime " + isPrime);
	}

}
