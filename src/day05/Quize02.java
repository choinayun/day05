package day05;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		
		// 1~10 ������ ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ�
		// 10~20 ������ ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ�
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���");
			i = input.nextInt();
			
			if(i >=1 && i <=10) 
				break;
				System.out.println("�߸� �Է�. �ٽ�");
			
		}	
		
		for(int j=1; j<=i; i++) 
			sum+=j;
		
		System.out.println("�Է¹��� ���� �� : " + sum);
			
		
		
	}
}
