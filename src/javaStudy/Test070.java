package src.javaStudy;
/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=======================================*/

// 직사각형 클래스 설계
/*
직사각형의 넓이와 둘레 계산, 클래스로 표현

클래스의 정체성 → 직사각형
클래스의 속성	→ 가로, 세로, (넓이, 둘레, 부피, 무게, 재질, ...)
클래스의 기능	→ 넓이 계산, 둘레 계산, 가로/세로 입력, 결과 출력, ...

*/

/*
객체를 구성 → 데이터(속성, 상태) + 기능(행위, 동작)

클래스 설계 →		변수		  +		메소드
*/

import java.util.Scanner;

class Rect // 직사각형 클래스 설계
{
	// ○ 변수 선언(가로/세로)
	// 전역 변수 - 클래스 영역 안에서 글로벌 활동이 가능한 변수
	// 멤버 변수 - 클래스에 소속되어 있는 요소로써의 의미
	// 인스턴스 변수 - 인스턴스가 생성되었을 때 (new 클래스명();) 비로소 메모리 할당이 이루어지는 변수	-->> 인스턴스를 통해!!!
	int w, h;

	// 변수이름은 정적, 메소드이름은 동적(동사) 로 짓는것이 암묵적!!

	// ○ 메소드 정의(가로/세로 입력)
	void input()
	{
		// Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	// ○ 메소드 정의(넓이 계산)
	//-- 메소드 실행 후 결과가 정수인 경우를 지정하기 위하여
	//	 리턴 자료형(반환 자료형)은 int 형을 사용하게 된다.
	//	 사각형의 넓이를 구하는 과정에서 필요한 연산은
	//	 『가로 * 세로』이며, 이들은 모두 정수이기 때문이다.
	//	 또한 넓이나 둘레를 담을 변수를 별도로 선언한 상황이 아니기 때문에
	//	 연산 결과는 메소드를 호출한 곳에 반환하는 형태로 처리되어야 한다.
	//-- 넓이 연산에 필요한 가로 / 세로는 전역변수 형태로
	//	 구성되어 있는 상태이기 때문에 별도로 넘겨받을 필요가 없다.
	int calArea()
	{
		int result;		//-- return 값이 필수일 때 꼭 미리 만들어 놓기 ①

		result = w * h;

		return result;	//	②

		// ※ 메소드는 『return』문을 통해서만 결과를 돌려주게(반환하게)된다.
	}



	// ○ 메소드 정의(둘레 계산)
	int calLength()
	{
		int result;

		result = (w+h) * 2;

		return result;
	}

	// ○ 메소드 정의(결과 출력) → 가로, 세로, 넓이, 둘레

	void print(int a, int l)
	{
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}


}


// ※ 하나의 자바파일(.java)에 여러 개의 클래스(class)를 만들 수 있다.
//	  하지만 『public class』는 하나만 올 수 있다.
//	  파일을 저장할 때의 이름은 이 『public class』의 이름으로 저장해야 한다.
//	  일반적으로는 하나의 파일에 하나의 클래스를 설계한다.
//	  또한, 여러 개의 클래스가 설계된 하나의 파일을 컴파일하게 되면
//	  내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.




public class Test070
{
	public static void main(String[] args)
	{
		// Rect 클래스 인스턴스 생성
		Rect ob = new Rect();				//-- 첫 번째 생성된 사각형

		// 입력 메소드 호출
		ob.input();

		// 넓이 계산, 둘레 계산 메소드 호출
		int area = ob.calArea();
		int length = ob.calLength();

		// 결과 출력 메소드 호출
		ob.print(area, length);
		
	}
}

// 실행 결과

/*
가로 입력 : 100
세로 입력 : 200
가로 : 100
세로 : 200
넓이 : 20000
둘레 : 600
계속하려면 아무 키나 누르십시오 . . .

*/