

class GfG
{
    int max_sum(int A[], int n)
    {
	// Your code here
	   int sum=0;
	   int res=0;
	   int max=0;
	   for(int i=0;i<n;i++){
	       sum+=A[i];
	       res+=A[i]*i;
	   }
	   max=Math.max(res,max);
	   for(int i=0;i<n-1;i++){
	       res+=A[i]*(n-1);
	       res-=(sum-A[i]);
	       max=Math.max(res,max);
	   }
	   return max;
	
    }	
}