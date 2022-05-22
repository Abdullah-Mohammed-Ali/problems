/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 0;
        int last = n ;
      int mid = 0 ;
        while(first <= last){
            mid = first + (last-first)/ 2 ;
             if(isBadVersion(mid) && isBadVersion(mid - 1) == false) return mid;
             else if(isBadVersion(mid) == false && isBadVersion(mid + 1))return mid + 1  ;
             else if(isBadVersion(mid)) last = mid - 1 ;
             else if(!isBadVersion(mid))first =  mid + 1 ;
        }
        return mid ; 
    }
    
    
   
}