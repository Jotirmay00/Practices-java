package loop;

import java.util.Scanner;

public class nestedLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		float result = 0;
		
//		for(float i= 1; i <= n; i++) {
//			result = 1/i + result;
//			
//		}
//		System.out.println(result);
		for(float i = 1 ; i<=n; i++) {
			if(i %2 == 0) {
				result -= 1/i  ;
			}
			else {
				result += 1/i ;
			}
		}
			System.out.println(result);
		
	}

}
