package javaStudy;

public class While {

	public static void main(String[] args) {
//		int i = 0;
//		while (i < 10) {
//			System.out.println("i ÀÇ °ª : " + i);
//			++i;	// i = i + 1;
//		}

		int total = 0;
		int i = 1;
		while (i <= 100) {
			total = total + i;
			i++;
		}
		System.out.println("total : " + total);

	}
}
