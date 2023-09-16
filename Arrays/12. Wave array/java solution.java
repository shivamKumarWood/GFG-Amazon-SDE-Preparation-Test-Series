

class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int len=n/2;
        int idx=0;
        for(int i=0;i<len;i++,idx+=2){
            swap(idx,idx+1,a);
        }
    }
    public static void swap(int i,int j,int[] a){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }
}
        