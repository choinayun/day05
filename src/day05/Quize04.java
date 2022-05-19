package day05;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int money, num;
		
		System.out.println("요금을 투입 하세요 >>>");
		money = input.nextInt();
		
		while(true) {
			
			System.out.println("==========커피 자판기==========");
			System.out.println();
			System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
			System.out.println("메뉴를 선택하세요 >>>");
			num = input.nextInt();
			
			// 커피 선택 : money-200
			// 코코아 선택 : (money-200)-250
			// 반환 선택 : 거스름돈 (money-200)-250 -> money : 0으로 변동 
			// 커피 선택 : money = 0; 요금 부족 ! 
			
			if(num == 4) {
				break;
			
			}else if((num == 1 && money < 200)||(num == 2 && money < 250)) {
				System.out.println("요금이 부족합니다.");
			
			}else if(num == 1) {
				System.out.println("맛있게 드세요");
				money -= 200;

			}else if(num == 2) {
				System.out.println("맛있게 드세요");
				money -= 250;	
					
			}else if(num == 3) {
				System.out.println("거스름돈 : " + money);
				money = 0;
			
			}else {
				System.out.println("잘못 입력하셨습니다\n\n");
			}
			
			
		}
				
		System.out.println("프로그램 종료!!");
	}
	
}
