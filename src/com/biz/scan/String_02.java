package com.biz.scan;

public class String_02 {

	public static void main(String[] args) {
		
		String strNum  = "30 ";
		
		// 문자열의 앞뒤에 있는 whiteSpace 일부를 제거해주는
		// method
		// whiteSpcae : sp(스페이스바), Tab(\t), CR
		int intNum = Integer.valueOf(strNum.trim());
		
		// java 11에서는 
		// strip() 메서드를 새롭게 사용할수 있는데
		// 이 메서드는 유니코드, UTF-8에 지정되어 있는
		// 약 12가지 정도의  whiteSpace를 모두 제거할 수 있다.
	}
}
