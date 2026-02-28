class Solution {
    public int concatenatedBinary(int n) {
        final int MOD = 1_000_000_007;
        long ans = 0;
        int shift = 0;
        
        for (int i = 1; i <= n; i++) {
            // If i is a power of 2, the number of bits increases by 1
            if ((i & (i - 1)) == 0) {
                shift++;
            }
            // Shift current answer left by the required bits and add the new number
            ans = ((ans << shift) | i) % MOD;
        }
        
        return (int) ans;
    }
}
