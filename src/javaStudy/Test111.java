package src.javaStudy;
/*=========================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
===========================*/

// ※ 『super』
//	   static 으로 선언되지 않은 메소드에서 사용되며
//	   현재 클래스가 상속받은 상위 클래스의 객체를 가리킨다.
//	   super 는 상위 클래스의 생성자를 호출하거나
//	   상위 클래스의 멤버 변수 또는 메소드를 호출할 때 사용할 수 있다.

//	   하위 클래스의 생성자에서 상위 클래스의 생성자를 호출할 때에는
//	   하위 클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다.

//	   ※ 생성자와 클래스 상속간의 관계

//	   하위 클래스는 상위 클래스의 멤버를 상속받지만,
//	   생성자는 상속 대상에서 제외된다.
//	   그리고, 하위 클래스의 생성자가 호출될 때
//	   자동으로 상위 클래스의 생성자가 호출된다.
//	   이 때, 상위 클래싀 생성자는
//	   인수가 없는 생성자(default 생성자 형태) 가 호출된다.

//	   상위 클래스 및 하위 클래스를 설계하는 과정에서
//	   생성자를 정의하지(작성하지) 않거나
//	   인수가 없는 생성자만을 정의한(작성한) 경우
//	   명시적으로 하위 클래스에서 상위 클래스의 생성자를 호출하지 않아도
//	   아무런 문제가 발생하지 않지만
//	   상위 클래스에 인자가 있는 생성자만 존재하는 경우에는
//	   주의해야 한다.

//	   예를 들어 다음에서
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			// super();
		}
	}
*/

//	   하위 클래스인 B_class 의 생성자에서
//	   명시적으로 A_class 의 생성자를 호출하지 않으면
//	   자동으로 인자가 없는 생성자를 호출한다.
//	   하지만, A_class 에는 인자가 있는 생성자만 존재하고
//	   인자가 없는 생성자는 존재하지 않기 때문에 에러 발생한다.
//	   따라서 B_class 의 생성자 선두에
//	   다음처럼 명시적으로 상위 클래스의 생성자를 호출해야 한다.
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super(10);
			...;
			...;
		}
	}
*/

/*
==========================================================================================================
	상위 클래스		|	하위 클래스		|	결과
----------------------------------------------------------------------------------------------------------
생성자를 정의하지	|생성자 정의 안함	|→ 가능하다.
않음				|인수가 없는 생성자	|→ 가능하다.
					|인수가 있는 생성자	|→ 가능하다.
----------------------------------------------------------------------------------------------------------
인수가 없는			|생성자 정의 안함	|→ 가능하다.
생성자만 정의		|인수가 없는 생성자	|→	가능하다.
					|인수가 있는 생성자	|→	가능하다.
----------------------------------------------------------------------------------------------------------
인수가 있는			|생성자 정의 안함	|→	에러 발생.
생성자만 정의		|인수가 없는 생성자	|→	상위 클래스의 해당 생성자를 호출하지 않으면 에러 발생.
					|인수가 있는 생성자	|→ 상위 클래스의 해당 생성자를 호출하지 않으면 에러 발생.	
==========================================================================================================

*/

/*
※ 상속 시 주의사항

   상위 클래스에서 선언된 멤버 변수의 이름과
   하위 클래스에서 선언된 멤버 변수의 이름이 같으면
   상위 클래스의 멤버 변수는 무시된다.
   이 때, 상위 클래스의 멤버 변수를 사용하기 위해서는
   『super』 키워드를 이용한다.

   동일한 이름의 멤버변수나 동일한 이름의 메소드가
   한 클래스 안에 선언되거나 정의되는 경우 기본적으로 에러 발생한다.
   단, 메소드의 경우에는 매개 변수의 갯수나 타입이 다른경우
   에러가 발생하지 않고 이들을 서로 다른 메소드로 취급하게 된다. (Method Overloading)
   → Method Overriding 과 구분하여 개념 정리해 둘것.
*/


// 부모 클래스
class SuperTest111
{
	protected double area;
	private String title;		//-- 상속 대상에서 제외~!!!

	// 생성자 - 부모 클래스 생성자
	public SuperTest111()
	{
		System.out.println("Super Test111... 인자없는 생성자");
	}
	// ※ 생성자는 상속 대상에서 제외된다.~!!! check~!!!
	
	// 생성자 - 부모 클래스 생성자
	public SuperTest111(String title)
	{
		this.title = title;
		System.out.println("SuperTest111... 문자열을 인자로 받는 생성자");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
}

// SuperTest111 을 상속받는 자식 클래스
class Rect1 extends SuperTest111
{
	/*
	***** private 과 생성자들은 제외됨 *****

	protected double area;

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/

	private int w, h;

	// 생성자 - 자식 클래스 생성자
	public Rect1()
	{
		// SuperTest111();	//super();
	}

	
	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;
		write();
	}


	@Override		//-- 어노테이션(annotation) - metadata JDK1.5부터 지원
	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 - " + area);
	}
	
	// ※ 메소드 오버라이딩(Method Overriding) == 재정의 == 덮어쓰기
	//	  상위 클래스를 상속받은 하위 클래스에서
	//	  상위 클래스에 정의된 메소드를 재정의하는 것으로
	//	  객체 지향 프로그래밍의 특징인 다형성을 나타낸다.
	//	  재정의(Overriding)는 반드시 상속 관계가 있어야 하며,
	//	  메소드 이름, 리턴 타입, 매개변수의 갯수나 타입이
	//	  완전히 일치해야 한다.


}

// SuperTest111 을 상속받는 자식 클래스
class Circle extends SuperTest111
{

	/*
	***** private 과 생성자들은 제외됨 *****

	protected double area;

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/

	// 생성자 
	public Circle(String title)
	{
		// SuperTest111(); // super();
		

		super(title);


	}

	public void calc(int r)
	{
		/*
		super.area = r * r * 3.141592;
		super.write();
		*/
		area = r * r * 3.141592;
		write();
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test111
{
	public static void main(String[] args)
	{
		Rect1 ob1 = new Rect1();
		//--==>> Super Test111... 인자없는 생성자

		//Circle ob2 = new Circle();
		//--==>> 에러 발생
		// 사용자 정의 생성자로 인해 default  생성자가 삽입되지 않음.

		Circle ob2 = new Circle("원");
		//--==>> SuperTest111... 문자열을 인자로 받는 생성자
		
		ob1.calc(10, 5);
		//--==>> w : 10, h : 5
		//		 사각형 - 50.0

		ob2.calc(50);
		//--==>> 원 - 7853.9800000000005




	}
}