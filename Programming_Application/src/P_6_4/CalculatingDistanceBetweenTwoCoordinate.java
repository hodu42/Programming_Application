package P_6_4;
import java.util.*;

public class CalculatingDistanceBetweenTwoCoordinate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ��ǥ(X, Y) �Է�: ");
		int x1 = sc.nextInt();		int y1 = sc.nextInt();
		System.out.print("�� ��° ��ǥ(X, Y) �Է�: ");
		int x2 = sc.nextInt();		int y2 = sc.nextInt();
		
		double distance = Math.sqrt((Math.pow(x1-x2, 2))+Math.pow(y1-y2, 2));
		System.out.print("�� ��ǥ �Ÿ�: "+distance);
	}

}
