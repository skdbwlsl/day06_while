package day06_while;

import java.util.Scanner;

public class quiz_login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int login;
		String name;
		
		while(true) {
		System.out.println("1.�α���");
		System.out.println("2.ȸ������");
		System.out.println("3.������");
		System.out.print(">>>");
		login = input.nextInt();
		
		//default�� ��� �־������,,
		switch(login) {
		case 1: System.out.println("���̵��Է� : ");
				name = input.next();
				System.out.println("��й�ȣ �Է� : ");
				login=input.nextInt();
				System.out.println("���� ����!!!");
		
				
		case 2: System.out.println("������ ���̵� �Է� : ");
				name = input.next();
				System.out.println("������ ��й�ȣ �Է� : ");
				login=input.nextInt();
				System.out.println("���� �Ϸ�!!!");
		
		}
		
		
		
		
		
	}

}
}