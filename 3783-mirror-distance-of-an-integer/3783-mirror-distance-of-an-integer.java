class Solution {
    public int mirrorDistance(int num) {
        long reversed = 0;
        int original = num;

        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }

        return (int) Math.abs(original - reversed);
    }
}