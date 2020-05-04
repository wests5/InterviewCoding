import java.util.Arrays;

public class Permutation {

    /*
    Given an array of 3 characters print all permutation combinations from the given characters.
     Character can NOT be repeated.

     1,2,3

     2,1,3 - valid

     1 1 2- not valid


     */


    public static void allPermutationsForthreeNums(int [] nums){

        if(nums.length==3){

            int[] nums1 = new int[3];
            int count=0;
            // form any combination of 3 numbers
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums.length; j++){
                    for(int x=0; x<nums.length; x++){

                        nums1[0]=nums[i];
                        nums1[1]=nums[j];
                        nums1[2]=nums[x];
                //check if its a valid combination, means each number does not have repeats in array
                        for(int b =0; b<nums1.length; b++){
                            for(int c=0; c<nums1.length; c++){

                                if(nums1[b]==nums1[c]){
                                    count++;
                                }
                            }
                        }
                //if combination is valid count always will be 3
                        if(count==3){
                            System.out.println(Arrays.toString(nums1));
                        }

                        count=0;


                    }
                }
            }



        }else{

            System.out.println("Invalid input");

        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        allPermutationsForthreeNums(nums);
    }

}
