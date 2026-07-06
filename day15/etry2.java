package day15;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class etry2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name="";
        int age;
        int id;
        int[]phno={};
        try {
            name= sc.nextLine();
            age=sc.nextInt();
            id= sc.nextInt();
            System.out.println(phno[7]);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (MissingFormatArgumentException e){
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
