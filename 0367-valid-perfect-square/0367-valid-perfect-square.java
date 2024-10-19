class Solution {
    public boolean isPerfectSquare(int num) {
        // for(int i = 1 ; i * i <= num ; i++) {
        //     if(num % i == 0 && num / i == i) {
        //         return true;
        //     }
        // }
        // return false;
        // long start = 1;
        // long end = num;
        // while(start <= num) {
        //     long mid = (start + end) / 2;
        //     if(mid * mid == num) {
        //         return true;
        //     }
        //     if(mid * mid < num) {
        //         start = mid + 1;
        //     }
        //     else {
        //         end = mid - 1;
        //     }
        // }
        // return false;
        if(num <= 1) {
            return true;
        }
        int left = 1;
        int right = num;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(num / mid > mid) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left * left == num;
    }
}