package day06_while;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i =0, sum=0;
		
		
		while(true) {
			System.out.println("1~100������ ���ڸ� �Է� : ");
			i = input.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
		
			System.out.println("�ٽ� �Է��ϼ��� : ");
		}

		for(int j=1;j<=i;j++) {
			sum += j;
		}
		System.out.println("�Է¹��� �������� ��: "+sum);

}
}