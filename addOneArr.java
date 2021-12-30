public class addOneArr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int []num={9,9,9};
        int []arr=sol.addOne(num);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
class Solution {
    int [] addOne(int [] digits){
        int i=0,j=0,carry=1,len,num;
        len = digits.length;
        for(i=len-1;i>-1;i--){
            num=digits[i]+carry;
            if(num>9){
                digits[i]= num%10;
                carry =1;
            }
            else{
                digits[i]=num%10;
                carry =0;
                break;
            }
        }
        if(carry==1){
            len++;
            j=1;
        }
        int res[] = new int[len];
        if(carry==1){
            res[0]=1;
        }
        i=0;
        while(j<len){
            res[j]=digits[i];
            j++;
            i++;
        }
        return res;
    }
}
