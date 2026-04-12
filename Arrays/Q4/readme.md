#Move Zeroes

## Problem
Given an integer array `nums`, move all 0's to the end while maintaining the relative order of the non-zero elements.

## Approach (Two Pointer)

We use two pointers:
- `i` → position to place the next non-zero element
- `j` → current element traversal

###. steps 
1. Traverse the array using pointer `j`
2. If nums[j] != 0`:
   - Swap `nums[i]` and `nums[j]`
   - Increment `i`
3. Continue until the end of the array

## Example
Input:  [0,1,0,3,12]  
Output: [1,3,12,0,0]

## Time Complexity
- O(n)

## Space Complexity
- O(1)