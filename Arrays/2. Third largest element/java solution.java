
class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
	    for(int i=0;i<n;i++){
	        pq.add(a[i]);
	    }
	    for(int i=0;i<2;i++){
	        pq.poll();
	    }
	    return pq.peek();
    }
}