package day06_while;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i =0, sum=0;
		
		
		while(true) {
			System.out.println("1~100사이의 숫자만 입력 : ");
			i = input.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
		
			System.out.println("다시 입력하세요 : ");
		}

		for(int j=1;j<=i;j++) {
			sum += j;
		}
		System.out.println("입력받은 수까지의 합: "+sum);

}
}