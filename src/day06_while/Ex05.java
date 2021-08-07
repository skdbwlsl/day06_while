package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.걷기 2.대중교통 3.종료");
			int select = input.nextInt();
			switch(select) {
			case 1 : System.out.println("걸어가자");break;
			case 2 : System.out.println("버스타자");break;
			case 3 : System.out.println("종료가자");
				System.exit(1);
			}
		
		}
	}

}
//1번할땐 콘솔창 빨간네모가 실행돼는데 3번 입력하면 빨간네모 꺼지면서 종료되는것을 확인