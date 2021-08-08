package day06_while;

public class quiz_4_6 {
	public static void main(String[] args) {
		int num=1,ret = 0;
		while(true) {
			if(num >1000)
				break;
			
			if(num % 4==1 && num % 6 ==1) {
				System.out.println(num + " ");
				ret += num;
			}
			num++;
		}
		System.out.println(ret);
	}

}
