package javaStudy;

public class For {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				continue;	// �ٷ� ���� �������� �̵� (�Ʒ� �ڵ� ���� x) 
				// ¦���� ����
			}
			if(i==50) {
				break;		// for ���ǹ� ���������� (�ݺ��� ����)
			}
			total += i;	//total = total + i;
			
		}
		System.out.println(total);
	}

}
