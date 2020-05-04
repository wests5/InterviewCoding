public class LargestKthinArray {

    /**
     * Find the kth largest elemnt in unsorted array
     * @param nums, k
     */

    public static void sort(int [] nums){
        int temp=0;
        boolean check=true;

        while(check){
                check=false;
            for(int i =0; i<nums.length-1; i++){
                    if(nums[i]<nums[i+1]){
                        temp=nums[i];
                        nums[i]=nums[i+1];
                        nums[i+1]=temp;
                        check=true;
                    }
            }
        }

    }

    public static int kthLargestinArray(int[] nums, int k){

        sort(nums);

        int count =1;
        int max = nums[0];
        int i=1;
        while (count!=k&&i<nums.length){
           if(nums[i]!=max){
               max=nums[i];
               count++;
           }
           i++;
        }
        if(count!=k){
            return -1;
        }
        return nums[i-1];





    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,6,6,6,6,5,5,5,5,3,4};

        System.out.println(kthLargestinArray(nums, 4));
    }



}
