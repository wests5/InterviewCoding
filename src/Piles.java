public class Piles {

    public static void sort(int[] nums) {
        int temp = 0;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    check = true;
                }
            }
        }
    }

       /*
    Start point : 2 1 5 5 3

                  5 5 3 2 1
                  max= 5;
    2 1 5 3 3
    2 1 3 3 3
    2 1 3 3 2
    2 1 3 2 2
    2 1 2 2 2
    2 1 2 2 1
    2 1 2 1 1
    2 1 1 1 1
    1 1 1 1 1
     */

       public static int stepCount(int[] nums){
           sort(nums);
           int stepCount=0;
           int max, nextMax=0;
           while(nums[0]!=nums[nums.length-1]){
               max=nums[0];
               for(int i=0; i<nums.length; i++){
                   if(nums[i]!=max){
                       nextMax=nums[i];
                       break;
                   }
               }

               int i =0;

               //1 1 1 1 1
               while(nums[i]!=nextMax){
                   nums[i]=nextMax;
                   i++;
                   stepCount++;
               }


           }

           return stepCount;
       }


    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,5,3};
        System.out.println(stepCount(arr));
    }

}
