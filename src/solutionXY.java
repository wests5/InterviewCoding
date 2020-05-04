public class solutionXY {

    /*
    int[] num = new int[]{100, 63, 1, 6, 2, 13};
    int x = 100, y=63;
     */


    public static int solution(int[] num, int x, int y) {
        int xcount=0, ycount=0;

        int limit = num.length;
        while(limit>0){
            for(int j = 0; j<limit; j++){
                if(x==num[j]){
                    xcount++;
                }
                if(y==num[j]){
                    ycount++;
                }

            }

            if(xcount==ycount){
                return limit-1;
            }

            limit--;
            xcount=0;
            ycount=0;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = new int[]{100, 63, 63, 63, 6, 2, 13};
        int x = 100, y=63;

        System.out.println(solution(num, x, y));
    }
}
