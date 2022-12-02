package loop;

public class nestedLoopse {

	public static void main(String[] args) {
		
//		for(int i = 1 ; i <= 5; i++) {
//			for(int j = 1 ; j <= 10; j++) {
//				System.out.print(j+ " ");
//			}
//			
//			System.out.println();
//		}
		for(int i = 1 ; i <= 20; i++) {
			int tableof = i;
			for(int j = 1 ; j <= 10; j++) {
				
				System.out.print(tableof * j + " ");
			}
			System.out.println();
		}
	}

}
