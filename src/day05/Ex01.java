package day05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// �ݺ��� 
		// ��Ģ������ ���� ���Ѵٸ� �ݺ����� ����� �� �ִ�
		 
		
		int sum = 0, i = 0;
		
		// �ʱⰪ; ���ǽ�; ������
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
		
		
		// ����ڷκ��� �Է¹��� �������� ¦, Ȧ, ������ ���ϼ���.
		
		Scanner input = new Scanner (System.in);
		
		int num, evenSum=0, oddSum=0, allSum=0;
			// 	¦������, Ȧ������, ���� 
		System.out.println("���ڸ� �Է��ϼ���");
		num = input.nextInt();
		
		for(int a=1; a <= num; a++) {
			
			if(a%2 == 0) {
				evenSum += a;
			}else {
				oddSum += a;
			}
			
			allSum += a;
		}
		
		System.out.println("¦�� �� : " + evenSum);
		System.out.println("Ȧ�� �� : " + oddSum);
		System.out.println("�� �� : " + allSum);
		
		
		//
		i = 0;
		for( ; i < 3 ; ) {
			System.out.println("test");
			i++;
		}

	}
}
