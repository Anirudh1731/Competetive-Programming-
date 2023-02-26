//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static void recu(String n1,int k,List<String> li)
    {
        if(k==0)
        {
            li.add(n1);
            return;
        }
        if(n1.charAt(n1.length()-1)=='0')
        {
            
            String str1=n1;
            str1=str1+'0';
            String str2=n1;
            str2=str2+'1';
            recu(str1,k-1,li);
            recu(str2,k-1,li);
        
            
        }
        else{
            String str1=n1;
            str1=str1+'0';
            recu(str1,k-1,li);
            
        }
        
        
        
        
    }
    public static List<String> generateBinaryStrings(int n) {
        String n1="0";
        String n2="1";
        ArrayList<String> li=new ArrayList<>();
        recu(n1,n-1,li);
        recu(n2,n-1,li);
        
        return li;

    }
}
     
     
