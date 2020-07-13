package javaStudy;


public class Array {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1, 2, 3, 4};
		int[] array3 = {5, 6, 7, 8};
		
		for(int i=0; i<array2.length; i++) {
			System.out.println("array2[" + i +"] : " +array2[i]);
		}
		for(int i=0; i<array3.length; i++) {
			System.out.println("array3[" + i +"] : " +array3[i]);
		}
		int value = array3[2];
		System.out.println(value);
		
	}

}
