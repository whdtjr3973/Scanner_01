package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; // 초기화코드(= new Random();)를 생성자로..
	private Scanner scan;
	private int intRnd;
	private int use;
	private int intKey;

	public void resetuse() {
		use = 0;
	}

	public int getuse() {
		return use;
	}

	// 생성자 method
	public NumPick_04() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void makeRandom() {
		intRnd = rnd.nextInt(10) + 1;
	}

	public boolean keyInput() {
		System.out.print("숫자(1~10)입력, 종료(--END) >>");
		String strKey = scan.nextLine();
		use++;
		if (strKey.equals("--END")) {
			return true;
		}
		intKey = Integer.valueOf(strKey.trim());
		return false;
	}

	public int pickup() {

		int ret = intKey - intRnd;
		if (ret == 0) {
			int intRnd = rnd.nextInt(10) + 1;
		}
		return ret;
	}
}