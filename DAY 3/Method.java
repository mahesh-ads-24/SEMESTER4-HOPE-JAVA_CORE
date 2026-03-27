
import java.util.*;
public class Method {
    public int mul(int a,int b){
        return a*b;
    }
    public void print(int a){
        System.out.print(sq(a));
    }
    public int sq(int a){
        return mul(a,a);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Method m=new Method();
        int a=sc.nextInt();
        m.print(a);
        sc.close();
    }
}