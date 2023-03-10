public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(st1.isEmpty())
            {
                left[i]=-1;
            }
            else{
                while(!st1.isEmpty() && arr[st1.peek()]>=arr[i])
                {
                    st1.pop();
                }
                left[i]=st1.isEmpty() ? -1 :st1.peek();
                right[i]=0;

                
            }
            st1.push(i);

        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(st2.isEmpty())
            {
                right[i]=arr.length;
            }
            else{
                while(!st2.isEmpty() && arr[st2.peek()]>arr[i])
                {
                    st2.pop();
                }
                right[i]=st2.isEmpty() ? arr.length:st2.peek();
                

                
            }
            st2.push(i);

        }
        
        // for(int i=0;i<right.length;i++)
        // {
        //     System.out.print(right[i]+" ");
            
            
        // }
        int kMod = 1_000_000_007;
        int n = arr.length;
        long ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            long val1=i-left[i];
            long val2=right[i]-i;
            long total=val1*val2;

            long totalSum=arr[i]*total;
            ans =(ans +totalSum)% kMod;
        }
        return (int)ans;
    }
}
