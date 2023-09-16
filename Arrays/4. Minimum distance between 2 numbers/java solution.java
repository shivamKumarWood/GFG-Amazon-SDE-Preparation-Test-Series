

// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int res=Integer.MAX_VALUE;
        int x1=-1,y1=-1;
        for(int i=0;i<n;i++){
            if(x==a[i]) x1=i;
            if(y==a[i]) y1=i;
            if(x1!=-1&&y1!=-1)
            res=Math.min(res,Math.abs(x1-y1));
        }
        if(x1==-1||y1==-1) return -1;
        else return res;
    }
}