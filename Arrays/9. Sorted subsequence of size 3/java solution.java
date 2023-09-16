

/*Complete the function below*/

class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
       ArrayList<Integer> result = new ArrayList<>();
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr.get(0);
        for(int i=1;i<n;i++){
            left[i]=Math.min(left[i-1],arr.get(i));
        }
        right[n-1]=arr.get(n-1);
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr.get(i));
        }
        for(int i=1;i<n-1;i++){
            if(arr.get(i)>left[i]&&arr.get(i)<right[i]){
                result.add(left[i]);
                result.add(arr.get(i));
                result.add(right[i]);
                return result;
            }
        }
        return new ArrayList<>();
    }
}