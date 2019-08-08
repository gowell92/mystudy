package algorithm0806;

import java.util.Scanner;

/*
##### Da
sh Insert
DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. (예, 454 => 454, 4546793 => 454*67-9-3) DashInsert 함수를 완성하자. 출처

입력 - 화면에서 숫자로 된 문자열을 입력받는다.
"4546793"
출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
"454*67-9-3"
*/
public class Quiz1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("inputs: ");
		
		String inputStr = input.next();
		String output   = "";
		String prevNum  = "";
		int    inputInt;
		
		for( int i=0; i < inputStr.length(); i++ ) {
			
			try {
				inputInt = Integer.parseInt(inputStr.substring(i, i+1));
				
				if ( (inputInt % 2) == 1 ) { //홀수이면
					if ( prevNum.equals("odd") ) { //앞에 숫자가 홀수이면
						output += "-";
					}
					
					output += String.valueOf(inputInt);
					prevNum = "odd";
				}
				else { //짝수이면
					if ( prevNum.equals("even") ) { //앞에 숫자가 짝수이면
						output += "*";
					}
					
					output += String.valueOf(inputInt);
					prevNum = "even";
				}
			} catch( NumberFormatException e ) {
				System.out.println("input type is not Integer...");
				return;
			}

		}
		System.out.println("outputs: " + output);
		
	}

}