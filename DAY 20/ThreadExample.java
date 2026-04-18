/*
life cycle of thread()
*/
class SampleThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("thread running using Thread class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Thread is running using Runnable interface");
            Thread.sleep(6000);
            System.out.println("after sleep");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        SampleThread1 t1 = new SampleThread1();
        t1.start();
        Thread t2 = new Thread(new SampleThread2());
        t2.start();
    }
}