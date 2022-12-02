package recursion;

public class recurse2 {
static int facto(int n) {
	if ( n == 0) {
		return 1;
	}
	else {
		return n*facto(n-1);
	}
}
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(facto(n));
	}

}
