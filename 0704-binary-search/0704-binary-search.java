class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h=nums.length-1;
        while(l<=h){
            int m = (l+h)/2;
            
            if(nums[m] == target) return m;
            else if(nums[m]<target) l = m+1;
            else h = m-1;
        }
        
        return -1;
    }
}