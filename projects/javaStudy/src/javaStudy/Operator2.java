package javaStudy;

public class Operator2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;

		System.out.println(i == j); // true
		System.out.println(i != j); // false
		System.out.println(i < j); // false
		System.out.println(i <= j);// true
		System.out.println(i > j); // false
		System.out.println(i >= j);// true

		i += 10;// i=i+10;
		System.out.println(i);
		System.out.println(i -= 5);
	}

}
