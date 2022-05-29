package part5.Thread;

public class Ex3Program {

	public static void main(String[] args) {
		
		// main스레드 이름 설정 디폴트 : main
		Thread th = Thread.currentThread();
		th.setName("Main");
		
		Runnable subMain = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};
		
		Thread th1 = new Thread(subMain);
		th1.setName("sub1"); // 스레드 이름 설정
		Thread th2 = new Thread(subMain);
		th2.setName("sub2");
		
		th1.start();
		th2.start();
		
		print();
	}
	
	private static void print() {
		
		// 현재 스레드 객체를 알려주는 메서드
		Thread th = Thread.currentThread();
		
		for(int i=0;i<100;i++) {
			try {
				Thread.sleep(20); // 스레드를 잠시 20ms동안 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (th.getName() == "MAIN") 
				System.out.printf("<%s[%d] : %d>\n",th.getName(),th.getId(),i+1);
			else
				System.out.printf("%s[%d] : %d\n",th.getName(),th.getId(),i+1);
		}
	}
}