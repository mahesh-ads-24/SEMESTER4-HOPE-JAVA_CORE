import java.util.*;
public class first_non_repeating_char {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                System.out.println((char)(i+'a'));
                break;
            }
        }
    }
}