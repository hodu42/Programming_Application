package P_5_6;

import java.util.*;

public class MinMaxAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int Min = Integer.MIN_VALUE;
		int Max = Integer.MAX_VALUE;
		int i=0;
		int sum=0;
		double Avg = 0;
		
		while(num>=0) 
		{
			System.out.print("Input Number? ");
			num = sc.nextInt();
			if (num == -1) 		// -1�� �Է¹����� �Է��۾����� �� ������
			{
				break;
			}
			if(i==0) 			//  ó�� �Է¼��ڸ� �ּڰ�, �ִ����� �д�
			{
				Min = num;
				Max = num;
			}
			if (Min > num) 		// �Է¹��� ���ڰ� �ּڰ����� ������� �ּڰ��� ������ڷ� ����
			{
				Min = num;
			}
			if (Max < num) 		// �Է¹��� ���ڰ� �ִ񰪺��� Ŭ��� �ִ��� ������ڷ� ����
			{
				Max = num;
			}
			sum = sum + num;
			i++;
		}
		
		Avg = sum / (double)i;
		
		System.out.println("�ּڰ� : "+Min);
		System.out.println("�ִ� : "+Max);
		System.out.print("��հ� : "+Avg);

	}

}
