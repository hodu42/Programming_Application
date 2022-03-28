package P_4_8;
import java.util.*;

public class MenuBasedFigureAreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� (R: �簢��, T:�ﰢ��, C: ��)? ");
		char figure = sc.next().charAt(0);
		int width,height;
		double area;
		int radius;
		
		switch(figure) {
			
			case 'R':
				System.out.print("�ʺ� �� ���� �Է�? ");
				width = sc.nextInt(); height = sc.nextInt();
				area = width*height;
				System.out.printf("�簢�� ũ�� = %f", area);
				break;
			case 'T':
				System.out.print("�ʺ� �� ���� �Է�? ");
				width = sc.nextInt(); height = sc.nextInt();
				area = (double)width*height/2;
				System.out.printf("�ﰢ�� ũ�� = %f", area);
				break;
			case 'C':
				System.out.print("������ �Է�? ");
				radius = sc.nextInt();
				area = (double)radius*radius*Math.PI;
				System.out.printf("�� ũ�� = %f", area);
				break;
			default : 
				System.out.println("��ȿ���� ���� �����Դϴ�.");
		}

	}

}
