package P_3_6;
import java.util.*;

public class CircleAreaRound 
{

	public static void main(String[] args) 
	{
		System.out.print("���� ������ �Է� : ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double area = Math.pow(radius, 2) * 3.14;
		double round = 2*radius * 3.14;
		
		System.out.printf("����: %f �ѷ�: %f\n", area, round);
	}

}
