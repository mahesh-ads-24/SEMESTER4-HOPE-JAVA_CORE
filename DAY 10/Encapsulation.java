/*Encapsulation:
    ->Binding data and method that use the data in the class
    -> Controlling the access of the data

1.declaring private data members(data +method)
2.public methods called getters and setters

*/

import java.util.Scanner;

class BankAccount{
    private  double balance; //it can not be accessed outside the class directly
    public void SetBalance(double balance){ //setters
            if(balance>0){
                this.balance=balance;
            }
            else{
                System.out.println("Invalid balance");
            }
    }
    public double GetBalance(){
        return balance;
    }    
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn:"+amount);
        }
        else{
            System.out.println("Invalid amount or insufficient balance");
        }
    }  
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                             
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount b=new BankAccount();
        System.out.println("Enter initial balance:");
        b.SetBalance(sc.nextDouble());
        b.withdraw(sc.nextDouble());
        b.deposit(sc.nextDouble());
        System.out.println("Balance:"+b.GetBalance());
        sc.close();
    }
}