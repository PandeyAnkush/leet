import java.util.Stack;
class paran{
    
    public static void main(String[] args){
        String S= "()[]{";
        Sol so= new Sol();
        System.out.println(so.isValid(S));
    }
}
class Sol{
    public boolean isValid(String S){
        int i,len,top,check;
        Stack <Integer> stack = new Stack <Integer>();
        len=S.length();
        for(i=0;i<len;i++){
            if(S.charAt(i)=='('){
                stack.push(1);
                continue;
            }
            if(S.charAt(i)=='{'){
                stack.push(2);
                continue;
            }
            if(S.charAt(i)=='['){
                stack.push(3);
                continue;
            }
            if(S.charAt(i)==')'){
                top=stack.peek();
                check=top-1;
                if(check==0){
                    stack.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            if(S.charAt(i)=='}'){
                top=stack.peek();
                check=top-2;
                if(check==0){
                    stack.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            if(S.charAt(i)==']'){
                top=stack.peek();
                check=top-3;
                if(check==0){
                    stack.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
        }
       if(stack.isEmpty()){
           return true;
       }
       else{
           return false;
       }
    }
}