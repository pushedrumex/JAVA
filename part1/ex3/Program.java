package part1.ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		// 입력
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		
		// 출력
		File copyFile = new File("res/data-copy.txt");
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		int x;
		boolean done = false;
		
		while (!done) { // 무한루프
			
			// 1바이트 문자를 읽음(마지막은 -1 반환)
			x = srcFis.read();
			
			if (x == -1) {
				break;
			}
			
			// 1바이트 문자를 출력, 아스키코드에 해당하는 문자
			copyFos.write(x);
		}
		copyFos.write(65);
		srcFis.close();
		copyFos.close();
	}
}
