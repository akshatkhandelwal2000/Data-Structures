class Solution {
    public List<List<String>> partition(String s) {
        // TC : O(N*2^N) // SC : O(N)
        List<List<String>> list = new ArrayList<>();
        List<String> path = new ArrayList<>();
        rec(0, s, path, list);
        return list;
    }
    public void rec(int index, String s, List<String> path, List<List<String>> list) {
        if(index == s.length()) {
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                path.add(s.substring(index, i+1));
                rec(i+1, s, path, list);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int i, int j) {
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}