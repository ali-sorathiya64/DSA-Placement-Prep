package Arrays.Q3;



public class SecondLargestElement {

    public static int secondLargestElement(int arr[]){

        int largestElement = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if (largestElement  < arr[i])
                largestElement = arr[i];
        }


        int secondLargestElement = Integer.MIN_VALUE;

        for (int j=0 ; j<arr.length; j++){
            if(largestElement != arr[j])
                secondLargestElement = Math.max(secondLargestElement ,arr[j]);
        }
        return secondLargestElement;

    }
    public static void main(String[] args) {
        
        int []arr={10,20,30,40,50};
        System.out.println(secondLargestElement(arr));

    }

}