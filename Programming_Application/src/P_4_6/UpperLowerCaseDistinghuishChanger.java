package P_4_6;
import java.util.*;

public class UpperLowerCaseDistinghuishChanger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input character? ");
		char input = sc.next().charAt(0);
		
		if ((64 < input && input < 91)||(96 < input && input < 123)) 
		{
			if(64<input&&input<91) 
			{
				System.out.printf("%c�� �빮��\n",input);
				System.out.printf("%c�� �ҹ��ڴ� %c",input,(char)(input+32));
			}
			else
			{
				System.out.printf("%c�� �ҹ���\n",input);
				System.out.printf("%c�� �빮�ڴ� %c",input,(char)(input-32));
			}
		}
		else 
		{
			System.out.printf("%c�� ���ڰ� �ƴ�",input);
		}

	}

}
