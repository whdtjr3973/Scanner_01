package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {

		/* 
		 *  1���� 10���� ���� ������ �ϳ� �����
		 *  Ű����κ��� 1���� 10���� ���ڸ� �Է¹޾Ƽ�
		 *  ������ ���ߴ� ���� �ۼ�
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10)+1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����(1~10)�Է� >>");
		String strKey = scan.nextLine();
		int intKey = Integer.valueOf(strKey.trim());
		
		if(intKey == intRnd) {
			System.out.println("�� ���߾��");
		}
		if(intKey > intRnd) {
			System.out.println("ū���� �Է��ϼ̳׿�");
		} else if (intKey <intRnd) {
			System.out.println("�������� �Է��ϼ̳׿�");
		}
		
	}

}
