
class LC_191 {
    public int hammingWeight(int n) {
        int re=0;
        while(n>0){
            int b=n%2;
            if(b==1)
                re++;
            n=n/2;
        }
        return re;
    }
}