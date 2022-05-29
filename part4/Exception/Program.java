package part4.Exception;

public class Program {
	
	// 1. Add Throws declaration : 나도 던지겠다, 그냥 오류 발생 + 종료
	// 2. try-catch : 예외를 잡아서 처리하겠다.
	
	public static void main(String[] args){
		int result = 0;
		
		try { // 이 블럭에서 발생하는 예외를 
			result = Calculator.add(3000,4);
			System.out.printf("add : %d\n",result);
			result = Calculator.sub(3,4);
			
		}
		catch (천을_넘는_예외 e) { // 잡아서 이 블럭을 실행하겠다
			System.out.println(e.getMessage());
		}
		catch (Exception e) { // Exception : 모든 오류 클래스의 부모
			System.out.println("이외의 오류발");
		}
		finally { // 오류가 발생하였다면 마지막으로 꼭 거처가는 곳
			System.out.println("입력값에 오류가 있습니다.");
		}
		
		System.out.printf("sub : %d\n",result);
		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n",result);
		result = Calculator.div(3,0);
		System.out.printf("div : %d\n",result);
		
	}
}