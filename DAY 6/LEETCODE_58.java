
class LC_58 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len =s.length();
        char[] ar=s.toCharArray();
        int c=0;  
        for(int i=len-1;i>=0;i--){
            if(ar[i]!=' ')
                c++;
            else if(c>0)
                break;
        }
        return c;
        
    }
}
