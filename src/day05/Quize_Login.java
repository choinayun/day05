package day05;

import java.util.Scanner;

public class Quize_Login {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String id;
		String pw = null;
		
		while(true) {
		
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.println(">>>>");
			num = input.nextInt();
			
			if(num == 2) {
				
				System.out.println("������ ���̵� �Է� : " );
				id = input.next();
				System.out.println("������ ��й�ȣ �Է� : " );
				pw = input.next();
				
				System.out.println("���� �Ϸ� !! ");
				
			}else if(num == 1) {
				
				System.out.println("���̵� �Է� : ");
				id = input.next();
				System.out.println("��й�ȣ �Է� : ");
				pw = input.next();
				
				if( pw.equals("1234")) {
					System.out.println("���� ����!!");
				}else {
					System.out.println("���� ����!!");
				}
			
			}else if(num == 3) {
				System.out.println("���α׷� ���� �մϴ�!!!");
				break;
			}
			
		
		}
		
		
		
	}

}
