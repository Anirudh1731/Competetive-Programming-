class Solution {
    void immediateSmaller(int arr[], int n) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!st.isEmpty() && arr[i]<=st.peek())
            {
                
                st.push(arr[i]);
                arr[i]=-1;
            }
            else if(st.isEmpty())
            
            {
                st.push(arr[i]);
                arr[i]=-1;
                
            }
            else{
                int temp=st.peek();
                st.push(arr[i]);
                arr[i]=temp;
            }
            
            
            
        }
