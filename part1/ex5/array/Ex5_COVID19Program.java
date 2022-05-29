package part1.ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex5_COVID19Program {

	public static void main(String[] args) throws IOException {
		
		int count = 0;
		{
			File srcFile = new File("res/ex3/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			fscan.nextLine(); // 타이틀 패쓰~
			
			// 몇 줄인지
			while (fscan.hasNext()) {
				fscan.nextLine();
				count++;
			}
			
			fscan.close();
			srcFis.close();
		}
		
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		
		{
			File srcFile = new File("res/ex3/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			fscan.nextLine();
			
			for (int i = 0;i<count;i++) {
				String line = fscan.nextLine();
				
				// ","으로 구분해서 배열로 저장
				String[] cols = line.split(",");
				
				cities[i] = cols[0];
				dates[i] = cols[1];
				confirmeds[i] = Integer.parseInt(cols[2]);
			}
			fscan.close();
			srcFis.close();
		}
		
		String city;
		Scanner scan = new Scanner(System.in);
		city = scan.nextLine();
		
		for(int i=0;count>i;i++)
			if(cities[i].equals(city))
				System.out.println(cities[i] + " " + dates[i] + " " + confirmeds[i]);
	}
}