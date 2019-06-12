package com.biz.scan;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름>");
		String strName = scan.nextLine(); // 문자열을 입력하라
		System.out.print("국어점수>");
		int intKor = scan.nextInt();
		
		// nextInt()에서 키보드로 숫자 + Enter를 누르면
		// 숫자는 intKor에 담고 Enter키보드를 저장공간에서 삭제해야하는데
		// 그렇지않고 계속 남겨둔다
		
		// 결과 다음번 nextLine()에서는 사용자가 무언가 입력하고
		// Enter를 눌렀다고 판단한다
		// 그래서 입력을 기다리지않고 다음으로 진행
		System.out.print("전화번호>");
		String strNumber= scan.nextLine();
		
		System.out.println("이름 : " + strName);
		System.out.println("국어점수 : " + intKor);
		System.out.println("전화번호 : " + strNumber);
		
		
		
		
	}

}
