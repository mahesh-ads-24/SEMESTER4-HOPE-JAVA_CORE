

class LEETCODE_121 {
    public int maxProfit(int[] prices) {
        int stock=prices[0];
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(stock>prices[i])
                stock=prices[i];
            p=Math.max(p,prices[i]-stock);
        }
        return p;
    }
}