

//User function Template for Java


class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        if(len==1) return 0;
        long ans=0;
        int left=0,right=len-1;
        while(left<right){
            long min=Math.min(A[left],A[right]);
            ans=Math.max(ans,min*(right-left));
            if(A[left]<A[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
        
    }
    
}