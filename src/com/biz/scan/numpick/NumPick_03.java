package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {


	private int intNum ; // �ڵ����� 0���� �ʱ�ȭ
	private Random rnd; // �ʱ�ȭ�ڵ�(= new Random();)��  �����ڷ�..
	private Scanner scan; 

	// ������ method
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	public void pickup() {
		
		rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		int use = 0;

		scan = new Scanner(System.in);

		while (true) {
			System.out.print("����(1~10)�Է�, ����(--END) >>");
			String strKey = scan.nextLine();
			if (strKey.equals("--END")) {
				System.out.println("������ �����մϴ�");
				break;
			}
			int intKey = Integer.valueOf(strKey.trim());
			use++;

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