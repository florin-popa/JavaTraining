/**
 * Created by Ciprian on 12/6/2016.
 */
public class Fibonacci {

    public static void main(String args[]) {
        int fNumber = 0;
        int sNumber = 1;
        int temp = 0;
        int sum = 0;
        System.out.print(fNumber + " " + sNumber + " ");
        while (temp < 4000000) {
            temp = fNumber + sNumber;
            fNumber = sNumber;
            sNumber = temp;
            if (sNumber < 4000000) {
                System.out.print(sNumber + " ");
            }
            if (sNumber % 2 == 0) {
                sum += sNumber;
            }
        }
        System.out.println("\n" + sum);
    }
}
