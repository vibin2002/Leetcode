/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return isbad(1,n);
    }
    
    public int isbad(int l,int r){
        if(l == r)
            return l;
        int mid = l+(r-l)/2;
        if(isBadVersion(mid) == true)
            return isbad(l,mid);
        else 
            return isbad(mid+1,r);
            
    }
    
}