

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int temp=0;
        for(int i=1;i<n;i++){
            temp+=arr[i-1];
            if(sum-temp-arr[i]==temp){
                return i+1;
            }
        }
        return -1;
    }
}