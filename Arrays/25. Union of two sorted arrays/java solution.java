

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer>list=new ArrayList<>();
        int i=0,j=0;
        while(i<n&&j<m){
            if(list.size()>0&&list.get(list.size()-1)==arr1[i]){
               i++;
               continue;
            } 
            if(list.size()>0&&list.get(list.size()-1)==arr2[j]) {
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                list.add(arr2[j]);
                j++;
            }else{
                list.add(arr1[i]);
                i++;j++;
            }
        }
        while(i<n){
           if(list.size()>0&&list.get(list.size()-1)==arr1[i]) {
               i++;
               continue;
           }
           list.add(arr1[i]);
           i++;
        }
        while(j<m){
            if(list.size()>0&&list.get(list.size()-1)==arr2[j]) {
                j++;
                continue;
            }
           list.add(arr2[j]);
           j++;
        }
        return list;
    }
}

