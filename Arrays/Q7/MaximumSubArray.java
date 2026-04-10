package Arrays.Q7;

public class MaximumSubArray {

    public static int maxSubArray(int[] nums){

        int Max = Integer.MIN_VALUE;
        int currSum =0;

        for (int i=0; i<nums.length; i++){
           
            currSum = currSum + nums[i];

            if (currSum <0){
                currSum =0;
            }

            Max = Math.max(currSum, Max);

        }




        return Max;
    }

    public static void main(String[] args) {

         int nums[] ={5,-4,-2,6,-1};
        System.out.println     ( maxSubArray(nums));

        
    }

    
}
