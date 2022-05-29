package part5.Thread;

//main스레드가 끝났을 때, sub스레드도 종료 되도록

public class Ex6Program {

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		th.setName("Main");
		
		Runnable subMain = new Runnable() {
			@Override
			public void run() {
				System.out.printf("%s : %s\n",th.getName(), th.getState());
				print();
				System.out.printf("%s : %s\n",th.getName(), th.getState());
			}
		};
		
		Thread th1 = new Thread(subMain);
		th1.setName("sub1");
		
		System.out.printf("%s : %s\n",th1.getName(), th1.getState());
		th1.start();

		if (th1.isAlive()) {
			try {
				th1.join(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			th1.interrupt(); // 2초 후, th1는 interrupted 상태가 됨
		}
		System.out.println("====== Main Exit =======");
	}
	
	private static void print() {
		Thread th = Thread.currentThread();
		
		for(int i=0;i<100000;i++) {
			
			try {
				// sleep인 상태에서 interrupt()를 만나면 예외 발생
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				System.out.println("Interrupt가 날 깨웠어!");
				return;
			}
			
			if(th.isInterrupted()) { // 스레드가 Interrupted 상태라면
				System.out.println("------ Th Interrupted -----");
				return; // 종료
			}
			if (th.getName() == "MAIN") 
				System.out.printf("<%s[%d] : %d>\n",th.getName(),th.getId(),i+1);
			else
				System.out.printf("%s[%d] : %d\n",th.getName(),th.getId(),i+1);
		}
	}
}
