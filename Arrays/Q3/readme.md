Second Largest Element in an Array

🧠 Problem Statement

Given an array of integers, find the second largest element in the array.

---

🚀 Approach

Step 1:

Traverse the array and find the largest element.

Step 2:

Traverse the array again and find the largest element that is not equal to the maximum.

Step 3:

Use "Math.max()" to keep track of the second largest element.

---

⚡ Optimized Approach (Single Pass)

Instead of traversing the array twice, we can find both largest and second largest in a single iteration.

- Initialize:
  
  - "largest = -∞"
  - "secondLargest = -∞"

- Traverse the array:
  
  - If current element > largest:
    - secondLargest = largest
    - largest = current element
  - Else if current element > secondLargest AND current != largest:
    - secondLargest = current element

---

💻 Java Code

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 5, 2};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}

---

📌 Example

Input:

[3, 5, 1, 5, 2]

Output:

3

---

⏱️ Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

⚠️ Edge Cases

- Array with all same elements