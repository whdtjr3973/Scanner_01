package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_02 {

	/*
	 * �Ϲ������� main(0 �޼��尡 ���� Ŭ��������
	 * �پ��� method���� �����Ͽ��ܺο��� ����� �� �ֵ���
	 * �ڵ尡 ���������.
	 * 
	 * �̶�, 
	 * Ŭ������ ���ǵ� method ����
	 * �������� ����� �������� member ���� ������ �����Ѵ�.
	 * 
	 * member���� ������ ����� �����߿�
	 * Primetive(�⺻�� ���� int, float, String, boolean)����
	 * �ڵ����� �ʱ�ȭ�� �Ǿ� ����غ� �ȴ�.
	 * 
	 * ������
	 * reference(������ ���� �迭, ��ü ��) ���� 
	 *�ڵ����� �ʱ�ȭ�� ���� �ʾ� ����غ� ���� �ʴ´�.
	 */
	private int intNum ; // �ڵ����� 0���� �ʱ�ȭ
	private Random rnd; // �ʱ�ȭ�ڵ�(= new Random();)��  �����ڷ�..
	private Scanner scan; 

	/*
	 * member ���� ������ ����� ��������������
	 * ����Ҽ� �ֵ��� �ʱ�ȭ(����)�ڵ��
	 * ������ �޼��忡 �� �ڵ带 �ۼ����־�� �Ѵ�.
	 */
	public NumPick_02() {
		rnd = new Random();
		scan = new Scanner(System.in);
	}
}