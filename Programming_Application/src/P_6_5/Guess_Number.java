package P_6_5;

import java.util.*;

public class Guess_Number {
	
	public static void Guess_number(int GuessNum, int CorrectNum) 
	{
		if (GuessNum > CorrectNum) 
		{
			System.out.println("���� ������ ���ں��� �����ϴ�.");
		}
		else if (GuessNum < CorrectNum) 
		{
			System.out.println("���� ������ ���ں��� �����ϴ�.");
		}
		else 
		{
			System.out.println("���� ������ ���ڸ� ��Ȯ�ϰ� ������ϴ�.");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ ���ڸ� ���߾� ������ (0-99)");
		int ComNum = (int)(Math.random()*99);
		int GuessNum=0;
		
		while(GuessNum != ComNum) 
		{
			System.out.print("���� �Է�: ");
			GuessNum = sc.nextInt();
			Guess_number(GuessNum, ComNum);
		}

	}

}
