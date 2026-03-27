    
class LC_344 {
    public void reverseString(char[] s) {
        int len=s.length;
        int fr,re;
        char temp;
        for(fr=0,re=len-1;fr<re;fr++,re--){
            temp=s[fr];
            s[fr]=s[re];
            s[re]=temp;
        }
    }
}