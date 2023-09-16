

//User function Template for Java

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int l,int h){
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;h--;
        }
    }
}