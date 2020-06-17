package src.javaStudy;
/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 실습
===========================================*/

// ○ 실습 문제
// 1 부터 100 까지의 정수 중에서
// 짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다.
// 그리고 결과값을 출력하는 프로그램을 구현한다.
// 단, 반복문은 while 문을 사용할 수 있도록 하며,
// 조건 구문은 if 조건문을 사용하여 작성할 수 있도록 한다.

// 실행 예)
// 1 부터 100 까지의 정수 중
// 짝수의 합 : 2550
// 홀수의 합 : 2550
// 계속하려면 아무 키나 누르세요...

public class Test045
{
	public static void main(String[] args)
	{
		int i = 1, sum1 = 0, sum2 = 0;			// 초기값 설정 변수 선언(초기화)
												// 일반적으로 누적합의 초기화는 '0' 로 누적곱의 초기화는 '1'로 한다.

		while (i<=100)
		{			
			// 1

			if (i%2==0)	//-- 짝수인지 판별한 후 합을 누적
			{
				sum1 += i;

			}
			else if (i%2!=0)	//-- 홀수인지 판별한 후 합을 누적
			{
				sum2 += i;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return; // 프로그램 종료
			}
			
			i++;
			
			
		}

		System.out.println("1 부터 100 까지의 정수 중");
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);

		
		
	}
}

// 실행 결과
/*
1 부터 100 까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/
