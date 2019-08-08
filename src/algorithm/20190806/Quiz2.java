package algorithm0806;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
##### Perfect Number
자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다. 예를 들면, 6과 28은 완전수이다. 6=1+2+3 // 1,2,3은 각각 6의 약수 28=1+2+4+7+14 // 1,2,4,7,14는 각각 28의 약수

입력으로 자연수 N을 받고, 출력으로 N 이하의 모든 완전수를 출력하는 코드를 작성하라.
*/
public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("inputs: ");
		
		try {
			int inputInt = input.nextInt();
			int divisorSum = 0; //약수의 합
		
			if ( inputInt < 6 ) { //6은 완전수 중에 제일 작은수이므로 입력값이 6보다 작으면 바로 종료.
			
			}
			else {
				for ( int i=6; i < inputInt; i++ ) { //완전수 loop
					
					for ( int j=1; j < i; j++ ) { //약수 loop
					
						if ( (i % j) == 0 ) { //약수이면
							divisorSum += j;
						}
					}
					
					if ( divisorSum == i ) {
						System.out.print(i + " ");
					}
					divisorSum = 0; //초기화
				}
			}
		} catch( InputMismatchException e ) {
			System.out.println("input type is not Integer...");
			return;
		}
		
	}

}
