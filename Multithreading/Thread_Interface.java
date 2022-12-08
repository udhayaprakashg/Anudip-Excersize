package Thread;
 
class A implements Runnable{
    //Thread class contains run() and Start() method but interface does not have any method it
    //has only

    //static void plan() throws InterruptedException { used for normal class
    public void run(){ //run() method override from Runnable interface
        for(int i=0;i<=5;i++){
            System.out.println("Udhaya is comming........."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Prakash is comming........."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread_Interface{
    public static void main(String[] args) throws InterruptedException { //Main is single thread
        //A a = new A(); //Normal Object declaration
        //B b = new B();

       //Runnable interface Object creation
       Runnable a = new A(); //Thread object declaration
        // A a = new A(); //Which is also work
        Thread t1 = new Thread(a);//We should create the thread object

        Runnable b = new B(); //Thread object declaration
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
        
        Runnable c = new A();
        c.run();//We can use run in both main and interface
        
        t1.join();
        t2.join();
        
        System.out.println("This is Thread Runnable interface");
    }
}
