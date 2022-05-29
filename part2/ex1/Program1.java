package part2.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	
	static int count() throws IOException {
		
		int result = 0;
		
		File srcFile = new File("res/ex3/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
		while (fscan.hasNext()) {
			fscan.next();
			result++;
		}
		
		fscan.close();
		srcFis.close();
		return result;
	}
	
	static int total() throws IOException {
		
		int result = 0;
		
		File srcFile = new File("res/ex3/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan1 = new Scanner(srcFis);

		while (fscan1.hasNext()) {
			String x_ = fscan1.next();
			int x = Integer.parseInt(x_);
			result += x;
		}
		
		fscan1.close();
		srcFis.close();
		return result;
	}
	
	// 기본함수
	static void printCount() {	
		printCount(0);
	}
	
	// 메서드 오버로딩 (매개변수가 적재된 것이 더 많은 함수)
	static void printCount(int count) {
		
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│               Count             │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("Count is %d\n", count);
	}
	
	public static void main(String[] args) throws IOException {

		김지원: while (true) {
			int menu = inputMenu();

//			do {
//				System.out.println("┌─────────────────────────────────┐");
//				System.out.println("│             Main Menu           │");
//				System.out.println("└─────────────────────────────────┘");
//				System.out.println("1. count");
//				System.out.println("2. total");
//				System.out.println("3. avg");
//				System.out.println("4. exit");
//				System.out.print(">");
//	
//				menu = scan.nextInt();
//				
//				if(menu > 4)
//					System.out.println("메뉴를 잘못 입력하셨습니다.");
//
//			}while(menu > 4);

			switch (menu) {
			case 1:
				printCount(count());
//				printCount();
				break;
				
			case 2:{
				int total = total();
				printTotal(total);
				
//				System.out.println("┌─────────────────────────────────┐");
//				System.out.println("│               Total             │");
//				System.out.println("└─────────────────────────────────┘");
//				System.out.printf("Total is %d\n", total);
			}
				break;

			case 3:{
				// --- <<avg 계산하기 >> -----------------------------------------------
				int count = count();
				// --------------------------------------
				int total = total();
				// -----------------------------------------------
				double avg = total / (double) count;
				printAvg(avg);
//				System.out.println("┌─────────────────────────────────┐");
//				System.out.println("│              Average            │");
//				System.out.println("└─────────────────────────────────┘");
//				System.out.printf("Average is %.2f\n", avg);
				break;
			}

			case 4:
				System.out.println("Bye~~");
				// 해당 라벨이 있는 반복문을 빠져나감
				break 김지원;
			}
		}
//			default:
//				System.out.println("메뉴를 잘못 입력하셨습니다.");
		System.out.println("작업완료");
	}
	static int inputMenu() {
		int menu;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│             Main Menu           │");
			System.out.println("└─────────────────────────────────┘");
			System.out.println("1. count");
			System.out.println("2. total");
			System.out.println("3. avg");
			System.out.println("4. exit");
			System.out.print(">");

			menu = scan.nextInt();
		
			if(menu > 4)
				System.out.println("메뉴를 잘못 입력하셨습니다.");

			}while(menu > 4);
		return menu;
	}

	static void printAvg(double avg) {
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│              Average            │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("Average is %.2f\n", avg);
		
	}

	static void printTotal(int total) {
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│               Total             │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("Total is %d\n", total);
	}
}