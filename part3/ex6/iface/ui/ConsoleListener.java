package part3.ex6.iface.ui;

import part3.ex6.iface.entity.Exam;

// 인터페이스
public interface ConsoleListener {

	void onPrint(Exam exam);
	void onInput(Exam exam);
	
	// 클래스와의 차이점 -> 인터페이스는 그냥 약속임 데이터 선언 불가
	// 특징 1. 접근제어자가 없음(항상 공개적) 2. 변수 선언 불가 3. 함수 구현 불가
}
