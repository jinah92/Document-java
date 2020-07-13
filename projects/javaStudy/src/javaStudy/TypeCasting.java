package javaStudy;

public class TypeCasting {

	public static void main(String[] args) {
		int x = 50000;
		long y = x;
		
		long x2 = 5;
		//int y2 = x2;	// error (묵시적 형변환)
		int y2 = (int)x2;	// 명시적 형변환

	}

}
