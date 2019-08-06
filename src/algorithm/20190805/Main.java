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
/*
public class Main {

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
*/

/*
##### Printing OXs앞의 문제들 중 비슷한 알고리즘이 있던 것 같지만, 같은 건 없다고 생각해서 올립니다. 문제를 푸는데 많은 approach가 있을 듯 싶습니다. 이 문제의 핵심은 비트 연산을 얼마나 잘 이해하고 있냐이기 때문에 비트 연산으로 풀어주세요.

input은 int n을 입력 받아 첫번째 row는 (n-1)의 O와 X, 두번째 row는 (n-2)의 O와 XX, 세번째 row는 (n-3)의 0와 XXX... n번째 row는 n의 X을 출력하시오.

입력 예시: 6
출력 예시:
OOOOOX
OOOOXX
OOOXXX
OOXXXX
OXXXXX
XXXXXX
*/
public class Main {

	public static void main(String[] args) {

		int inputValue = 0;
		int inputTest = 0;
		Scanner input = new Scanner(System.in);
		
		inputValue = input.nextInt();
		
		inputTest = inputValue;
		
		for ( int i=0; i<inputValue; i++ ) {
			for ( int j=1; j<=inputValue; j++ ) {
				if ( (inputTest-j) <= 0 ) {
					System.out.print("X");
				}
				else {
					System.out.print("O");
				}
			}
			inputTest--;
			System.out.println("");
		}
	}

}