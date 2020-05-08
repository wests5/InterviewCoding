import java.util.*;

public class topKfrequentElementsinArray {

    /*
    Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
     */


    public static int[] topKFreqElements(int[] nums, int k) {


        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        //Must know. Very usable convinient method
        for(int each : nums){
            map.put(each, map.getOrDefault(each, 0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((i,j)->map.get(j)-map.get(i));

        if(k>list.size()){
            try {
                throw new Exception("invalid input, K must be < = amount of distinct elemnts in araay");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int count =0;
        for (int i=0;i<k;i++){
            result[i]=list.get(i);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3,3,3};
        int k=9;
        System.out.println(Arrays.toString(topKFreqElements(nums, k)));
    }
}
