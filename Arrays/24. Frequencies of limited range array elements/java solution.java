

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int p)
    {
        // code here
        for(int i=0;i<N;i++){
            int value=arr[i]%(p+1);
            if(value<=N)
            arr[value-1]+=p+1;
        }
        for(int i=0;i<N;i++){
            arr[i]=arr[i]/(p+1);
        }
    }
}