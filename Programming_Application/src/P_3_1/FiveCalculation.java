package P_3_1;
import java.util.Scanner;

public class FiveCalculation {

	public static void main(String[] args) {
		int num1;							
		int num2;			
		int sum;
		int subtract;
		int multiply;
		double divide;
		int remainder;		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù ��° ���� �Է�: ");		//ù���� ���� �Է�
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");		//�ι�° ���� �Է�
		num2 = sc.nextInt();
		
		if (num2 == 0) {
			System.out.println("������ ���� 0�� �Է��� �� �����ϴ�."); //������ �� 0�ϰ��
		}
		else {
			sum = num1+num2;				//��		
			subtract = num1 - num2;			//��
			multiply = num1*num2;			//��
			divide = (double)num1/num2;		//������
			remainder = num1%num2;			//������
			
			System.out.println(num1+"+"+num2+"="+sum);
			System.out.println(num1+"-"+num2+"="+subtract);
			System.out.println(num1+"*"+num2+"="+multiply);
			System.out.println(num1+"/"+num2+"="+divide);
			System.out.println(num1+"%"+num2+"="+remainder);	//���
		}
		
		
		
	}

}
