class Bank{
    int bal=2000;
    synchronized void deposit(int amt){
        bal+=amt;
    }
    synchronized void withdraw(int amt){
        if(bal>=amt){
            bal-=amt;
            System.out.println("withdraw successful\n curr bal: "+bal);
        }
        else{
            System.out.println("insufficent bal");
        }
    }
}
class BankThread{
    Bank bank;
    BankThread(Bank bank){
        this.bank = bank;
    }
    public void run(){
        bank.deposit(100);
        bank.withdraw(800);
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Bank b=new Bank();
        BankThread t1 = new BankThread(b);
        BankThread t2 = new BankThread(b);
        System.out.println("t1");
        t1.run();
        System.out.println("t2");
        t2.run();
    }
}