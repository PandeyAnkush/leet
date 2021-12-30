public class binarySearch {
    public static void main(String[] args) {
        Solution so = new Solution();
        int []nums = {1,3,5,6};
        int val=2;
        int res=so.searchInsert(nums, val);
            System.out.print(res);
    }
}
class Solution{
    public int searchInsert(int[] nums, int target){
        int beg=0,mid=-1,end=nums.length;
        while(beg<end ||beg==end){
            mid=(beg+end)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end= mid-1;
            }
            else{
                beg=mid+1;
            }
        }
        return mid;
    }
}
