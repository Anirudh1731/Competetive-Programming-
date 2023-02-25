//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    static void sort(Stack<Integer> s,int temp)
    {
        
        if(s.isEmpty() || temp>s.peek())
        {
            s.push(temp);
            return;
        }
        int temp2=s.peek();
        s.pop();
        sort(s,temp);
        s.push(temp2);
        
    }
    static void reverse(Stack<Integer> s)
    {
        if(!s.isEmpty())
        {
            int temp=s.peek();
            s.pop();
            reverse(s);
            sort(s,temp);
        }
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		reverse(s);
		return s;
	}
}
