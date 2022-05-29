package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.Exam;
import part3.ex5.abst.entity.NewlecExam;

public class NewlecExamConsole extends ExamConsole {
	
	NewlecExam exam = (NewlecExam)getExam(); // 형변환

	public NewlecExamConsole(Exam exam) {
		super(exam);
	}
	@Override
	public void print() {
		super.print();
	}
	@Override
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("컴퓨터 >");
		exam.setCom(scan.nextInt());
	}
	
	@Override
	// 자식 클래스나 같은 패캐지 내에서만 가능
	protected void onPrint() {
		System.out.println("컴퓨터 : " + exam.getCom());
	}
}