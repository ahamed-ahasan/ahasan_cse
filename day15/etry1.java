package day15;

import java.util.Scanner;

public class etry1 {
    public static void main(String[] args){
        int n=0;
        Scanner sc =new Scanner(System.in);
        try {
            n=sc.nextInt();
        } catch (Exception e) {
            System.out.println("invalidn  input , please correcct it !!!");
        }

        System.out.println(n);
    }
}
