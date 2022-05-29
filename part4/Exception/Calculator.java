package part4.Exception;

public class Calculator {

	// throws : 내가처리하기 않고 나를 사용하는 사용자가 처리
	public static int add(int x, int y) throws 천을_넘는_예외, 음수가되는예외 {
		int result = x+y;
		if (result > 1000)
			// 예외 발생
			throw new 천을_넘는_예외();
		if (result < 0)
			// 예외 발생
			throw new 음수가되는예외();
		return result;
	}

	public static int sub(int x, int y) throws 음수가되는예외 {
		int result = x-y;
		if (result < 0)
			throw new 음수가되는예외();
		return result;
	}

	public static int multi(int x, int y) {
		return x*y;
	}

	public static int div(int x, int y) {
		return x/y;
	}

}
