package lambda;

//람다식을 구현하기 위해서는 '함수형(적) 인터페이스' 를 생성해 준다.
//함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface
interface MyFunc3{
	int add(int x, int y);
}

public class Test03 {
	public static void main(String[] args) {
		MyFunc3 myfunc3 = new MyFunc3() {
			@Override
			public int add(int x, int y) {
				return x + y ;
			}
		};
		
		int res = myfunc3.add(10, 20);
		System.out.println("res : " + res);
	}
}
