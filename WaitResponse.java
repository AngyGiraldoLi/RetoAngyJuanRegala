package .util;

public class WaitResponse {
	
	private WaitResponse() {
		
	}

	public static void forAWhile() {		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Log.grabarLog(e.toString());
			Thread.currentThread().interrupt();
		}		
	}

	public static void forAWhile(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			Log.grabarLog(e.toString());
			Thread.currentThread().interrupt();
		}		
	}
}
