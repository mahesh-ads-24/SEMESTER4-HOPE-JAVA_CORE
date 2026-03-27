
class LC_390 {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int rem= n;
        boolean leftToRgt = true;
                while (rem > 1) {
            if (leftToRgt || rem % 2 == 1) {
                head += step;
            }            
            rem /= 2;
            step *= 2;
            leftToRgt = !leftToRgt;
        }        
        return head;
    }
}