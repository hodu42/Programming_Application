package P_3_4;

import java.util.*;

public class BMICalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�(Kg) : ");
		double Weight = sc.nextDouble();
		System.out.print("Ű �Է�(cm) : ");
		double Height = sc.nextDouble();
		double BMI = (Height - 110) / Weight;
		
		System.out.printf("������: %.1f, Ű: %.1f --> �񸸵�: %.3f", Weight, Height, BMI);
		// �Ҽ��� ������ �ڸ����� ����̴� Math.round���
		
	}
}
