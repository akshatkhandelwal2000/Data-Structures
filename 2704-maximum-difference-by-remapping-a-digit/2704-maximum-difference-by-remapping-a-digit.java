class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int in = -1;
        int v = -1;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != '9') {
                in = i;
                v = s.charAt(i)-48;
                break;
            }
        }
        if(in == -1) return num;
        String max = "";
        for(int i = 0; i < in; i++) {
            max += (char)(s.charAt(i));
        }
        for(int i = in; i < n; i++) {
            if(s.charAt(i)-48 == v) {
                max += '9';
            }
            else max += (char)(s.charAt(i));
        }
        int v2 = s.charAt(0)-48;
        String min = "";
        min += '0';
        for(int i = 1; i < n; i++) {
            if(s.charAt(i)-48 == v2) {
                min += '0';
            }
            else min += (char)(s.charAt(i));
        }
        return Integer.valueOf(max)-Integer.valueOf(min);
    }
}