package part2.ex3.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		Exam exam = new Exam();
		while (true) {
			
			int menu = inputMenu();

			switch (menu) {
			case 1:
				Exam.input(exam); // 여기서 Exam은 객체가 아님. input함수가 선언되어있는 클래스
				break;
			case 2:
				exam.print(); // 여기서 exam은 객체
				break;
			case 3:
				exam.load();
				break;
			case 4:
				exam.save();
				break;
			case 5:
				exitProgram();
				break;
			}
		}
	}

	// Program의 Bottom 구성
	
	public static void exitProgram() {
		System.out.println("Bye~~");
		// 정상종료
		System.exit(0);
	}
	
	private static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);

		int menu = 0;

		System.out.println("┌────────────────────────────────┐");
		System.out.println("│      성적관리 Main Menu          │");
		System.out.println("└────────────────────────────────┘");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 읽기");
		System.out.println("4. 저장");
		System.out.println("5. 종료");
		System.out.print(">");
		
		menu = scan.nextInt();

		return menu;
	}
}