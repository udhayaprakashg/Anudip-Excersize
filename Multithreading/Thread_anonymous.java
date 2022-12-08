package Thread;

class Thread_anonymous {
    public static void main(String[] args) { //Main is single thread

        //Creating Anonymous threading class
       Runnable a = new Runnable() {
           public void run(){ //run() method override from Runnable interface
               for(int i=0;i<=5;i++){
                   System.out.println("Udhaya is comming........."+i);
                   try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
               }}};
        //We should create the thread object

        Runnable b = () ->{
                for(int i=0;i<=5;i++){
                    System.out.println("Prakash is comming........."+i);
                    try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}}};

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
