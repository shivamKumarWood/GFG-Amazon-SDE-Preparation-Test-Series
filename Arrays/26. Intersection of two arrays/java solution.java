

// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer>set=new HashSet<>();
        int cnt=0;
        // Arrays.sort(a);
        // Arrays.sort(b);
        // int i=0,j=0;
        // int cnt=0;
        // while(i<n&&j<m){
        //     if(a[i]==b[j]){
        //         if(!set.contains(a[i])){
        //             set.add(a[i]);
        //             cnt++;
        //         }
        //         i++;j++;
        //     }else if(a[i]<b[j]){
        //         i++;
        //     }else{
        //         j++;
        //     }
            
        // }
        // return cnt;
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int j=0;j<m;j++){
            if(set.contains(b[j])){
                set.remove(b[j]);
                cnt++;
            }
        }
        return cnt;
    }
};