package day06_while;

public class quiz03 {
	public static void main(String[] args) {
		int i=1,sum=0;
		
			for(;sum <10000 ;i++) {
				if(i%2==1) {
					sum+=i;
				}
			
			//System.out.println(i+":" +sum); ->여기선 199일때 10000
		}
			i--; //이렇게 풀려면 i++때문에 i--를 해줘야함
			System.out.println(i+":" +sum); //여기선 200일때 10000
	}
}