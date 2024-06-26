class Solution {
    public int compareVersion(String version1, String version2) {
        // TC : O(MaxLen(version1, version2)) // SC : O(1)
        int s1 = version1.length();
        int s2 = version2.length();
        int i = 0;
        int j = 0;
        while(i < s1 || j < s2) {
            int temp1 = 0;
            int temp2 = 0;
            while(i < s1 && version1.charAt(i) != '.') {
                temp1 = (temp1 * 10 + (version1.charAt(i++)-'0'));
            }
            while(j < s2 && version2.charAt(j) != '.') {
                temp2 = (temp2 * 10 + (version2.charAt(j++)-'0')); 
            }
            if(temp1 < temp2) return -1;
            else if(temp1 > temp2) return 1;
            else {
                i++;
                j++;
            }
        }
        return 0;
    }
}