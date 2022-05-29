package part1.ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis= new FileInputStream(srcFile);
		Scanner fscan= new Scanner(srcFis);
		
		File copyFile = new File("res/data-result.txt");
		FileOutputStream copyFos= new FileOutputStream(copyFile);
		PrintStream fout = new PrintStream(copyFos);
		
		int sum = 0;
		
		// fscan에 읽을 것이 있을 때
		while(fscan.hasNext()) {
			
			// 한 단어씩
			String x_ = fscan.next();
			
			// String -> Integer -> int
			int x = Integer.parseInt(x_);
			sum += x;
		}
		fout.println(sum);
		
		fout.close();
		copyFos.close();
		
		fscan.close();
		srcFis.close();
		
		System.out.println("작업완료");
		
	}
}
