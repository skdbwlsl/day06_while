package day06_while;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1,n2;
		System.out.println("첫 문자 입력 ");
		n1 = input.next();
		System.out.println("두 문자 입력 ");
		n2 = input.next();
		System.out.println("n1길이 : " + n1.length());
		System.out.println("n2길이 : " + n2.length());
		System.out.println("n1==n2 : " + (n1==n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		
		String str = null;
		//System.out.println(str.equals(str)); null이면 .equals이런것 못한다 str= null이 아닌 값이 있다면 상관없다
		System.out.println( n1.equals(str) );
		System.out.println( str == null );
	
	}

}
