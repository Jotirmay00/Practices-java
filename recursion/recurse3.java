package recursion;

public class recurse3 {
static int fibonnaci(int n) {
	if(n <= 1) {
		return n;
	}
	else {
		return (fibonnaci(n-1)+fibonnaci(n-2));
	}
}
	public static void main(String[] args) {
		
		int n = 3;
		System.out.println(fibonnaci(n));

	}

}
