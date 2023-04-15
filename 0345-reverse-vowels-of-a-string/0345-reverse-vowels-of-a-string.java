class Solution {
    public String reverseVowels(String s) {
        Set<Character> st = new HashSet<>();
        st.add('u');
        st.add('i');
        st.add('o');
        st.add('e');
        st.add('a');
        st.add('O');
        st.add('I');
        st.add('E');
        st.add('A');
        st.add('U');
        
        
        
        char[] str = s.toCharArray();
        int i=0, j=str.length-1;
        // while(!st.contains(str[j])) j--;
        
        while(i<j){
            if(st.contains(str[i]) && st.contains(str[j])){
                char t = str[i];
                str[i] = str[j];
                str[j] = t;
                i++;
                j--;
            }
            else if(st.contains(str[i])){
                j--;
            }
            else i++;
            // while(!st.contains(str[j])) j--;
            // while(!st.contains(str[i])) i++;
        }
        
        
        return String.valueOf(str);
    }
}