class Solution {
    private void update(int[] bits, int x, int change) {
        for (int i = 0; i < 32; i++) {
            if (((x >> i) & 1) != 0) {
                bits[i] += change;
            }
        }
    }

    private int bitsToNum(int[] bits) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] != 0) {
                result |= 1 << i;
            }
        }
        return result;
    }

    private boolean isSpecial(int[] nums, int k, int len) {
        int n = nums.length;
        int[] bits = new int[32];
        for (int i = 0; i < n; i++) {
            update(bits, nums[i], 1); 
            if (i >= len) {
                update(bits, nums[i - len], -1); 
            }
            if (i >= len - 1 && bitsToNum(bits) >= k) {
                return true;
            }
        }
        return false;
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length, start = 1, end = n + 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (!isSpecial(nums, k, mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start != n + 1 ? start : -1;
    }
}