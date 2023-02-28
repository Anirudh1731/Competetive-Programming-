class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int temp=1 << k;
        if((n & temp) !=0){
            return true;
        }
        else{
    
            return false;
        }
    }
    
}
