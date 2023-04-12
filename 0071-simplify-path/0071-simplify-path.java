class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String ans = "";
        
        String curr = "";
        path += "/";
        
        for(char c: path.toCharArray()){
            if(c=='/'){
                if(curr.equals("..")) {
                    if(!st.isEmpty()) st.pop();
                }
                else if(!curr.equals("") && !curr.equals(".")){
                    st.push(curr);
                }
                curr = "";
            }
            else{
                curr += c;
            }
        }
        
        for(String str: st) ans += "/"+str;
        if(ans.length() == 0) return "/";
        return ans;
    }
}