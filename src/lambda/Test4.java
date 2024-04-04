package lambda;

//람다식을 구현하기 위해서는 '함수형(적) 인터페이스' 를 생성해 준다.
//함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface
interface MyFunc4{
	int add(int x, int y);
}

public class Test4 {
	public static void main(String[] args) {
		MyFunc4 myfunc4 = new MyFunc4() {
			
			@Override
			public int add(int x, int y) {
			
				return x + y;
			}
		};
		int res = Myfunc4.add(40,50);
		System.out.println("res : " + res);
	}
}
