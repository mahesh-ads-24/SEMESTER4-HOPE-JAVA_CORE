import java.util.Scanner;
public class K_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            int spaces;
            if(i<=n/2)
                spaces=n-2-i;
            else
                spaces=i-1;
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(n-1-i));
        }
    }
}