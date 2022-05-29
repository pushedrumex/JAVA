package part1.ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {

	public static void main(String[] args) throws IOException {
		
		// 파일을 불러오기 위한 File객체 
		// 해당 경로에 파일이 없다면 생성
		// 해당 경로가 없다면 오류
		File file = new File("/Users/minjuki2/eclipse-workspace/JavaPrj/data.txt");
		
		// 파일 출력 스트림 : 사용자가 쓴 글을 해당 파일에 저장
		FileOutputStream fos = new FileOutputStream(file);
		
		// 출력스트림 : 사용자가 글을 쓰는 곳
		PrintStream fout = new PrintStream(fos);
		
		// 입력한 문자열이 파일에 저장
		fout.print("ccc"+7);
		fout.println("ccc"+7); // 개행포함
		
		// 입출력 객체는 오류를 방지하기위해 항상 닫아줘야함
		fout.close();
		fos.close();
		
		System.out.println("작업종료");
	}

}