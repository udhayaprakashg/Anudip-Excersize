package Thread;

class A extends Thread{ //Thread is inbuilt class so we can extend this
    //Thread class contains run() and Start() method

    //static void plan() throws InterruptedException {
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Udhaya is comming........."+i);
            try {
                Thread.sleep(2000);
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
class Thread_class{
    public static void main(String[] args) throws InterruptedException { //Main is single thread
        A a = new A();
        B b = new B();

       // a.plan(); //First plan is running
       // b.plan2(); //Second plan2 is running

        a.start();//Both run simultaneously
        b.start();

        if(a.isAlive()){//Used to check whether thread is running
            System.out.println("Class A is running now------------");
        }
        if(b.isAlive()){
            System.out.println("Class B is running now----------------");
        }
        
        a.join(); //Using Join to print the main at last after running thread method
        b.join();
        System.out.println("Udhaya and Prakash is here");
    }
}
