package day06_while;

import java.util.Scanner;

public class quiz_coffee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money=0,j=0;
		System.out.print("����� ���� �ϼ��� >>> ");
		money = input.nextInt();
		for(;;){
			System.out.println("==========Ŀ�� ���Ǳ�==========\n");
			System.out.println("1. Ŀ��(200)\t2. ���ھ�(250)\t3. ��ȯ\t4. ����");
			System.out.print("�޴��� �����ϼ��� >>> ");
			j = input.nextInt();
			if(j == 4)
				break;
			else if((j == 1 && money < 200) || (j == 2 && money< 250) ){
				System.out.println("����� �����մϴ�.\n");
			}
			else if(j == 1){
				System.out.println("���ְ� �弼��\n");
				money -= 200;
			}
			else if(j == 2){
				System.out.println("���ְ� �弼��\n");
				money -= 250;
			}
			else if(j == 3){
				System.out.println("�Ž����� : "+ money);
				money = 0;
			}
			else{
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n\n");
			}
		}
		System.out.println("���α׷� ����!!!");
	}

}
