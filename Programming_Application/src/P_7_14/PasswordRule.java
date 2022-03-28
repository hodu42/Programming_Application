package P_7_14;

import java.util.Scanner;

public class PasswordRule {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. 8���� �̻��Դϴ�.\n" 
				+ "2. �����ڿ� ���ڸ� ��� �����մϴ�. \n" 
				+ "3. ���ڴ� 2�� �̻��̾�� �մϴ�.\n"
				+ "���� �н����� ��Ģ�� ���� ���ϴ� �н����带 �Է��Ͻÿ�: ");
		String s = input.nextLine();
		if (is_Valid_Password(s)) {
			System.out.println("������ �н������Դϴ�: " + s);
		} else {
			System.out.println("�н����� ��Ģ�� ��߳��ϴ�: " + s);
		}
	}

	private static boolean is_Valid_Password(String s) {
		
		int count=0;			boolean check = false;
		
		if(s.length()>=8)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) >= '0' && s.charAt(i) <= '9') 	{count++;}
				
				else if(Character.toUpperCase(s.charAt(i)) >= 'A' && Character.toUpperCase(s.charAt(i)) <= 'Z') {check = true;}
				
				else check = false;
			}
			
			if(check ==true && count >= 2)		{return true;}
			
			else return false;
		}
		
		return false;
	}
}
