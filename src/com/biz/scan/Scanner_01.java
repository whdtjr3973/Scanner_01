package com.biz.scan;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 2���� ���ڸ� Ű����κ��� �Է¹޾Ƽ�
		// ����, ����, ����, ������ 4Ģ������ �����Ѵ�.
		
		int num1 = 0;
		int num2 = 0;
		
		// prompt ����ϸ�
		// ����ڿ��� Ű����� ���� �����϶�� �޼����� ǥ��
		System.out.print("����1�Է�>");
		num1 = scan.nextInt();
		System.out.print("����2�Է�>");
		num2 = scan.nextInt();
		System.out.printf("%d + %d = %d",num1,num2,num1 + num2);
		
		
		
		
	}

}
