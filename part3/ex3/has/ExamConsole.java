package part3.ex3.has;

import java.util.Scanner;

public class ExamConsole {
	// Exam 객체exam을 has a 상속 : Exam객체를 객체변수로 갖도록
	
	// has a 1. Composition : 일체형 방법
	// 		 2. Association : 연관형 방법
	private Exam exam;
	
	public void setExam(Exam exam) { // Association
		this.exam = exam;
	}

//	public ExamConsole() {
//		exam = new Exam(); // Composition
//	}
	
	// 메서드
	public void print() {

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

		int total = exam.total();
		double avg = exam.avg();
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f\n", avg);
	}
	
	// 함수
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.println("국어 >");
		exam.setKor(scan.nextInt());
		System.out.println("영어 >");
		exam.setEng(scan.nextInt());
		System.out.println("수학 >");
		exam.setMath(scan.nextInt());
		
	}
}
