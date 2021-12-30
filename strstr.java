public class strstr {
    public static void main(String[] args) {
        String haystack="mississippi"        ;
        String needle = "issip";
        Solution sol = new Solution();
        System.out.println(sol.strStr(haystack, needle));
    }
}
class Solution{
    public int strStr(String haystack, String needle){
        int len1=haystack.length();
        int len2= needle.length();
        int i=0,j=0,count=0,prev=0;
        boolean flag=false;
        if(len2==0){
            return 0;
        }
        while(i<len1 && count!=len2){
            //System.out.println(haystack.charAt(i)+"  "+needle.charAt(j));
            if(flag==false && haystack.charAt(i)==needle.charAt(0)){
                flag = true;
                prev=i;
            }
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                count++;
              //  System.out.println(i+" "+j+" "+count);
            }
            else {
                count=0;
                j=0;
                if(flag==true){
                    i=prev;
                    flag=false;
                }
                //System.out.println(i+" "+j+" "+count+"in else ");
            }
            i++;
        }
        if(count == len2)
            return i-len2;
        else
            return -1;
    }
}
