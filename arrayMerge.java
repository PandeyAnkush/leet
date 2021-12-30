public class arrayMerge {
    public static void main(String [] args) {
        Solution so = new Solution();
        int nums1[]={2,0};
        int nums2[]={1};
        int s1=1,s2=1,i;
        so.merge(nums1, s1, nums2, s2);
        for(i=0;i<2;i++)
        {
            System.out.print(nums1[i]+"  ");
        }
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr = m+n-1;
        if(m==0){

        }
        m--;
        n--;
        while(m>-1&&n>-1){
            if(nums1[m]<nums2[n]){
                System.out.println("In if block"+curr +"  "+m+" "+n);
                nums1[curr]=nums2[n];
                n--;
                curr--;
            }
            else{
                nums1[curr]=nums1[m];
                System.out.println("In else block"+curr +"  "+m+" "+n);
                m--;
                curr--;
            }
        }
        if(m==-1){
            while(n>-1){
                nums1[curr]=nums2[n];
                n--;
                curr--;

            }
        }
    }
}