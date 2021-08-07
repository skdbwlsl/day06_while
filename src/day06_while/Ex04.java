package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 continue: 반복문의 위쪽으로 올려보낸다
		 
		 */
		
		int i =0;
		while(i<5) {
			i++;
			if(i==3) {
				//break; 출력이 1,2,다음문장들 실행
				continue; //출력이 3을 제외한 1245다음 문장들 실행
							//반복문 위쪽으로 올려준다
			}
			
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행");
	}

}
