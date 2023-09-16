

//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        if(n==1) return new long[]{1};
        if(n==2) return new long[]{nums[1],nums[0]};
        long left[]=new long[n];
        long right[]=new long[n];
        long res[]=new long[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }
        res[0]=right[1];
        res[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=left[i-1]*right[i+1];
        }
        return res;
	} 
} 