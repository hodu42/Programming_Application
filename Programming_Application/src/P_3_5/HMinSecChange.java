package P_3_5;

import java.util.*;

public class HMinSecChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ð� �Է�(��) : ");
		int Input_Sec = sc.nextInt();
		int H = Input_Sec/3600;			//�ð��� �ʸ� 60���� ������ �� 60���� ����
		int M = Input_Sec%3600/60;		//���� �ð��� ���ϰ� �������� 60���� ����
		int S = Input_Sec%60;			//�ʴ� 60���� ���� ������
		
		System.out.print("�Էµ� �ð�: "+H+"�� "+M+"�� "+S+"��");

	}

}
