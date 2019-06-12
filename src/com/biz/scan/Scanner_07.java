package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_07 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고 키보드로부터 1부터 10까지 숫자를 입력받아서 난수를 맞추는 게임 작성하시오
		 * 
		 * 단, 임의로 종료를 선택할때까지 계속해서 새로운 난수를 만들고 게임을 계속할수 있도록 하시오
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		int use = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자(1~10)입력, 종료(--END) >>");
			String strKey = scan.nextLine();
			if (strKey.equals("--END")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			int intKey = Integer.valueOf(strKey.trim());
			use++;

			// 2번코드
			// 일반적인 pattern에서는
			// 중요한 코드(정답을 검사하는 코드)가
			// 가급적 윗쪽에 있도록작성한다.
			
			//이 코드는 정답을 맞추었을 경우
			// 오답인 경우를 건너 뛰어서
			// Scanner_06 보다는 다소 효율이 높다.
			if (intKey == intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(use + "번만에 성공하셨네요 ");
				intRnd = rnd.nextInt(10) + 1;
				use = 0;
				System.out.println("=====새 게임을 시작합니다=====");
			} else {

				if (intKey > intRnd) {
					System.out.println("큰수를 입력하셨네요");
				} else if (intKey < intRnd) {
					System.out.println("작은수를 입력하셨네요");
				}
			}
		}
		System.out.println("Game Over!");
	}
}