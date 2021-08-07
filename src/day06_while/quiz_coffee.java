package day06_while;

import java.util.Scanner;

public class quiz_coffee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int won,menu;
		
		
		System.out.print("요금을 투입 하세요 >>> ");
		won = input.nextInt();
		while(true) {
		System.out.println("=================커피 자판기=====================");
		System.out.print("1. 커피(200)"+"\t");
		System.out.print("2. 코코아(250)" +"\t");
		System.out.print("3. 반환"+"\t");
		System.out.println("4. 종료");
		System.out.print("메뉴를 선택하세요 >>>");
		menu = input.nextInt();
		System.out.println("맛있게 드세요");
		
		}
	}
		switch(menu) {
		int change;
		case 3 : System.out.println("거스름돈 : " +change);
			if(menu==1) {
				change = won-200;
			}else if(menu==2) {
				change = won-250;
		
			}
		
		
		
		
		}
		}	
	}

