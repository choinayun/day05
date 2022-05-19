package day05;

import java.util.Scanner;

public class Quize03 {
	
	public static void main(String[] args) {
		
		// 두 수를 입력 받아 입력받은 수 사이의 합을 구하세요
		// 입력 값 : 1,10 -> 55, 10,1 -> 55 
		
		
		// 1번째 방식
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		int a=0, b=0;
		
		System.out.println("두 수를 입력하시오");
		a=input.nextInt();
		b=input.nextInt();
		
		int a1 = a;
		
		while(a1<=b) {
			sum+=a1;
			a1++;
		}
		
		while(b<=a) {
			sum+=b;
			b++;
		}
		
		System.out.println("입력받은 수까지의 합 : " + sum);
		
		// 2번째 방식
		
		int max=0, min=0;
		if(a > b) {
			max =a;
			min =b;
		}else {
			max =b;
			min =a;
		}
		
		while(min <= max) {
			sum+=min;
			min++;
		}
		
	}
  
	//
}
