package com.biz.scan;

public class String_02 {

	public static void main(String[] args) {
		
		String strNum  = "30 ";
		
		// ���ڿ��� �յڿ� �ִ� whiteSpace �Ϻθ� �������ִ�
		// method
		// whiteSpcae : sp(�����̽���), Tab(\t), CR
		int intNum = Integer.valueOf(strNum.trim());
		
		// java 11������ 
		// strip() �޼��带 ���Ӱ� ����Ҽ� �ִµ�
		// �� �޼���� �����ڵ�, UTF-8�� �����Ǿ� �ִ�
		// �� 12���� ������  whiteSpace�� ��� ������ �� �ִ�.
	}
}
