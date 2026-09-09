class Solution {
    public long countCommas(long n) {
        long count = 0;
        for (long threshold = 1000; threshold <= n; threshold *= 1000) {
            count += (n - threshold + 1);
        }
        return count;
    }
}