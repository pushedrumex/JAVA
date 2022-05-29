package part1.ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex4_GradeProgram {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/ex3/data-grade.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
		File copyPath = new File("res/ex3");
		
		// 디렉토리가 존재하지 않는다면
		if (!copyPath.exists())
			
		// 디렉토리 생성
			copyPath.mkdir();
		
		File resultFile = new File("res/ex3/data-regrade.txt");
		FileOutputStream resultFio = new FileOutputStream(resultFile);
		PrintStream fout = new PrintStream(resultFio);
		
		String grade;
		
		while(fscan.hasNext()) {
			grade = fscan.next();
			if (grade.equals("A+"))
				fout.print("95~100");
			else if (grade.equals("A"))
				fout.print("90~94");
			else if (grade.equals("B+"))
				fout.print("85~89");
			else if (grade.equals("B"))
				fout.print("80~84");
			else if (grade.equals("C+"))
				fout.print("75~79");
			else if (grade.equals("C"))
				fout.print("70~74");
			else if (grade.equals("D+"))
				fout.print("65~69");
			else if (grade.equals("D"))
				fout.print("60~64");
			else
				fout.print("0~59");

			if (fscan.hasNext())
				fout.print(",");
		}
		
		fout.close();
		resultFio.close();
		
		fscan.close();
		srcFis.close();	
	}
}