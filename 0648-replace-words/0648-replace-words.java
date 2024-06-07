class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // TC : O(N^2+K) // SC : O(N+K)
        Set<String> set = new HashSet<>();
        for(String word : dictionary) {
            set.add(word);
        }
        String[] st = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : st) {
            boolean flag = false;
            for(int j = 0; j < word.length(); j++) {
                String s = word.substring(0,j+1);
                if(set.contains(s)) {
                    flag = true;
                    sb.append(s).append(" ");
                    break;
                }
            }
            if(!flag) sb.append(word).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}