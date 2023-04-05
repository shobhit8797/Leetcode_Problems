class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> h = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            h.put(ch, h.getOrDefault(ch, 0)+1);
        }
        
        for(int i=0; i<s.length(); i++){
            if(h.get(s.charAt(i)) == 1) return i;
        }
            
            
        return -1;
    }
}