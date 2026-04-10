public  class LargestAndSmallestElement {

    public static int largestElement(int nums[]){

        int max = Integer.MIN_VALUE;

        for (int i =0 ; i<nums.length ; i++){
            if (max < nums[i]){
                max =nums[i];

            }
        }
        return  max;

    }
    public static int smallestElement(int nums[]){

        int min = Integer.MAX_VALUE;

        for (int i =0 ; i<nums.length ; i++){
            if (min >nums[i]){
                min =nums[i];

            }
        }
        return  min;

    }


    public static void main(String[] args) {

        int nums [] ={10,20,30,40};
        System.out.println("Largest element of the array :" +largestElement(nums));
        System.out.println("Smallest element of the array :" +smallestElement(nums));

    }
}
