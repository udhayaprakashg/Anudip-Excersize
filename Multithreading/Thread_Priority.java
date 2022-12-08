package Thread;

class Thread_Priority {
	public static void main(String[] args) {
	
	Runnable a = new Runnable() {
        public void run(){ //run() method override from Runnable interface
            for(int i=0;i<=5;i++){
                System.out.println("Udhaya is comming........."+i);
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }}};
     
     Thread t1 = new Thread(a);
     
     t1.setName("Udhaya setName"); //We can set the name for thread
     System.out.println(t1.getName());//Using get thread name using get method
     
     t1.setPriority(Thread.MAX_PRIORITY);
     System.out.println(t1.getPriority());
     
     t1.start();
    
     
	}
}
