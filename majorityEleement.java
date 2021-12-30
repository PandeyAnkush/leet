//using moore's voting algo

public class majorityEleement {
    public static void main(String[] args) {
        int []num = {3,2,3};
        Solution sol = new Solution();
        System.out.println(num[sol.majIndex(num)]);
    }
}
class Solution {
    int majIndex(int [] nums){
        int len=nums.length;
        int i=0,maj_index=0,count=1;
        while(i<len){
            if(nums[i]==nums[maj_index]){
                count++;
            }
            else {
                count--;
                if(count==0){
                    maj_index=i;
                    count=1;
                }
            }
            i++;
        }
        count=0;
        for(i=0;i<len;i++){
            if(nums[i]==nums[maj_index])
                count++;
        }
        if(count>(len/2)){
            return maj_index;
        }
        else{ 
            return -1;
        }
    }
}
