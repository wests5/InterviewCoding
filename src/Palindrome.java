public class Palindrome {


    public static boolean checkIfPalindrome(String s){

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }


        }
        return true;
    }

      /*
    Input: "d a b a d"
            0 1 2 3 4

    Output: "bab"
     */


    public static String longestPalindrom(String s) {
        String result="";
        s=s.replace(" ", "");

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(checkIfPalindrome(s.substring(i,j+1))){
                    if(s.substring(i,j+1).length()>result.length()){
                        result=s.substring(i,j+1);
                    }
                }
            }
        }




        return result;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrom("babda"));
    }

}
