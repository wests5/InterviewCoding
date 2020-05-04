import java.util.Arrays;

public class largestSubArray {
/*
    arr[] { 5,5,1,2,10 }, 3
                5

                5, 5 ,1
 */


public static int[] largestSubArray(int [] arr, int subLength){
    int sum=0, finalSum=0;
    int[] subarr = new int[subLength];
    int[] result = new int[subLength];


    for(int i =0; i<arr.length-subLength+1; i++){
        sum=0;

        for(int j=i, k=0; j<i+subLength; j++, k++){
            sum+=arr[j];
            subarr[k]=arr[j];
        }

        if(sum>finalSum){
            finalSum=sum;
            for(int j=0; j<subLength; j++){
                result[j]=subarr[j];
            }
        }

    }

    return result;


}

    public static void main(String[] args) {
        int [] arr = new int[] { 5,5,1,2,10,9 };

        System.out.println(Arrays.toString(largestSubArray(arr, 2)));
    }

}
