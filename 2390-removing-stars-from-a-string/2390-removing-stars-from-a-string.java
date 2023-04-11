class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for(char c: s.toCharArray()){
            if(c != '*'){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return "";
                else
                    st.pop();
            }
        }
        String ans = "";
        for(Character c: st)
            ans += String.valueOf(c);
        
        return ans;
    }
}