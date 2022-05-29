package part3.ex4.is;

import java.util.Scanner;

public class ExamConsole {

	private Exam exam;
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}

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
