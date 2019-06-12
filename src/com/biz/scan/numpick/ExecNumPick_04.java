package com.biz.scan.numpick;

public class ExecNumPick_04 {

	public static void main(String[] args) {

		NumPick_04 np = new NumPick_04();

		np.makeRandom(); // 새로운 숫자를 1개 생성
		while (true) {
			boolean bExit = np.keyInput(); // 키보드 입력을 받기

			// if(bExit == true)
			if (bExit) {
				System.out.println("Game Over!");
				break;
				
			} else {
				int result = np.pickup();
				if (result == 0) {
					System.out.println("참 잘했어요");
					System.out.println(np.getuse() + "번 만에 맞추셨네요");
					np.resetuse();
					np.makeRandom();
				} else if (result > 0) {
					System.out.println("큰 수를 입력하셨네요");
				} else {
					System.out.println("작은 수를 입력하셨네요");
				}
//				System.out.println("To Be Continue");

			}
		}
		// 키보드에서 만약 --END가 입력됬으면
		// 나머지 코드를 더이상 진해아지 않도록 한다
		// 숫자 1 ~ 10 까지 중에 입력이 되면
		// 숫자 비교를 하여 나머지 부분을 실행

	}
}
