package day06_while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.print("수 입력 : ");
		i= input.nextInt();
		while(true) {
			temp = i%10;
			i=i/10;
			System.out.println(temp +" ");
			if(i==0)
				break;
		}
		System.out.println();
	}

}
//각 자릿수별로 쪼개져서 나온다