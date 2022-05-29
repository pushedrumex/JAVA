package part1.ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScanProgam {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/data.txt");
		
		// 파일 입력 스트림 : 파일의 데이터를 읽어들일 때 사용
		// 해당 파일이 없다면 오류
		FileInputStream srcFis = new FileInputStream(srcFile);
		
		// 스캐너 : 데이터를 읽는데 사용
		Scanner fscan = new Scanner(srcFis);
		
		// next : 공백으로 구분된 문자열
		// nextLine : 한 줄(문자열)
		// nextInt : 공백으로 구분된 정수
		String line = fscan.nextLine();
		System.out.println(line);
		
		fscan.close();
		srcFis.close();
	}

}
