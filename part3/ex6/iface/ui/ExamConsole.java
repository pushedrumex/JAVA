package part3.ex6.iface.ui;

import java.util.Scanner;
import part3.ex6.iface.entity.Exam;

public class ExamConsole {

	private ConsoleListener listener;
	private Exam exam;
	
	public void setListener(ConsoleListener listener) {
		this.listener = listener;
	}
	
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
	public void print(BannerPrinter bannerPrinter) {

		if (bannerPrinter != null)
			bannerPrinter.print();
		
		else {
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│              성적 출력              │");
			System.out.println("└───────────────────────────────────┘");
		}
		System.out.println("국어 : " + exam.getKor());
		System.out.println("영어 : " + exam.getEng());
		System.out.println("수학 : " + exam.getMath());
		
		if(listener != null)
			listener.onPrint(exam);
		
		int total = exam.total();
		double avg = exam.avg();
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f\n", avg);
	}

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
		
		if(listener != null)
			listener.onInput(exam);

		scan.close();
	}
}
