import java.util.*;

public class FrequenceSort {

    /*
    Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"


e-2
t-1
r-1

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
     */

    public static String frequencySort(String s) {
        String result = "";
        int count = 0;

        Map<Character, Integer> map = new HashMap<>();
        //"tree"
        //1st way to fiil up the map. Brute way using nested loops. Not that much eficient.
        // Takes to much time and resources.
  /*      for(int i=0; i<s.length(); i++){
            count=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            map.put(s.charAt(i),count);
        }

 */

        // Very efficient way to do
        for (char each : s.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        //List with all keays from out map
        // t,r,e
        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((i, j) -> map.get(j) - map.get(i));
        //e,t,r
        int c=0;
        for (Character each : list) {
            while (c!=map.get(each)) {
                result+=each;
                c++;
            }
            c=0;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
