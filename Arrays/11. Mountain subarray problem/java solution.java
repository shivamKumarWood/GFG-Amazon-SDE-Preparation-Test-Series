

// User function Template for Java

// refer Pair class in driver code
class Solution {
    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
                                      int q) {
        // code here
        ArrayList<Boolean>list=new ArrayList<>();
        for(int i=0;i<q;i++){
            Pair curr=queries.get(i);
            int left=curr.l;
            int right=curr.r;
            if(left==right){
                list.add(true);
                continue;
            }
            boolean stepping=true;
            for(int j=left+1;j<=right;j++){
                if(stepping==false&&a[j]>a[j-1]){
                    list.add(false);
                    break;
                }
                if(a[j]<a[j-1]){
                    stepping=false;
                }
                if(j==right){
                    list.add(true);
                }
            }
            
        }
        return list;
    }
}