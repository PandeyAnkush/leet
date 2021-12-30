public class strPalin {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        Solution sol = new Solution();
        System.out.println(sol.isPal(s));
    }
}
class Solution{
    boolean isPal(String s1){
        String s=s1.replaceAll("[^a-zA-Z0-9]", "");
        for(int j=0;j<s.length();j++)
            System.out.print(s.charAt(j)+" ");
        int len=s.length(),i=0;
        len--;
        while(i<len){
            /*while(s.charAt(i)!= '[^a-zA-Z0-9]')
            i++;
            while(s.charAt(len)!='[^a-zA-Z0-9]')
            len--;
            if(i<len){*/
                if(s.charAt(i)==s.charAt(len)){
                    i++;
                    len--;
                }
                else{
                    return false;
                }
            //}
           // else{
                //return false;
           // }
        }
        return true;
    }
}
