import java.util.*;

public class MinSizeToReachHalfSize {
    /*
    Given an array arr.  You can choose a set of integers and remove all the occurrences of these integers in the array.

Return the minimum size of the set so that at least half of the integers of the array are removed.



Example 1:

Input: arr = [3,3,3,3,5,5,5,2,2,7]
Output: 2
Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
Possible sets of size 2 are {3,5},{3,2},{5,2}.
Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has size greater than half of the size of the old array.
     */


    public static int minSetSize(int[] arr) {
        int originalSize = arr.length;
        int targetSize = arr.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int each : arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((i,j)->map.get(j)-map.get(i));
        int count =0;
        int sumOfRemoved=0;
        while(originalSize-sumOfRemoved>targetSize){
            sumOfRemoved+=map.get(list.get(0));
            list.remove(0);
            count++;
        }
        return count;


    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(nums));
    }
}
