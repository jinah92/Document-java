package javaStudy;

interface Product {}
class TV implements Product {}
class SmartTV extends TV {}

public class Test {

	public static void main(String[] args) {
		Product ob = new TV();
		TV ob2 = new TV();
		SmartTV ob3 = new TV();
		Object ob4 = new TV();
	}

}
