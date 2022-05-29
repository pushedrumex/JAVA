package part3.ex6.iface.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public abstract class Exam { // 추상클래스
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(100,100,100);
		}

	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
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

	public int total() {
		return kor+eng+math;
	}

	public abstract double avg();
	// 참조형식을 exam으로 했을 때 avg()에 접근 할 수 있도록
	// 자식클래스 마다 구현해야하는 메서드의 코드가 다를 경우 추상메서드로 선언
	// 자식클래스가 반드시 구현을 해야 인스턴스를 생성할 수 있음
}