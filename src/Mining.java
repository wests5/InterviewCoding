public class Mining {


    public static int mining(int nn){
        int amountOfRobots=1, day=1;
        while(amountOfRobots<nn){
            amountOfRobots=amountOfRobots*2;
            day++;
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println(mining(17));
    }
}
