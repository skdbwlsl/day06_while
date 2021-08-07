package day06_while;

import java.util.Scanner;

public class quiz_login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int login;
		String name;
		
		while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.나가기");
		System.out.print(">>>");
		login = input.nextInt();
		
		//default를 어디에 넣어야하지,,
		switch(login) {
		case 1: System.out.println("아이디입력 : ");
				name = input.next();
				System.out.println("비밀번호 입력 : ");
				login=input.nextInt();
				System.out.println("인증 성공!!!");
		
				
		case 2: System.out.println("저장할 아이디 입력 : ");
				name = input.next();
				System.out.println("저장할 비밀번호 입력 : ");
				login=input.nextInt();
				System.out.println("가입 완료!!!");
		
		}
		
		
		
		
		
	}

}
}