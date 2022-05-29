package part2.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class KorExam {
	
	public static int count() throws IOException {
		
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
	
	public static int total() throws IOException {
		
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
}