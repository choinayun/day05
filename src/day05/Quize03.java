package day05;

import java.util.Scanner;

public class Quize03 {
	
	public static void main(String[] args) {
		
		// �� ���� �Է� �޾� �Է¹��� �� ������ ���� ���ϼ���
		// �Է� �� : 1,10 -> 55, 10,1 -> 55 
		
		
		// 1��° ���
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		int a=0, b=0;
		
		System.out.println("�� ���� �Է��Ͻÿ�");
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
		
		System.out.println("�Է¹��� �������� �� : " + sum);
		
		// 2��° ���
		
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
