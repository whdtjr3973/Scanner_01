package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_05 {

	public static void main(String[] args) {

		/*
		 * 1���� 10���� ���� ������ �ϳ� ����� Ű����κ��� 1���� 10���� ���ڸ� �Է¹޾Ƽ� ������ ���ߴ� ���� �ۼ�
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		int use = 0;

		Scanner scan = new Scanner(System.in);

		// ������� ���ڸ� ���߾����� �˾ƺ���
		// ���ڸ� ���߸�
		// *������ ���߼̳׿� ��� �޼����� ǥ��
		while (true) {
			System.out.print("����(1~10)�Է� >>");
			String strKey = scan.nextLine();
			int intKey = Integer.valueOf(strKey.trim());
			use++;
			if (intKey == intRnd) {
				System.out.println("�� ���߾��");
				System.out.println(use + "������ �����ϼ̳׿� ");
				break;
			}
			if (intKey > intRnd) {
				System.out.println("ū���� �Է��ϼ̳׿�");
			} else if (intKey < intRnd) {
				System.out.println("�������� �Է��ϼ̳׿�");
			}
		}
		System.out.println("Game Over!");

	}

}
