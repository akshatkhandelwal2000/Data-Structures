class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // TC : O(NlogN) // SC : O(1)
        int n = people.length;
        Arrays.sort(people);
        int i = 0;
        int  j = n-1;
        int ans = 0;
        while(i <= j) {
            if(i < j && people[i] + people[j] <= limit) {
                j--;
                i++;
                ans++;
            }
            else {
                j--;
                ans++;
            } 
        }
        return ans;
    }
}