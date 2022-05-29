package part1.ex7.marray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		{
			int[] lottos = new int[3*6];
		
			File srcFile = new File("res/ex7/lotto.data");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			for (int i=0;i<18 && fscan.hasNext();i++) {
				String temp = fscan.next();
				int num = Integer.parseInt(temp);
				lottos[i] = num;
			}
			fscan.close();
			srcFis.close();
		}
		
		{
			int[][] lottos = new int[3][6];
			// 다차원 배열
			// new int[3][]	: 각각의 행의 길이가 다를 수 있음(톱니형 배열)
			// 행의 길이를 7개로 해도 가능(가변적)
			// 단, 행의 개수는 3개를 넘어가면 안 됨
			
			File srcFile = new File("res/ex7/lotto.data");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			for (int j=0;j<3 && fscan.hasNext();j++) {
				for (int i=0;i<6 && fscan.hasNext();i++) {
					String temp = fscan.next();
					int num = Integer.parseInt(temp);
					lottos[j][i] = num;
				}
			}
			
			fscan.close();
			srcFis.close();
			
			int[] lotto = {1,2,3,4,5,6};
			
			// 바꿔치기 가능(길이 상관X)
			lottos[2] = lotto;
			
			for (int j=0;j<3;j++) {
				System.out.printf("%d번 ",j+1);
				for (int i=0;i<6;i++)
					System.out.printf("%d ",lottos[j][i]);
				System.out.println();
			}
			//--------------------------------------
				int[] temp = lottos[0];
				lottos[0] = lottos[2];
				lottos[2] = temp;
			//--------------------------------------
			
			System.out.println("-------바뀐 후 배열-------");
			
				for (int j=0;j<3;j++) {
					System.out.printf("%d번 ",j+1);
					for (int i=0;i<6;i++)
						System.out.printf("%d ",lottos[j][i]);
					System.out.println();
				}
			}
		}
}

