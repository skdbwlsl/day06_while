package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 continue: �ݺ����� �������� �÷�������
		 
		 */
		
		int i =0;
		while(i<5) {
			i++;
			if(i==3) {
				//break; ����� 1,2,��������� ����
				continue; //����� 3�� ������ 1245���� ����� ����
							//�ݺ��� �������� �÷��ش�
			}
			
			System.out.println(i);
		}
		System.out.println("���� ����� ����");
	}

}
