package javaStudy;

public class IfExaam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;

		if (x < y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		} else {
			System.out.println("x�� y���� ���� �ʽ��ϴ�.");
		}

		if (x == y) {
			System.out.println("x�� y�� �����ϴ�.");
		} else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}

		if (x == y) {
			System.out.println("x�� y�� ����.");
		} else if (x < y) {
			System.out.println("x�� y���� �۴�.");
		} else {
			System.out.println("x�� y�� �ٸ���.");
		}
	}

}
