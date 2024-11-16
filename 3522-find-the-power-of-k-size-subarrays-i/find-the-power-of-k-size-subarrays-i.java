

class Solution {
    public int[] resultsArray(int[] array, int subarraySize) {
        List<Integer> powerResults = new ArrayList<>();
        int arrayLength = array.length;
        
        for (int startIndex = 0; startIndex <= arrayLength - subarraySize; startIndex++) {
            int[] currentSubarray = new int[subarraySize];
            System.arraycopy(array, startIndex, currentSubarray, 0, subarraySize);
            
            if (isSortedAndConsecutive(currentSubarray)) {
                int maxElementInSubarray = findMaximum(currentSubarray);
                powerResults.add(maxElementInSubarray);
            } else {
                powerResults.add(-1);
            }
        }
        
        return powerResults.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isSortedAndConsecutive(int[] subarray) {
        for (int index = 1; index < subarray.length; index++) {
            if (subarray[index] != subarray[index - 1] + 1) {
                return false;
            }
        }
        return true;
    }
    
    private int findMaximum(int[] array) {
        int maximum = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > maximum) {
                maximum = array[index];
            }
        }
        return maximum;
    }
}