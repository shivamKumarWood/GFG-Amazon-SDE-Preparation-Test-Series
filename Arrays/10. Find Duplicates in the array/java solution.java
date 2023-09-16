

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n-1;){
            if(arr[i]!=arr[i+1]){
                i++;
            }else{
                list.add(arr[i]);
                while(i<n-1&&arr[i]==arr[i+1]){
                    i++;
                }
                i++;
            }
            
        }
        if(list.size()==0) return new ArrayList<>(Arrays.asList(-1));
        return list;
    }
}