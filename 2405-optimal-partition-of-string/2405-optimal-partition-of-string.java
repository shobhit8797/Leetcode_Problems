class Solution {
    public int partitionString(String s) {
        int count = 0;
        Set<Character> st = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.contains(ch)){
                count++;
                st.clear();
                i--;
            }
            else st.add(ch);
        }
        
        return count+1;
    }
}