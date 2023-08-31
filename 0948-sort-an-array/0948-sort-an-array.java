class Solution {
    public int[] sortArray(int[] nums) {
        // TC : O(NlogN) tc will always be O(NlogN) // SC : O(N)
        if(nums.length == 1) return nums;
        int low = 0;
        int high = nums.length-1;
        mergesort(nums, low, high);
        return nums;
    }
    void mergesort(int[] nums, int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low) / 2;
        mergesort(nums, low, mid);
        mergesort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    void merge(int[] nums, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid+1;
    while(left <= mid && right <= high) {
        if(nums[left] <= nums[right]) {
            temp.add(nums[left]);
            left++;
        }
        else {
            temp.add(nums[right]);
            right++;
        }
    }
        while(left <= mid) {
            temp.add(nums[left]);
            left++;
        } 
        while(right <= high) {
            temp.add(nums[right]);
            right++;
        }
        for(int i = low; i <= high; i++) {
            nums[i] = temp.get(i-low);
        }
    }
}
//     class Solution {
//     public int[] sortArray(int[] nums) {
//         // TC : O(NlogN) tc can go up to N^2 in the worst case // SC : O(N) for recursion stack
//            qs(nums, 0, nums.length-1);
//            return nums;
//     }
//     void qs(int[] nums, int low, int high) {
//         if(low < high) {
//             int pindex = partition(nums, low, high);
//             qs(nums, low, pindex-1);
//             qs(nums, pindex+1, high); 
//         }
//     }
//     int partition(int[] nums, int low, int high) {
//         int pivot = nums[low];
//         int i = low;
//         int j = high;
//         while(i < j) {
//             while(nums[i] <= pivot && i <= high-1) {
//                 i++;
//             }
//             while(nums[j] > pivot && j >= low+1) {
//                 j--;
//             }
//             if(i < j) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//             }
//         }
//     int temp2 = nums[low];
//     nums[low] = nums[j];
//     nums[j] = temp2;
//     return j;
// }
// }
// class Solution {
//      public int[] sortArray(int[] nums) {
//          // TC : O(N^2) // SC : O(1) 
//          for(int i = 0; i < nums.length; i++) {
//              for(int j = 0; j < nums.length-i-1; j++) {
//                  if(nums[j] > nums[j+1]) {
//                      int temp = nums[j];
//                      nums[j] = nums[j+1];
//                      nums[j+1] = temp;
//                  }
//              }
//          }
//          return nums;
//      }
// }