//import java.util.*;
class simple {
    public static void main(String[] args) {
        //int num[] = {0,1,2,2,3,0,4,2};
        //int val =2;
        int num [] ={3,2,2,3}; 
        int val=3;

        int count = arrayFunction(num,val);
    }
    static int arrayFunction(int []nums,int val){
        int left=0,right,count=0,size,i=0;
        size= nums.length;
        right =size-1;
        //System.out.println("Fisrt check");
        for(i=0;i<size;i++){
            if(nums[i]==val)
            {
                count++;
            }
        }
        while(left<right){
            //System.out.println("Second check");
            if(nums[left]==val){
                //System.out.println("Third check");
                while(left<right){
                    //System.out.println("Fourth check");
                    if(nums[right]!=val){
                        break;
                    }
                    else{
                        right--;
                        if(left<right)
                        count++;
                    }
                    i++;
                    //System.out.println(right +" "+count+" "+i);
                    //System.out.println("fifth check");
                }
                //System.out.println("sixth check");
                //System.out.println(right +" "+count+" "+i);
                 if(left<right){
                    nums[left]=nums[right];
                    nums[right]=val;
                    //left++;
                    count++;
                    //continue;
                }
                else{
                    break;
                }
            }
            left++;
            //System.out.println(size+"   "+count);
            //for(int i=0;i<(size-count);i++)
            //System.out.print("   "+nums[i]);
            //System.out.println();
        }
        //System.out.println("Final  "+size+"   "+count);
        for(int j=0;j<size;j++)
        System.out.print(nums[j]);
        return size-count;
    }
}