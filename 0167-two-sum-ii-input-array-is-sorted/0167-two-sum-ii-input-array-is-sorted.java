class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // TC : O(N^2) // SC : O(1)
        // for(int i = 0; i < numbers.length; i++) {
        //     for(int j = i+1; j < numbers.length; j++) {
        //         if(numbers[i] + numbers[j] == target && i < j) {
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }
        // return null;
        // TC : O(N) // SC : O(1)
        int i = 0, j = numbers.length-1;
        while(i < j) {
            if(numbers[i] + numbers[j] < target) i++;
            else if(numbers[i] + numbers[j] > target) j--;
            else return new int[]{i+1, j+1};
        }
        return null;
    }
}