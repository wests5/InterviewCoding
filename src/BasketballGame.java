public class BasketballGame {
 /*
 Basketball game.

Count what is the minimum amount of shots you need to score to reach exact number of points which will be provided as goal
(you can not exceed the goal).
Assume no one playing defense so you will not have any free throws.
  */


 public static int amountofShots(int goal){

     if(goal % 3 ==0){
         return goal/3;
     }else{
        int temp = goal; //goal =13, temp = 13
        while(temp%3!=0){ //1st iteration temp=11. 2nd temp=9
            temp-=2;
        }
        return ((goal-temp)/2) + (temp/3);
                // 2 points         3 points
     }



 }

    public static void main(String[] args) {
        System.out.println(amountofShots(2));
    }




}
