package com.biz.scan;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// �ΰ��� ���ڸ� �Է¹޾Ƽ� 4Ģ ������ �����Ѵ�.

		int num1 = 0;
		int num2 = 0;

		// Ű���忡���� ���ڿ� �����ͷ� ���ڸ� �Է¹ް�
		// ���� ������ ��ȯ�ϴ� �۾��� ���ִ� ���� ����.
		System.out.print("����1>");
		String strKey1 = scan.nextLine();
		// ���ڿ��� ���ڸ� ������ ��ȯ
		num1 = Integer.valueOf(strKey1);

		System.out.print("����2>");
		String strKey2 = scan.nextLine();
		num2 = Integer.valueOf(strKey2);

		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);

	}

}
