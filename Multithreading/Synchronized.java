package Thread;

class Table{
	 
	synchronized static void table(int n) { //synchronized
		for(int i=0; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Synchronized {

	public static void main(String[] args) {
	
		Table ta = new Table();
	
		Thread t1 = new Thread(){
		public void run() {
			ta.table(3);
		}};
		
		Thread t2 = new Thread(){
			public void run() {
				ta.table(4);
			}};
		
       t1.start();
       t2.start();
	}}
