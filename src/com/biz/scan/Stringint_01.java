package com.biz.scan;

public class Stringint_01 {

	public static void main(String[] args) {

		System.out.println(30+40); // 70
		System.out.println("30+40"); // 30+40
		
		// "30"�� "40"�� ���ڿ��� ���ڶ�� �ϸ�
		// ���� 30�� ���� 40���� ��ȯ���Ѽ�
		// 4Ģ������ ������ ���� �ִ�.
		System.out.println("30"+ "40"); // 3040
		
		// ���ڿ��� ������ ��ȯ�Ͽ� ������ ����
		System.out.println(Integer.valueOf("30") + Integer.valueOf("40"));
		
		// ������ ���ڿ��� ��ȯ�Ͽ� ������ ����
		System.out.println(Integer.toString(30)+ Integer.toString(40));
		
		System.out.println(Float.valueOf("30.0f"));
		// 30���ڿ��� white Space�� �־
		// ����(����)�� ��ȯ�� �� ����.
		// NumberFomatException������ �߻�
		// System.out.println(Integer.valueOf("A30"));
	}

}
