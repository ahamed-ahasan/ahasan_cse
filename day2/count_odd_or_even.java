package day2;


import java.util.Scanner;

public class count_odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int odd = 0, even = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            n /= 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }

}
