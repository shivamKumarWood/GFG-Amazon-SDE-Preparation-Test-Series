
class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        ArrayList<Integer>res = new ArrayList<Integer>();
        int dp[]=new int[100];
        for(int i = 0; i< n ; i++){
            dp[arr[i]]++;
            if(dp[arr[i]]==1) res.add(arr[i]);
        }
        return res;
           
    }
}