public class sqsortarr {
    public static void main(String[] args) {
        Solution so = new Solution();
        int []nums = {-4,-1,0,3,10};
        int i;
        for(i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int [] arr= so.sortedSquares(nums);
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
class Solution{
    public int[] sortedSquares(int[] nums){
        int len = nums.length;
        int res[] = new int[len];
        int i,curr=0,left,right;
        for(i=0;i<len;i++){
            if(i==len-1){
                i++;
                break;
            }
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i!=len){
            res[curr]=nums[i];
            curr++;
        }
        left=i-1;
        right=i+1;
        while(left>-1 || right<len){
            if(left<0){
                res[curr]=nums[right];
                right++;
                curr++;
                continue;
            }
            if(right>len-1){
                res[curr]=nums[left];
                left--;
                curr++;
                continue;
            }
            if(nums[left]<nums[right]){
                res[curr]=nums[left];
                left--;
                curr++;
            }
            else{
                res[curr]=nums[right];
                right++;
                curr++;
            }

        }
        return res;
    }
}
