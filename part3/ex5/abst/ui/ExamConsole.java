package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.Exam;

public abstract class ExamConsole {
	private Exam exam;
	
	public ExamConsole() {
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	// 메서드
	public void print() {
		Scanner scan = new Scanner(System.in);
		
		if (this == null) {
			System.out.println("성적이 입력되지 않았습니다. (Exam 객체가 존재하지 않음)");
			return;
		}

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println("국어 : " + exam.getKor());
		System.out.println("영어 : " + exam.getEng());
		System.out.println("수학 : " + exam.getMath());
		
		onPrint(); // 추상 메서드
		
		int total = exam.total();
		double avg = exam.avg();
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f\n", avg);
	}

	protected abstract void onPrint();
	// 일반 서비스처럼 활용하는게 아니라
	// 자식클래스에서만 접근할 수 있도록

	public void input() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.print("국어 >");
		exam.setKor(scan.nextInt());
		System.out.print("영어 >");
		exam.setEng(scan.nextInt());
		System.out.print("수학 >");
		exam.setMath(scan.nextInt());
	}
}
