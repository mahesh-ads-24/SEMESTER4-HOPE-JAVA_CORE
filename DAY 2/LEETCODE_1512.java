

class LC_1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        for (int a : nums) {
            freq[a]++;
        }
        int res = 0;
        for (int f : freq) {
            if (f > 1) {
                res += (f * (f - 1)) / 2;
            }
        }
        return res;
    }
}