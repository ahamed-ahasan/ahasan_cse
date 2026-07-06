//package Try;
//import java.util.*;
//
//public class listtry4 {
//    public static void main(String[] args) {
//        List<Object> falaq = new ArrayList<>(Arrays.asList("ahghfhybcygusvn", 134423423, 'o'));
//        falaq.retainAll(falaq);
//        System.out.println(falaq);
//    }
//
//}

//***********************remove if method**************************************
package day14;
import java.util.*;

public class listtry4 {
    public static void main(String[] args) {
        List<Integer> falaq = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        falaq.removeIf( n->n%2 == 0);
        System.out.println(falaq);
    }
}
// one type of removing method butb only using for the integer value
