

//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        // code here
        Arrays.sort(array);
        int n=array.length;
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                int diff = Math.abs(target - sum);

                if (diff < minDiff||(diff==minDiff&&sum>closestSum)) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
	} 
} 