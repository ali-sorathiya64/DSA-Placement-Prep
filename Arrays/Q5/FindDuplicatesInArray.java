package Arrays.Q5;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {

    public static List<Integer> findDuplicate(int nums[]) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int element = Math.abs(nums[i]);
            int seat = element - 1;

            if (nums[seat] < 0) {
                res.add(element);
            } else {
                nums[seat] = -nums[seat];
            }
        }

        return res;

    }

  
    public static void main(String[] args) {

      int[] arr = {1, 2, 3, 4, 5, 4, 5};
    List<Integer> result = findDuplicate(arr);
    System.out.println(result);

    }

}
