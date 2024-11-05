import java.util.ArrayList;
import java.util.Collections;

class MedianFinder {

    private ArrayList<Integer> arr;

    public MedianFinder() {
        arr = new ArrayList<>();
    }

    public void addNum(int num) {
        int beg = 0;
        int end = arr.size();
        while (beg < end) {
            int mid = (end + beg) / 2;
            if (arr.get(mid) > num) {
                end = mid;
            } else {
                beg = mid + 1;
            }
        }
        arr.add(beg, num);
    }

    public double findMedian() {
        int n = arr.size();
        if (n % 2 == 1) {
            return arr.get(n / 2);
        } else {
            return (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0;
        }
    }}