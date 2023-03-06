class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int preced(char c)
    {
        if(c=='^'){
            return 3;
        }
        else if(c=='*' || c=='/')
        {
            return 2;
        }
        else if(c=='+' || c=='-'){
            return 1;
        }
        else {
            return -1;
        }
    }
    public static String infixToPostfix(String exp) {
        String res="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if((exp.charAt(i) >='a' && exp.charAt(i)<='z')  || (exp.charAt(i)>='A' && exp.charAt(i)<='Z')){
                res=res+exp.charAt(i);
            
            }
            else if(exp.charAt(i)=='('){
                st.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res=res+st.peek();
                    st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }
                
            
            else{
                while(!st.isEmpty() && preced(st.peek())>=preced(exp.charAt(i))){
                    res=res+st.peek();
                    st.pop();
                }
                st.push(exp.charAt(i));
            }
        }
        while(!st.isEmpty()){
            res=res+st.peek();
            st.pop();
        }
        return res;
    }
}
