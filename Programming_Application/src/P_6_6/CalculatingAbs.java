package P_6_6;
import java.util.*;

public class CalculatingAbs 
{

	public static int abs(int num)
	{
		if(num < 0)
		{
			num = num*-1;
		}
		return num;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");		int input = sc.nextInt();
		System.out.printf("���� %d�� ���밪�� %d�Դϴ�.",input,abs(input));
		

	}

}
