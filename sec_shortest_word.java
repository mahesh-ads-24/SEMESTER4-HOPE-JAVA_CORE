
import java.util.Scanner;
/*without split */
public class sec_shortest_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        String w1 = "", w2 = "";
        String temp = "";
        for (int i = 0; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                if (temp.length() > 0) {
                    int len = temp.length();
                    if (len < min1) {
                        min2 = min1;
                        w2 = w1;
                        min1 = len;
                        w1 = temp;
                    } else if (len > min1 && len < min2) {
                        min2 = len;
                        w2 = temp;
                    }
                }
                temp = "";
            }
        }
        if (w2.equals("")) {
            System.out.println("-1");
        } else {
            System.out.println(w2);
        }
    }
}