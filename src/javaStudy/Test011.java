package src.javaStudy;
/*=================================================
	■■■ 변수와 자료형 ■■■
	- 퀴즈
	  Test010 클래스의 작성 내용을 참고하여
	  직사각형의 넓이와 둘레를 구하는 프로그램을 구현한다.
	  → 가로 : 10. 세로 : 20

========================================================*/

// 실행 예)
// 넓이 :
// 둘레 :
// 계속하려면 아무 키나 누르세요...



public class Test011
{
	public static void main(String[] args)
	{
		// 변수 선언
		int a = 10, b = 20, c, d;			//a : 가로, b : 세로, c : 넓이, d : 둘레

		// 연산 및 처리
		c = a * b;
		d = 2 * (a + b);

		// 결과 출력

		System.out.println("넓이 : " + c);
		System.out.println("둘레 : " + d);
	}
}


// 결과 값
/*
넓이 : 200
둘레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/