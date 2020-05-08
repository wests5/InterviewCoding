import java.util.ArrayList;
import java.util.List;

public class FindMissingElements {
    /*
 Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
  some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.


Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
     */


    public static List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums.length == 0) return result;

        List<Integer> list = new ArrayList<>();

        for (int each : nums) {
            list.add(each);
        }

        for(int i=1; i<nums.length+1; i++){
            if(!list.contains(i)){
                result.add(i);
            }
        }



        return result;
    }


    public static void main(String[] args) {
        int [] nums = new int[]{1,1};
        System.out.println(findMissingElements(nums));
    }

}
