
public class CompileTimeException {
    public static void main(String[] args) {
        Thread t=new Thread(() ->{
            try {
                System.out.println("Thread sleep");
                Thread.sleep(1000);
                System.out.println("Thread awake");
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        });
        t.start();
        try{
            Thread.sleep(4000);
            System.out.println("Main method thread");
        }
        catch(Exception e){
            System.out.println("Not t");
        }
        t.interrupt();
    }
}