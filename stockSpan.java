class pair{
    int el;
    int cnt;
    pair(int el,int cnt)
    {
        this.el=el;
        this.cnt=cnt;
    }
}
class StockSpanner {
    Stack<pair>st;

    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        if(st.isEmpty())
        {
            st.push(new pair(price,1));

        }
        else{
            int count=1;
            while(!st.isEmpty() && st.peek().el<=price){
                count=count+st.peek().cnt;
                st.pop();

            }
            st.push(new pair(price,count));
        }
        return st.peek().cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
