class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(Character c: s.toCharArray()){
            if(c==')'||c==']'||c=='}'){
                if(st.isEmpty()) return false;
                else{
                    if(st.peek()=='[' && c==']') st.pop();
                    else if(st.peek()=='{' && c=='}') st.pop();
                    else if(st.peek()=='(' && c==')') st.pop();
                    else return false;                    
                }
            }
            else{
                st.push(c);
            }
        }
        
        return st.isEmpty();
    }
}