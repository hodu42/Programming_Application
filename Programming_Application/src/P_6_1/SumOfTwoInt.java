package P_6_1;
import java.util.*;

public class SumOfTwoInt 
{
	public static void sum(int num1, int num2)
	{
		System.out.println(num1+num2);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է�: ");		
		int input1 = sc.nextInt();	int input2 = sc.nextInt();
		System.out.print("�� ������ ��: ");	sum(input1, input2);

	}

}
