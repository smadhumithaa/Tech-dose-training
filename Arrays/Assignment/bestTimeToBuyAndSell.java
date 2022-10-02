class Solution {
    public int maxProfit(int[] shareValue) {
        int max = 0;
        int buyIdx = 0;
        int sellIdx = 0;
        for (int i = 0; i < shareValue.length; i++) {
            if (shareValue[buyIdx] > shareValue[sellIdx]) {
                buyIdx = i;
                sellIdx = i;
            } else {
                if (max < (shareValue[sellIdx] - shareValue[buyIdx])) {
                    max = shareValue[sellIdx] - shareValue[buyIdx];
                }
            }
            sellIdx++;
        }
        return max;
    }
}
