package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// str1, str2는 같은 문자열("hello")를 가르킨다.
		String str1 = "hello";
		String str2 = "hello";
		
		// str3, str4는 다른 문자열을 가르킨다.
		String str3 = new String("hello");
		String str4 = new String("hello"); 
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 레퍼런스 입니다.");
		}
		if(str3 == str4) {
			System.out.println("str3과 str4는 같은 레퍼런스 입니다.");
		} else {
			System.out.println("str3과 str4는 다른 레퍼런스 입니다.");
		}
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
	}
}
