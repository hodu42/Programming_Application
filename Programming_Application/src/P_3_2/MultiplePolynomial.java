package P_3_2;

import java.util.*;

public class MultiplePolynomial {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		double result;
		System.out.println("2�� ���׽� y = a*x^2 + b*x + c");
		System.out.print("��� �� x �Է� (a, b, c, x): ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		
		result = a*(Math.pow(x, 2))+b*x+c;
		
		System.out.print("����� y = "+result);
		

	}

}
