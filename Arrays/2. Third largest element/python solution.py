import heapq
class Solution:
    def thirdLargest(self,a, n):
        # code here
        max_heap = []

        # Push elements from the array into the max-heap
        for num in a:
            heapq.heappush(max_heap, num)  # Negate the numbers to simulate a max-heap

            # If the size of the max-heap exceeds 3, remove the smallest element
            if len(max_heap) > 3:
                heapq.heappop(max_heap)

        # The top of the max-heap (min element due to negation) is the third largest
        return max_heap[0]
