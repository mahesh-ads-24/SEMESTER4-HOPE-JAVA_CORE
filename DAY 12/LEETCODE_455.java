/*class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int count=0;
        for(int i=0;i<n && i<m;i++)
        {
            if(g[i]>s[i])
            {
                count+=1;
            }
        }
        return count;
    }
}*/
import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; 
        int j = 0; 
        while(i < g.length && j < s.length) {
            if(s[j] >= g[i]) {
                i++;
            }
            j++;
        }

        return i;
    }
}