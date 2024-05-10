class Solution {
    public int splitNum(int num) {
        // TC : O(1) // SC : O(1)
        String s = Integer.toString(num);
        int n = s.length();
        int[] arr = new int[n];
        int in = 0;
        while(num != 0) {
            arr[in++] = num%10;
            num = num/10;
        }
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                num1 = num1 * 10 + arr[i]; 
            }
            else {
                num2 = num2 * 10 + arr[i];
            }
        }
        return num1+num2;
    }
}