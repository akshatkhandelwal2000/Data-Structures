class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        // TC : O(M*N) // SC : O(1)
        // int m = flowers.length;
        // int n = people.length;
        // int [] ans = new int[n];
        // int in = 0;
        // for(int i = 0;  i < n; i++) {
        //     int count = 0;
        //     for(int j = 0; j < m; j++) {
        //         int start = flowers[j][0];
        //         int end = flowers[j][1];
        //         if(people[i] >= start && people[i] <= end) {
        //             count++;
        //         }
        //     }
        //     ans[in++] = count;
        // }
        // return ans;
        // TC : O(M+N) * log(N) // SC : O(M)
        int m = flowers.length;
        int n = people.length;
        int[] ans = new int[n];
        int[] startTime = new int[m];
        int[] endTime = new int[m];
        for(int i = 0; i < m; i++) {
            startTime[i] = flowers[i][0];
            endTime[i] = flowers[i][1]; 
        } 
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        for(int i = 0; i < n; i++) {
            int flowerStarted = upperBound(startTime, people[i]); // upperBound just greater than cur no.
            int flowerEnded = lowerBound(endTime, people[i]); // LowerBound greater than equal to cur no.
            ans[i] = flowerStarted - flowerEnded;
        }
        return ans;
    }
    public int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > target) {
                result = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            } 
        }
        return result == -1 ? arr.length : result;
    } 
    public int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] < target) {
                start = mid+1;
            }
            else {
                result = mid;
                end = mid-1;;
            } 
        }
        return result == -1 ? arr.length : result;
}
}