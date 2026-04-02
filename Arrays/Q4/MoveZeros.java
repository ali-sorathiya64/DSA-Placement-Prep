package Arrays.Q4;



public class MoveZeros {

    public static void mZeros(int[] nums){
     int i =0;
     for (int j=0 ; j< nums.length ; j++){
         if (nums[j]!=0){
             int temp =  nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
             i++;
         }
     }


    }
    public static void main(String[] args) {

        int[] arr ={0,10,20,0,30,0,40};

 mZeros(arr);
 for (int num : arr){
     System.out.print( num  + " " );
 }




       }

    }


