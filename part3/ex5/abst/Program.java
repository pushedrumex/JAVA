package part3.ex5.abst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import part3.ex5.abst.entity.Exam;
import part3.ex5.abst.entity.NewlecExam;
import part3.ex5.abst.ui.ExamConsole;
import part3.ex5.abst.ui.NewlecExamConsole;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam exam = new NewlecExam();
		ExamConsole console = new NewlecExamConsole(exam);
		
		console.input();
		console.print();
	}
}
