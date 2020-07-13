package javaStudy;

public class Operator4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		System.out.println(b1 && b2); // false
		System.out.println(b1 && b3); // true
		System.out.println(b1 || b2); // true
		System.out.println(b2 || b2);// false

		int score = 88;
		if (score <= 100 && score >= 70) {
			System.out.println("success");
		} else {
			System.out.println("failed");
		}

		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		System.out.println(!b2);
	}

}
