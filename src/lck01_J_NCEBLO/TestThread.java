package lck01_J_NCEBLO;

public class TestThread implements Runnable{
	
	private final Boolean initialized = Boolean.FALSE;

	public void run() {
		synchronized (initialized) {
			// ... 
			}
	}
	
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
