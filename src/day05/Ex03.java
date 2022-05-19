package day05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		

		/*
		 break : 반복문, switch 문을 빠져나올때 사용한다
		 continue : 반복문의 위쪽으로 올려보내준다. 
		 */
		// continue 가 있고 없고 차이 확인해보기 
		
	
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("if실행");
				// continue;
				break;
			}
			System.out.println("i : " +i);
		}
		
		
		// 문자열에 관련된 for문
		
		int n1=10, n2=10;
		if(n1 == n2) {
			System.out.println("두 수는 같습니다");
		}
		
		String s1, s2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자 입력");
		s1 = input.next();
		System.out.println("문자 입력");
		s2 = input.next();
		
		if( s1.equals(s2) ) {
			System.out.println("두 문자는 같다 ");
		}
		System.out.println( s1.equals(s2) );
		
		// 문자열을 if문 통해서 비교할땐 연산자 사용 x . equals 사용 
		//  s1.equals(s2) : s1, s2 변경해도 상관없다 
		
		
	}	
}
