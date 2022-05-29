package part3.ex6.iface.entity;

import java.util.Scanner;
import part3.ex6.iface.ui.ConsoleListener;

public class NewlecExam extends Exam{
// 인터페이스 : 다중상속이 가능하다.
// 클래스가 두 종류 : 캡슐의 클래스, 약속의 클래스(인터페이스)
// class NewlecExam : Exam, ConsoleListener, ... -> 다형성

	private int com;
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		return super.total() + com;
	}

	public NewlecExam() {
		super();
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	@Override
	public double avg() {
		return total() / 4.0;
	}
	// 만약 같은 이름의 메소드가 존재했다면? 
	public void onPrint(Exam exam) {
		
	}

}