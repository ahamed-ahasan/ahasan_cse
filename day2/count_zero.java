package day2;
import java.util.Scanner;
public class count_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            if (n % 10 == 0)
                count++;
            n /= 10;
        }

        System.out.println("Zero Count = " + count);
    }
}
