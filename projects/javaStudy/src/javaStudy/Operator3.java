package javaStudy;

public class Operator3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;

		System.out.println(a - b * c); // a-(b*c)
		System.out.println((a - b) * c);

		System.out.println(a > 5 && b > 5); // 우선순위 : 비교연산자(>) > 논리연산자(&)

//		System.out.println(++a - 5); // 우선순위 : 단항연산자 > 산술연산자
		System.out.println(a++ - 5);
		System.out.println(a);
	}

}
