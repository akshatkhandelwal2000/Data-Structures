class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int k = 0;
        while(i < n) {
            int count = 1;
            char c = chars[i];
            i++;
            while(i < n && chars[i] == c) {
                count++;
                i++;
            }
            if(count == 1) {
                chars[k] = c;
                k++;
            }
            else {
                chars[k] = c;
                k++;
                String size = String.valueOf(count);
                for(int j = 0; j < size.length(); j++) {
                    chars[k] = size.charAt(j);
                    k++;
                }
            }
        }
        return k;
    }
}