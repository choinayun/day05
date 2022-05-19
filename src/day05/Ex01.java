package day05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 반복문 
		// 규칙적으로 값이 변한다면 반복문을 사용할 수 있다
		 
		
		int sum = 0, i = 0;
		
		// 초기값; 조건식; 증감식
		for(i=1; i <= 10; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
	
		
		/*
		i++; sum = sum + i ; // 1 = 0 + 1
		i++; sum = sum + i ; // 3 = 1 + 2
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		i++; sum = sum + i ;
		
		System.out.println("sum : " + sum);
		*/
		
		for(int k=1; k <= 10; k+=2) {
			System.out.println("k : " + k);
		}
		System.out.println("===========");
		
		for(int k=1; k <= 10; k++) {
			if(k%2 == 1) {
				System.out.println("k : " + k);
			}
		}
		
		
		// 사용자로부터 입력받은 수까지의 짝, 홀, 총합을 구하세요.
		
		Scanner input = new Scanner (System.in);
		
		int num, evenSum=0, oddSum=0, allSum=0;
			// 	짝수총합, 홀수총합, 총합 
		System.out.println("숫자를 입력하세요");
		num = input.nextInt();
		
		for(int a=1; a <= num; a++) {
			
			if(a%2 == 0) {
				evenSum += a;
			}else {
				oddSum += a;
			}
			
			allSum += a;
		}
		
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("총 합 : " + allSum);
		
		
		//
		i = 0;
		for( ; i < 3 ; ) {
			System.out.println("test");
			i++;
		}

	}
}
