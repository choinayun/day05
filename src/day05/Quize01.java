package day05;

public class Quize01 {

	public static void main(String[] args) {
		
		// 1
		for(int i=1; i <= 4; i++) {
			System.out.println(i +". hello");
		}
		
		
		// 2
		int sum = 0;
		for(int i=1; i <= 100; i++) {
			
			sum = sum + i;
			
			if(sum == 528) {
				System.out.println("합이 528일때 i의 값 : " + i);
			}
		}
		
		
		// 3
		for(int i=1; i <= 25; i++) {
			
			System.out.print(i+"\t");
			
			if(i%5 == 0) {
				System.out.println();	
			}
		}
		
		 
		
	}
}
