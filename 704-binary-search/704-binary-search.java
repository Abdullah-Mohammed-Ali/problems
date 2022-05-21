class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1;
         while(first <= last){
            int mid = (first + last) / 2;
            System.out.println(mid);
            if(nums[mid] == target) return mid ;
            if (nums[mid] < target) first = mid+1;
            if (nums[mid] > target)   last = mid-1;
        }
        return -1 ;
     
    }

}