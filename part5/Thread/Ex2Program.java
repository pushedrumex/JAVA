package part5.Thread;

// Thread : 한 프로세스 내에서 두가지 또는 그 이상의 일을 동시에 하기 위해 상속하는 클래스

public class Ex2Program {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() { // Runnable : 서브스레드를 동작시키기 위한 인터페이스 
			
			@Override
			public void run() {
				print1();
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				print2();
			}
		});
		
		th1.start(); // 서브스레드1
		th2.start(); // 서브스레드2
		
		for(int i=0;i<100;i++) // 메인 스레드
			System.out.printf("main : %d\n",i+1);
	}

	private static void print1() {
		for(int i=0;i<100;i++)
			System.out.printf("sub1 : %d\n",i+1);
	}

	private static void print2() {
		for(int i=0;i<100;i++)
			System.out.printf("sub2 : %d\n",i+1);
	}

}
