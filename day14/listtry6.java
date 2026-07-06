package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listtry6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();// user input
        List<Object> ahasan = new ArrayList<>(Arrays.asList("ahasan", 123, 'j',"ahasan"));
        boolean ahaz=ahasan.contains(str); // check pannum user input uhm namma input uhm sam e ahh iruka nuh then return as true
        System.out.println(ahaz);
        boolean mt=ahasan.isEmpty();
        System.out.println(mt);
        int aalavu=ahasan.size();
        System.out.println(aalavu);
    }
}
