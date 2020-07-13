package javaStudy;

public class For {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				continue;	// 바로 다음 조건으로 이동 (아래 코드 실행 x) 
				// 짝수만 누적
			}
			if(i==50) {
				break;		// for 조건문 빠져나오기 (반복문 종료)
			}
			total += i;	//total = total + i;
			
		}
		System.out.println(total);
	}

}
