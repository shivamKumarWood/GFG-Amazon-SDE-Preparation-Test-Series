

class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int arr1[], int arr2[])
    {
        // Your code here
        int i=0,j=0;
        int sum1=0,sum2=0;
        int total=0;
        int m=arr1.length,n=arr2.length;
        while(i<m&&j<n){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i];
                i++;
            }
            else if(arr2[j]<arr1[i]){
                sum2+=arr2[j];
                j++;
            }
            else{
                total+=Math.max(sum1,sum2);
                total+=arr1[i];
                i++;j++;
                sum1=0;sum2=0;
            }
        }
        while(i<m){
            sum1+=arr1[i];
            i++;
        }
        while(j<n){
            sum2+=arr2[j];
            j++;
        }
        total+=Math.max(sum1,sum2);
        return total;
    }
}