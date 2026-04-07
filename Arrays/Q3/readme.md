# Approach

1. Traverse the array to find the largest element.  
2. Initialize a variable `secondLargest` with a very small value.  
3. Traverse the array again and skip elements equal to the largest.  
4. For remaining elements, update `secondLargest` using Math.max().  
5. At the end, `secondLargest` will store the second largest element.