import java.util.Scanner;
/*without split() */
public class words_with_even_len {
    public static void Even(String s){
        if(s.length()%2==0){
            System.out.print(s+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        StringBuilder def=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c!=' '){
                def.append(c);
            }
            if(c==' '|| i==s.length()-1){
                if(def.length()>0)
                    Even(def.toString());
                def.setLength(0);
            }    
        }
    }
}