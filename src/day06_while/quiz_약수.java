package day06_while;

import java.util.Scanner;

public class quiz_��� {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, cnt =1;
		System.out.println("�� �Է� : ");
		num = input.nextInt();
		
		while(true) {
			if(num % cnt ==0)
				System.out.println(cnt + " ");
			if(num==cnt)
				break;
			cnt++;
		}
			
	}

}
