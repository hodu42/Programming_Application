package P_3_7;
import java.util.*;
import java.io.*;

public class StringOutput {
	public static void main(String[] args) {
		String str1=null, str2=null;
		
		try {
		File file = new File("C:\\Users\\�����\\eclipse-workspace"
				 +"\\Programming_Application\\src\\P_3_7\\data.txt");
		Scanner sc = new Scanner(file);
		str1 = sc.nextLine(); 		// ���Ͽ��� ���� ����
		System.out.print("���ڿ� �Է�: ");
		sc = new Scanner(System.in); 		// Ű����� �Է� ����
		str2 = sc.nextLine();
		}
		catch (FileNotFoundException e){
			
		}
		String result = str2+str1;
		System.out.printf("%s", result);
	}
}
