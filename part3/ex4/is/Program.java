package part3.ex4.is;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		NewlecExam exam = new NewlecExam(1,1,1,1);
		int total = exam.total(); // NewlecExam의 total()
		double avg = exam.avg();  // Exam의 avg()
		// exam의 total()이 호출 될 때, NewlecExam에서 재정의된 total()이 호출 됨
		// 어떤 메서드가 사용될 지는 생성된 객체에 의해 정해짐
		System.out.println(total);
		System.out.println(avg);
	}
}
