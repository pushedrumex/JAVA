package part1.ex6.struct;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		GangwonCovid19Status status = new GangwonCovid19Status();
		status.city = "춘천";
		status.date = "2022-08-12";
		status.confirmed = 2;
		
		int count = 0;
		{			
			File srcFile = new File("res/ex3/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			fscan.nextLine();

			while (fscan.hasNext()) {
				fscan.nextLine();
				count++;
			}
			fscan.close();
			srcFis.close();
				
		}
		
		// 데이터를 담을 수 있는 배열공간을 만든 것
		// 객체는 하나하나 만들어줘야 한다!! 변수만 선언하고 생성안하면 null포인터로 되어있음
		
		GangwonCovid19Status[] statuses = new GangwonCovid19Status[count];
		{
			File srcFile = new File("res/ex3/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			fscan.nextLine();
			
			for (int i = 0;i<count;i++) {
				
				// 객체 생
				statuses[i] = new GangwonCovid19Status();
				
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				
				statuses[i].city = cols[0];
				statuses[i].date = cols[1];
				statuses[i].confirmed = Integer.parseInt(cols[2]);
			}
	
			fscan.close();
			srcFis.close();
		}
	}
}