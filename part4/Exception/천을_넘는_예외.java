package part4.Exception;

public class 천을_넘는_예외 extends Exception {
// RuntimeException을 상속하는 예외 :  예외처리를 안해도 실행 가능
	@Override
	public String getMessage() {
		return "1000을 넘는 오류가 발생하였습니다.";
	}
	
}
