

//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int one=0,zero=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]==1) one++;
	        else zero++;
	    }
	    int res[]=new int[n];
	    int idx=-1;
	    while(zero>0){
	        res[++idx]=0;
	        zero--;
	    }
	    while(one>0){
	        res[++idx]=1;
	        one--;
	    }
	return res;
	}
} 