class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1;
       return binarySearch(nums , first , last , target);
    }
 public int binarySearch (int[] nums , int first , int last,int target)
    {
        if(first <= last){
            int mid = (first + last) / 2;
            System.out.println(mid);
            if(nums[mid] == target) return mid ;
            if (nums[mid] < target) return  binarySearch(nums , mid+1,last,target);
            if (nums[mid] > target) return  binarySearch(nums , first,mid - 1,target);
        }
        return -1 ;

    }
}