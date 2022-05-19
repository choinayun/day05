package day05;

import java.util.Scanner;

public class Quize_Login {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String id;
		String pw = null;
		
		while(true) {
		
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.println(">>>>");
			num = input.nextInt();
			
			if(num == 2) {
				
				System.out.println("저장할 아이디 입력 : " );
				id = input.next();
				System.out.println("저장할 비밀번호 입력 : " );
				pw = input.next();
				
				System.out.println("가입 완료 !! ");
				
			}else if(num == 1) {
				
				System.out.println("아이디 입력 : ");
				id = input.next();
				System.out.println("비밀번호 입력 : ");
				pw = input.next();
				
				if( pw.equals("1234")) {
					System.out.println("인증 성공!!");
				}else {
					System.out.println("인증 실패!!");
				}
			
			}else if(num == 3) {
				System.out.println("프로그램 종료 합니다!!!");
				break;
			}
			
		
		}
		
		
		
	}

}
