package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// str1, str2�� ���� ���ڿ�("hello")�� ����Ų��.
		String str1 = "hello";
		String str2 = "hello";
		
		// str3, str4�� �ٸ� ���ڿ��� ����Ų��.
		String str3 = new String("hello");
		String str4 = new String("hello"); 
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ���� ���۷��� �Դϴ�.");
		}
		if(str3 == str4) {
			System.out.println("str3�� str4�� ���� ���۷��� �Դϴ�.");
		} else {
			System.out.println("str3�� str4�� �ٸ� ���۷��� �Դϴ�.");
		}
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
	}
}
