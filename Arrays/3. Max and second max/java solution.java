        


// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int first=-1,second=-1;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
             else if(arr[i]!=first && second<arr[i]){
                second=arr[i];
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        list.add(first);
        list.add(second);
        return list;
    }
}