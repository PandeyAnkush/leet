public class lastWord {
    public static void main(String[] args){
        String S= "()[]{";
        Sol so= new Sol();
        System.out.println(so.lengthOfLastWord(S));
    }
}
 class Sol{
    public int lengthOfLastWord(String s){
        int len=0,strlen,i;
        strlen= s.length();
        if(strlen==0){
            return len;
        }
        i=strlen-1;
        while(s.charAt(i)==' '&& i>-1){
            i--;
        }
        while(s.charAt(i)!=' '&&i>-1){
            len++;
            i--;
        }
        return len;

    }
}
