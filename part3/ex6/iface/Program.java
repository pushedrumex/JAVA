package part3.ex6.iface;

import java.util.Scanner;

import part3.ex6.iface.entity.Exam;
import part3.ex6.iface.entity.NewlecExam;
import part3.ex6.iface.ui.BannerPrinter;
import part3.ex6.iface.ui.ConsoleListener;
import part3.ex6.iface.ui.ExamConsole;

public class Program {

	public static void main(String[] args){

		NewlecExam exam = new NewlecExam();
		ExamConsole console = new ExamConsole();
		console.setExam(exam);
		
		// 중첩클래스 사용
		// inner class / nested class / 내부 클래스
		
		// 중첩된 클래스의 메소드에는 두개의 this 객체가 전달
		// 1. 아웃터 객체의 this -> NewlecExam.this
		// 2. 내부(자신) 객체의 this
		
		// 메서드 안의 클래스나 변수는 다른데서 절대 쓸 수 없기 때문에 접근제어자가 쓸모 없다
		
//		class AA implements ConsoleListener{
//			@Override
//			public void onPrint(Exam exam1) {
//				// NewlecExam nexam = (NewlecExam)exam;
//				System.out.println("컴퓨터 : " + exam.getCom());
//			}
//
//			@Override
//			public void onInput(Exam exam1) {
//				// NewlecExam nexam = (NewlecExam)exam;
//				Scanner scan = new Scanner(System.in);
//				System.out.print("컴퓨터 >");
//				exam.setCom(scan.nextInt());
//				scan.close();
//			}
//			
//		}
		
		// 익명클래스를 활용해서 인터페이스 구현 후 생성
//		ConsoleListener aa = new ConsoleListener() {
//
//			@Override
//			public void onPrint(Exam exam) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void onInput(Exam exam) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
		
		// 익명클래스
		console.setListener(new ConsoleListener() {

			@Override
			public void onPrint(Exam exam1) {
				System.out.println("컴퓨터 : " + exam.getCom());
			}

			@Override
			public void onInput(Exam exam1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("컴퓨터 >");
				exam.setCom(scan.nextInt());
				scan.close();
			}
			
		});
		console.input();
	

//		console.print(new BannerPrinter() {
//
//			@Override
//			public void print() {
//				System.out.println("┌───────────────────────────────────┐");
//				System.out.println("│        NewlecAcademy 성적출력       │");
//				System.out.println("└───────────────────────────────────┘");
//			}
//			
//		});
		
		// Arrow Function : Lambda Express
		// 매개값의 자료형 안써도됨
		// 매개값이 하나라면 소괄호 안써도됨
		// return만 있는 경우는 중괄호 안써도됨
		// 표현식이라면 중괄호 써야됨
		
		// 람다함수 사용
		console.print(()->{
				System.out.println("┌───────────────────────────────────┐");
				System.out.println("│        NewlecAcademy 성적출력       │");
				System.out.println("└───────────────────────────────────┘");
			});
	}
}