class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childI = 0; 
        int cookieJ = 0;

        while (childI < g.length && cookieJ < s.length) {
            if (s[cookieJ] >= g[childI]) {
                childI += 1;
            }
            cookieJ += 1;
        }
        return childI;
    }
}
