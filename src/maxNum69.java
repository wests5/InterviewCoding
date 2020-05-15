public class maxNum69 {

   /*
   Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).



Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
    */


   public static int maxNumberwith69(int num){
       int result=0;
       String res="";
       boolean check=true;

       String [] s = String.valueOf(num).split("");

       // s = [9, 6, 6, 9]

       for(int i=0; i<s.length; i++){
           if(s[i].equals("6") && check){
               s[i]="9";
               check=false;
           }
           res+=s[i];
       }

       result = Integer.parseInt(res);

      return result;
   }

    public static void main(String[] args) {
        System.out.println(maxNumberwith69(666666));
    }




}
