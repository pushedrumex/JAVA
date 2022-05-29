package part2.ex3.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam {
	
	// 생성자가 없다면 자동으로 0으로 초기화
	private int kor; // 외부에서 접근하지 못하도록 private
	private int eng;
	private int math;
	
	// 생성자
	public Exam() {
		this(1,1,1); // 오버로드된 생성자 호출 
					 // 첫번째 문장에 작성해야함
		}
	
	// 생성자 오버로드
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 메서드
	public void save() throws IOException {		

		File file = new File("res/data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);

		ps.printf("%d,%d,%d\n", kor, eng, math);

		ps.close();
		fos.close();
	}
	
	// 메서드
	public void load() throws IOException {

		File file = new File("res/data.txt");		
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);

		String[] tmps = scan.nextLine().split(",");

		scan.close();
		fis.close();

		kor = Integer.parseInt(tmps[0]);
		eng = Integer.parseInt(tmps[1]);
		math = Integer.parseInt(tmps[2]);

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
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		// 객체변수와 같은 이름의 지역변수가 있다면 this해줘야함
		int total = kor + eng + math;
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f\n", (total / 3.0));
	}
	
	// 함수
	public static void input(Exam exam) {
		
		// static 메서드에서는 this를 쓸 수 없음
		// static은 객체를 통해 호출되는 함수가 아님
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.println("국어 >");
		exam.kor = scan.nextInt();
		System.out.println("영어 >");
		exam.eng = scan.nextInt();
		System.out.println("수학 >");
		exam.math = scan.nextInt();
		
	}
}