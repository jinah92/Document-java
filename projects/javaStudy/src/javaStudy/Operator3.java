package javaStudy;

public class Operator3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;

		System.out.println(a - b * c); // a-(b*c)
		System.out.println((a - b) * c);

		System.out.println(a > 5 && b > 5); // �켱���� : �񱳿�����(>) > ��������(&)

//		System.out.println(++a - 5); // �켱���� : ���׿����� > ���������
		System.out.println(a++ - 5);
		System.out.println(a);
	}

}
