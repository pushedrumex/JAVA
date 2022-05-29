package part1.ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class array {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		int count = 0;
		
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			while (fscan.hasNext()) {
				fscan.next(); // 한번 scan한 것은 재활용 불가
				count++;
			}
			
			fscan.close();
			srcFis.close();
		}
		
		int[] nums = new int[count];
		
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
			for (int i = 0;count>i;i++)
				nums[i] = Integer.parseInt(fscan.next());
			
			fscan.close();
			srcFis.close();
		}
		
		for (int i=0;i<count;i++)
			System.out.printf("%d ",nums[i]);
		
		System.out.println("\n------------------------------------------");
		
		int index = -1;
		{	
			int num;
			
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("검색할 숫자를 입력하세요:");
				num = scan.nextInt();
				scan.close();
			}
			
			for(int i=0;count>i;i++) {
				if (nums[i] == num){
					index = i;
					break;
				}
			}
		}
		System.out.println("index: " + index);
			
		int temp;
		
		// 버블정렬
		// 가장 큰 수를 맨 오른쪽으로 보내는 과정 반복
		for(int k=0;count-1>k;k++)
			for(int i=0;count-1-k>i;i++) {
				if (nums[i+1]<nums[i]) {
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
				
				Thread.sleep(1000/4); // main 스레드를 0.25초동안 일시중
				
				for (int j=0;count>j;j++)
					System.out.printf("%d ",nums[j]);
				System.out.println();
			}
		
		double mid;
		if(count%2!=0)
			mid = nums[count/2-1];
		else
			mid = (nums[count/2]+nums[count/2-1])/2.0;
		System.out.println("중간값 : " + mid);
		

	}

}
