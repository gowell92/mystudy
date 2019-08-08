package algorithm0805;

import java.util.Scanner;

/*
2019. 08. 05 알고리즘 문제
##### Duplicate Numbers

0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.

sample inputs: 0123456789 01234 01234567890 6789012345 012322456789

sample outputs: true false false true false
* 0번씩 사용된 숫자가 있어도 false 입니다
*/

public class Quiz1 {

	public static void main(String[] args) {

		boolean result = false;
		int inputSum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("inputs: ");
		
		String inputStr = input.next();
		
		if ( inputStr.length() != 10 ) { //문자 갯수가 10개 아니면 바로 아웃!!
			System.out.println("outputs: " + result);
		}
		else {
			for ( int i=0; i<10; i++ ) {
				inputSum += Integer.parseInt(inputStr.substring(i, i+1));
			}
			
			if( inputSum == 45 ) {
				result = true;
				System.out.println("outputs: " + result);
			}
			else {
				System.out.println("outputs: " + result);
			}
		}
		
	}

}