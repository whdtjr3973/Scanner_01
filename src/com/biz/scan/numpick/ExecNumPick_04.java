package com.biz.scan.numpick;

public class ExecNumPick_04 {

	public static void main(String[] args) {

		NumPick_04 np = new NumPick_04();

		np.makeRandom(); // ���ο� ���ڸ� 1�� ����
		while (true) {
			boolean bExit = np.keyInput(); // Ű���� �Է��� �ޱ�

			// if(bExit == true)
			if (bExit) {
				System.out.println("Game Over!");
				break;
				
			} else {
				int result = np.pickup();
				if (result == 0) {
					System.out.println("�� ���߾��");
					System.out.println(np.getuse() + "�� ���� ���߼̳׿�");
					np.resetuse();
					np.makeRandom();
				} else if (result > 0) {
					System.out.println("ū ���� �Է��ϼ̳׿�");
				} else {
					System.out.println("���� ���� �Է��ϼ̳׿�");
				}
//				System.out.println("To Be Continue");

			}
		}
		// Ű���忡�� ���� --END�� �Է�����
		// ������ �ڵ带 ���̻� ���ؾ��� �ʵ��� �Ѵ�
		// ���� 1 ~ 10 ���� �߿� �Է��� �Ǹ�
		// ���� �񱳸� �Ͽ� ������ �κ��� ����

	}
}
