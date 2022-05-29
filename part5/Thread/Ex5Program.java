package part5.Thread;

// 보조스레드가 아직 안 끝났는데, 메인스레드는 끝날 수 있음
public class Ex5Program {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		th.setName("Main");
		
		Runnable subMain = new Runnable() {
			@Override
			public void run() {
				System.out.printf("%s : %s\n",th.getName(), th.getState());
				print(); // 메인 스레드
				System.out.printf("%s : %s\n",th.getName(), th.getState());
			}
		};
		
		Thread th1 = new Thread(subMain);
		th1.setName("sub1");
		
		System.out.printf("%s : %s\n",th1.getName(), th1.getState());
		th1.start();
		print();
		if (th1.isAlive()) { // 서브 스레드가 아직 진행 중이라면
			try {
				th1.join(); //  main 스레드야, 보조스레드 작업이 끝날 때까지 기다려
				// th1.join(2000); // 2초만 기다려
	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 보조스레드도 종료된 후에 실행됨
		System.out.println("====== Main Exit ======");
	}
	
	private static void print() {
		Thread th = Thread.currentThread();
		
		for(int i=0;i<100;i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (th.getName() == "Main") 
				System.out.printf("<%s[%d] : %d>\n",th.getName(),th.getId(),i+1);
			else
				System.out.printf("%s[%d] : %d\n",th.getName(),th.getId(),i+1);
		}
	}
}