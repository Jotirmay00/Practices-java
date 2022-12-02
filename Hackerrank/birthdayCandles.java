package Hackerrank;
import java.util.*;
public class birthdayCandles {
	 public static int birthdayCakeCandles(int arr[],int n) {
	        for(int i = 0 ; i < n-1 ; i++){
	            for(int j = 0 ; j < n-1-i ; j++){
	                if(arr[j+1] <  arr[j]){
	                    int temp = arr[j+1];
	                    arr[j+1] = arr[j];
	                    arr[j] = temp;
	                     }
	            }
	        }
	        List<Integer> candles = new ArrayList<>();
	           int temp2 = arr[n-1];
	        for(int i = 0 ; i < arr.length-1 ; i++){
	            if(arr[i] == temp2)
	               candles.add(arr[i]);
	            }
	    return candles.size() +1 ; 
	}

	public static void main(String[] args) {
		  
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount of candles");
			int n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter the height of the candles");
			for(int i = 0 ; i < a.length ; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("The Maximum height of the biggest candles is" + birthdayCakeCandles( a,n));
			
	}

}
