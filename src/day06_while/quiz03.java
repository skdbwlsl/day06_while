package day06_while;

public class quiz03 {
	public static void main(String[] args) {
		int i=1,sum=0;
		
			for(;sum <10000 ;i++) {
				if(i%2==1) {
					sum+=i;
				}
			
			//System.out.println(i+":" +sum); ->���⼱ 199�϶� 10000
		}
			i--; //�̷��� Ǯ���� i++������ i--�� �������
			System.out.println(i+":" +sum); //���⼱ 200�϶� 10000
	}
}