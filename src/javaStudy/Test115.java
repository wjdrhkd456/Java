package src.javaStudy;
/*=========================
  ■■■ 클래스 고급 ■■■
  - 상속 관계에 있는 클래스들 간의 캐스팅
  - 업 캐스팅, 다운 캐스팅
===========================*/

// super class
class SuperTest115
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}

	public int hap()
	{
		return a+b;
	}
}

// sub class
class SubTest115 extends SuperTest115
{
	public int b=100, c=200;

	@Override
	public int hap()
	{
		return a+b+c;
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드...");
	}
}

// main() 메소드를 포함하는 외부 클래스
public class Test115
{
	public static void main(String[] args)
	{
		// sub class 기반 인스턴스 생성
		SubTest115 ob1 = new SubTest115();
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100

		// ○ 업 캐스팅
		//SuperTest115 ob2;
		SuperTest115 ob2 = ob1;	// 『SuperTest115 ob2 = (SuperTest115)ob1;』 과 동일한 코드

		/*
		학생 현지 = new 학생();
		인간 사람 = 현지;		// 『인간 사람 = (인간)현지;』과 동일한 코드

		byte a = 10;			// 『short b = (short)a;』
		short b = a;
		*/

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		//-- 변수는 객체별로 따로 할당되므로
		//	 변수b는 ob2의 변수이다.

		System.out.println("합	 : "+ ob2.hap());
		//--==>> 합		: 310
		//-- hap() 메소드는 오버라이딩(Overriding)되어 있고
		//	 ob2 는 ob1 을 업캐스팅한 상태의 객체이므로
		//	 『SuperTest115』의 hap() 메소드를 호출하는 것이 아니라
		//	 『SubTest115』 에서 재정의한 hap() 메소드를 호출하게 된다.
		//	 즉, 메소드는 업캐스팅이 되더라도
		//	 재정의(덮어쓰기)한 이상 원래의 기능으로 되돌릴 수 없다.

		ob2.write();
		//--==>> 슈퍼 클래스 write() 메소드...

		//ob2.print();
		//--==>> 에러 발생.

		// ○ 다운 캐스팅
		((SubTest115)ob2).print();
		//--==>> 서브 클래스 print() 메소드...

		// ※ 추가 관찰 -----------------------------------------------------------------------
		//	  다운 캐스팅 가능 여부

		SuperTest115 ob3 = new SuperTest115();
		SubTest115 ob4;

		//System.out.println(ob3.c);
		//--==>> 에러 발생
		//-- 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.

		//ob4 = ob3;
		//--==>> 에러 발생
		//-- 상위 객체는 하위 객체에 담을 수(참조할 수) 없다.

		ob4 = (SubTest115)ob3;
		//--==>> 에러 발생(런타임 에러)
		//-- 작성된 구문의 문법적인 구조만 봤을 때
		//	 다운 캐스팅이 이루어지는 상황이다.
		//	 하지만 정상적인 캐스팅이 이루어지지 않는다.
		//	 현재 SubTest115 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		//	 다운 캐스팅이 불가능한 것이다.

		System.out.println(ob4.c);
		//--==>> 에러 발생





		

		
	}
}

/*

○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 ---------------------------------------------

1. 하위 객체 생성;
2. 상위 = 하위;			//-- 업 캐스팅.		정상.
3. 하위 = 상위;			//-- 에러 발생.
4. 하위 = (하위)상위	//-- 다운 캐스팅.	정상.

○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우 ---------------------------------------------------

1. 상위 객체 생성;		//-- check~!!!
2. 하위 = 상위;			//-- 에러 발생.
3. 하위 = (하위)상위;	//-- 다운 캐스팅.	런타임 에러 발생.

※ 업 캐스팅은 항상 가능. 다운 캐스팅은 경우에 따라 가능.

----------------------------------------------------------------------------------------------------

*/