public class NthFibonacci {


    /*
    0, 1, 1, 2, 3, 5 ......

      n=(n-2) + (n-1)
     */
    public static int getNthFibonacci(int n) {
        int result;
        int pre = 0, cur = 1, sum = 0;

        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
            for (int i = 0; i < n - 2; i++) {
                sum = pre + cur; //1 //2
                pre = cur;      //1 //1 //2 //3
                cur = sum;     //1 //2 //3 //5

            }

            result = cur;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNthFibonacci(7));
    }

}
