public class longestSubArraywithoutRepeating {

    /*

    Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"


Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */



    public static int lengthofSubstringWithoutRepeatingChars(String s){

        String result="";
        String finalResult="";

        for(int i=0; i<s.length(); i++){   //"abcabcbb"
            result="";
            for(int j =i; j<s.length(); j++){
                if(result.contains(""+s.charAt(j))) break;

                result+=""+s.charAt(j);

            }

            if(result.length()>finalResult.length()){
                finalResult=result;
            }
        }



        return finalResult.length();

    }


    public static void main(String[] args) {
        System.out.println(lengthofSubstringWithoutRepeatingChars("abcabcbb"));
    }

}
