class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)>='a' && exp.charAt(i)<='z' || exp.charAt(i)>='A' && exp.charAt(i)<='Z'){
                st.push(exp.charAt(i)+"");
            }
            else{
                String temp1=st.pop();
                String temp2=st.pop();
                
                String s='('+temp2+ exp.charAt(i) +temp1+')';
                st.push(s);
            }
        }
        return st.peek();
    }
}
