


public class ReverseArray {

    public static  void reverseArray(int nums[]){

        int start = 0; // first element
        int end = nums.length-1; // last element

        while (start <=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }



    }
    public static void main(String[] args) {
        int nums [] ={10,20,30,40};

        reverseArray(nums);
         for (int i =0 ; i<nums.length ; i++){
      System.out.println( "values " +   nums[i]);
  }


    }
}
