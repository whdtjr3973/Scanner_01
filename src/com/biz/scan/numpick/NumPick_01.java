package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

/*
 * main() method�� ���� Ŭ������
 * helper Ŭ���� ��� �ϸ�
 * �ٸ� Ŭ����, method���� ��ü�� �����Ͽ�
 * ����ϴ� Ŭ����
 */
public class NumPick_01 {

	// ������� ���� (scope), �ʵ庯�� ����
	// rnd�� scan ��ü�� ������ Ŭ������ ����
	// rnd�� scan�� ���Ե� method���� ���� ����� �� ����.
	private Random rnd;
	private Scanner scan;
	
	// Ŭ������ ������ method
	// 1. Ŭ������� �Ȱ���(ù���� �빮�� ��..)�̸��� ���ϰ�
	// 2. return Type�� ���� ���� �ʴ´�.
//	public NumPick_01 NumPick_01(){ <-�ڱ� �ڽ��� return������ �Ѵ�.
//		return null;
//	}
	public NumPick_01() {
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	public Scanner getScan() {
		return scan;
	}
}
