package day05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		

		/*
		 break : �ݺ���, switch ���� �������ö� ����Ѵ�
		 continue : �ݺ����� �������� �÷������ش�. 
		 */
		// continue �� �ְ� ���� ���� Ȯ���غ��� 
		
	
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("if����");
				// continue;
				break;
			}
			System.out.println("i : " +i);
		}
		
		
		// ���ڿ��� ���õ� for��
		
		int n1=10, n2=10;
		if(n1 == n2) {
			System.out.println("�� ���� �����ϴ�");
		}
		
		String s1, s2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		s1 = input.next();
		System.out.println("���� �Է�");
		s2 = input.next();
		
		if( s1.equals(s2) ) {
			System.out.println("�� ���ڴ� ���� ");
		}
		System.out.println( s1.equals(s2) );
		
		// ���ڿ��� if�� ���ؼ� ���Ҷ� ������ ��� x . equals ��� 
		//  s1.equals(s2) : s1, s2 �����ص� ������� 
		
		
	}	
}
