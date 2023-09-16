

class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int nums[], int n) {
        
        // Your code here
        int globalMin = Integer.MAX_VALUE;
        int globalMax = Integer.MIN_VALUE;
        int localMax = Integer.MIN_VALUE;
        int localMin = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            if(localMax<0) localMax = nums[i];
            else localMax +=nums[i];
            if(localMin>0) localMin = nums[i];
            else localMin +=nums[i];
            globalMax = Math.max(globalMax, localMax);
            globalMin = Math.min(globalMin, localMin);
        }
        if(globalMin == sum) return globalMax;
        return Math.max(globalMax, sum-globalMin);
        
    }
    
}