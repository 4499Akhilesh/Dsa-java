public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int ans = n;
        while (left < ans){
            int mid = left + (ans - left) / 2;
           if (isBadVersion(mid)){
            ans = mid;

           } else {
            left = mid + 1;
           }
        }
        return left;
    }
}
