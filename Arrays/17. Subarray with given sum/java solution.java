

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int currSum=0;
        int start=0;
        int end=-1;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum-s==0){
                start=0;end=i;
                break;
            }
            if(map.containsKey(currSum-s)){
                start=map.get(currSum-s)+1;
                end=i;
                break;
            }
            map.put(currSum,i);
        }
        ArrayList<Integer>list=new ArrayList<>();
        if(end==-1){
            list.add(-1);
            return list;
        }
        else{
            list.add(start+1);
            list.add(end+1);
            return list;
        }
    }
}