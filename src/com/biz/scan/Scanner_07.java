package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_07 {

	public static void main(String[] args) {

		/*
		 * 1���� 10���� ���� ������ �ϳ� ����� Ű����κ��� 1���� 10���� ���ڸ� �Է¹޾Ƽ� ������ ���ߴ� ���� �ۼ��Ͻÿ�
		 * 
		 * ��, ���Ƿ� ���Ḧ �����Ҷ����� ����ؼ� ���ο� ������ ����� ������ ����Ҽ� �ֵ��� �Ͻÿ�
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		int use = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("����(1~10)�Է�, ����(--END) >>");
			String strKey = scan.nextLine();
			if (strKey.equals("--END")) {
				System.out.println("������ �����մϴ�");
				break;
			}
			int intKey = Integer.valueOf(strKey.trim());
			use++;

			// 2���ڵ�
			// �Ϲ����� pattern������
			// �߿��� �ڵ�(������ �˻��ϴ� �ڵ�)��
			// ������ ���ʿ� �ֵ����ۼ��Ѵ�.
			
			//�� �ڵ�� ������ ���߾��� ���
			// ������ ��츦 �ǳ� �پ
			// Scanner_06 ���ٴ� �ټ� ȿ���� ����.
			if (intKey == intRnd) {
				System.out.println("�� ���߾��");
				System.out.println(use + "������ �����ϼ̳׿� ");
				intRnd = rnd.nextInt(10) + 1;
				use = 0;
				System.out.println("=====�� ������ �����մϴ�=====");
			} else {

				if (intKey > intRnd) {
					System.out.println("ū���� �Է��ϼ̳׿�");
				} else if (intKey < intRnd) {
					System.out.println("�������� �Է��ϼ̳׿�");
				}
			}
		}
		System.out.println("Game Over!");
	}
}