class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet checking = new HashSet();
        for(int i = 0 ; i < nums.length ; i++){
        if(checking.contains(nums[i])){
            return true ; 
        }    
            else {
                checking.add(nums[i]);
            }
        }
     return false;   
    }
}