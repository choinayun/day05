package day05;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int money, num;
		
		System.out.println("����� ���� �ϼ��� >>>");
		money = input.nextInt();
		
		while(true) {
			
			System.out.println("==========Ŀ�� ���Ǳ�==========");
			System.out.println();
			System.out.println("1. Ŀ��(200)\t2. ���ھ�(250)\t3. ��ȯ\t4. ����");
			System.out.println("�޴��� �����ϼ��� >>>");
			num = input.nextInt();
			
			// Ŀ�� ���� : money-200
			// ���ھ� ���� : (money-200)-250
			// ��ȯ ���� : �Ž����� (money-200)-250 -> money : 0���� ���� 
			// Ŀ�� ���� : money = 0; ��� ���� ! 
			
			if(num == 4) {
				break;
			
			}else if((num == 1 && money < 200)||(num == 2 && money < 250)) {
				System.out.println("����� �����մϴ�.");
			
			}else if(num == 1) {
				System.out.println("���ְ� �弼��");
				money -= 200;

			}else if(num == 2) {
				System.out.println("���ְ� �弼��");
				money -= 250;	
					
			}else if(num == 3) {
				System.out.println("�Ž����� : " + money);
				money = 0;
			
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�\n\n");
			}
			
			
		}
				
		System.out.println("���α׷� ����!!");
	}
	
}
