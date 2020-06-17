package src.javaStudy;
/*========================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
==========================*/
/*
 ○ 배열의 개요

 	1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여
	   공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로
	   『동질적인 성격을 가진 자료들』 에 대해
	   개별적으로 자료형(Data Type) 을 부여하지 않고
	   하나의 이름을 가지고 일괄적으로 처리할 목적으로 사용된다.

	   -->> 이름은 맨앞 주소만을 기억하고 인접해서 numbering 되어있는 배열방들은 '호' 수(index)를 찾아가는 개념

	2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다.
	   배열 선언 → 배열에 메모리 할당 → 배열 요소의 사용

 ○ 형식 및 구조

 	자료형[] 변수명;
	변수명 = new 자료형[요소크기];
	변수명[인덱스] = 값;

	
	
	int[] arr;
	arr = new int[3];	// 메모리에 방 3개 짜리를 퍼올려라
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;



*/
public class Test079
{
	public static void main(String[] args)
	{
		

		// 배열 선언
		int[] arr;

		// 메모리 할당
		arr = new int[10];

		// 배열은 다음과 같이 선언과 동시에
		// 메모리 할당 및 초기화가 가능하다.
		int[] arr2 = new int[10];
		int[] arr3 = {1,2,3,4,5,6,7,8,9,0};	// 이 경우 자바가 인접해서 메모리에 저장을 해두고 arr3가 주소를 받게 됨. 초기화까지 완료된 상황
		int arr4[] = {1,2,3,4,5,6,7,8,9,0};	// 이거 가능함

		// 배열 요소 사용(접근)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		// ※ 값을 할당하지 않은 나머지 배열 공간은
		//	  자동으로 초기화 된다. → 0 (int형 배열) like 인스턴스 생성에서의 전역변수

		int num = 10;
		System.out.println("num : " + num);


		System.out.println("arr : " + arr);
		//--==>> arr : [I@15db9742	→ 주소를 나타내는 자바만 알아볼수있는 해시코드

		//-- 배열을 출력하기 위해 배열명을 일반 변수처럼 사용하여
		//	 출력하는 구문으로 작성하게 되면
		//	 배열의 각 방에 들어있는 데이터가 출력되는 것이 아니라
		//	 우리가 알아볼 수 없는 코드가 출력된다.
		//	 (자바는 메모리 주소값에 사용자가 직접 접근하는 것을 허용하지 않기 때문에)


		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);

		System.out.println("arr[2] : " + arr[2]);
		//--==>> arr[0] : 1	
		//		 arr[1] : 2
		//		 arr[2] : 3

		System.out.println(arr[0] + " " + arr[1] + " " +arr[2] + " " +arr[3] + " " +arr[4] + " " +arr[5] + " " +arr[6] + " " +arr[7] + " " +arr[8] + " " +arr[9] );
		//--==>> 1 2 3 0 0 0 0 0 0 0
		

		// 반복문을 활용하여 배열에 담긴 데이터 전체 출력
		for (int i=0; i<10; i++)
		{
			// 테스트
			// System.out.println("i : " + i);

			// 테스트
			//System.out.printf("%2d", arr[i]);
			//--==>>  1 2 3 0 0 0 0 0 0 0

			System.out.printf("arr 배열의 %d번째 방 : %2d\n", i, arr[i]);
			//--==>>

			/*
			arr 배열의 0번째 방 :  1
			arr 배열의 1번째 방 :  2
			arr 배열의 2번째 방 :  3
			arr 배열의 3번째 방 :  0
			arr 배열의 4번째 방 :  0
			arr 배열의 5번째 방 :  0
			arr 배열의 6번째 방 :  0
			arr 배열의 7번째 방 :  0
			arr 배열의 8번째 방 :  0
			arr 배열의 9번째 방 :  0
			*/

		}
		System.out.println();







	}
}