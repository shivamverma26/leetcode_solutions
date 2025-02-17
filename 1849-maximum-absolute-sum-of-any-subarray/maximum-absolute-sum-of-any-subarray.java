class Solution {
	public int maxAbsoluteSum(int[] arr) {
		int[] temp1 = arr.clone();
		int[] temp2 = arr.clone();

		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = -1 * temp2[i];
		}
		int max1 = Integer.MIN_VALUE;
		int sum1 = 0;
		for (int i = 0; i < temp1.length; i++) {
			sum1 += temp1[i];
			if (sum1 > max1) {
				max1 = sum1;
			}
            if(sum1<0)
            {
                sum1 = 0;
            }
            
			
		}
		int max2 = Integer.MIN_VALUE;
		int sum2 = 0;
		for (int i = 0; i < temp2.length; i++) {
			sum2 += temp2[i];
			if (sum2 > max2) {
				max2 = sum2;
			}
            if(sum2<0)
             {
                sum2 = 0;
            }
			
		}
		return Math.max(max1, max2);
	}
}