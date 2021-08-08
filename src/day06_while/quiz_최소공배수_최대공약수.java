package day06_while;

import java.util.Scanner;

public class quiz_최소공배수_최대공약수 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, max =0, min=0, i=2;
		System.out.println("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		while(i <=num1 && i <= num2) {
			if(num1 % i==0 && num2 % i ==0)
				min=i;
			i++;
		}
		max = num1 * num2/min; //최소 공배수 구하는 식
		System.out.println("최소 공배수 : " +max);
		System.out.println("최대 공약수 : " +min);
	}

}
