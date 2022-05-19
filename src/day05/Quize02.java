package day05;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		
		// 1~10 사이의 숫자만 입력받아 1부터 입력받은 수까지의 합을 구하시오
		// 10~20 사이의 숫자만 입력받아 1부터 입력받은 수까지의 합을 구하시오
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			i = input.nextInt();
			
			if(i >=1 && i <=10) 
				break;
				System.out.println("잘못 입력. 다시");
			
		}	
		
		for(int j=1; j<=i; i++) 
			sum+=j;
		
		System.out.println("입력받은 수의 합 : " + sum);
			
		
		
	}
}
