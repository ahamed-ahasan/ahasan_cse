package day14;
import java.util.*;
public class listtry7 {
    public static void main(String[] args){
        List<Object>arraylist=new ArrayList<>();
        arraylist.add("ahasan");
        arraylist.add("jeyaprskasj");
        arraylist.add(12123);//list la data add panrom
        arraylist.add('w');
        arraylist.add(323);
        arraylist.add("dvef");
        System.out.println(arraylist);
        arraylist.remove(3);//list la data delete panrom
        System.out.println(arraylist);

        arraylist.add(1,"sudhaaaaaaa");//list la add panrom withb index value

        arraylist.addFirst("ahsaaaaaaa");//listb la firsdt la add aaikum

        arraylist.addLast("jpppppppppppp");
        System.out.println(arraylist);//list lahh last ahh add aaikum
        List<Object> ahasan = new ArrayList<>(Arrays.asList("ahasan", 123, 'j'));//arraylist cration new method
        arraylist.addAll(ahasan);//list kuklla list add panrathu
        System.out.println(arraylist);
        List<Object> falaq = new ArrayList<>(Arrays.asList("ahghfhybcygusvn", 134423423, 'o'));
        arraylist.addAll(1,falaq);//new list ahh first lahh add panikalam
        arraylist.removeAll(arraylist); // list full ah remove panikalam!!!!

        List<Object> falaq1 = new ArrayList<>(Arrays.asList("jeyapraksh", 3423, 'l'));
        falaq.retainAll(falaq1);
        System.out.println(falaq1);
        List<Object> ahasan1 = new ArrayList<>(Arrays.asList("ahasan", 123, 'j',"ahasan"));
        Object n=ahasan1.get(1);
        System.out.println(n);
        Object nn=ahasan1.indexOf("ahasan");
        System.out.println(nn);
        Object nnn=ahasan1.lastIndexOf("ahasan");
        System.out.println(nnn);
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();// user input
        List<Object> ahasan2 = new ArrayList<>(Arrays.asList("ahasan", 123, 'j',"ahasan"));
        boolean ahaz=ahasan2.contains(str); // check pannum user input uhm namma input uhm sam e ahh iruka nuh then return as true
        System.out.println(ahaz);
        boolean mt=ahasan2.isEmpty();
        System.out.println(mt);
        int aalavu=ahasan2.size();
        System.out.println(aalavu);
    }
}
