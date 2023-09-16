

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
        // Your code here
        int left[]=new int[N];
        int right[]=new int[N];
        left[0]=A[0];
        right[N-1]=A[N-1];
        for(int i=1;i<N;i++){
            left[i]=Math.min(A[i],left[i-1]);
        }
        for(int i=N-2;i>=0;i--){
            right[i]=Math.max(A[i],right[i+1]);
        }
        int i=0,j=0,max=0;
        while(i<N&&j<N){
            if(left[i]<=right[j]){
                max=Math.max(j-i,max);
                j++;
            }else{
                i++;
            }
        }
        return max;
        
    }
}
