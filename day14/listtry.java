package day14;
import java.util.*;

public class listtry {
    public static void main(String[] args){
        List<Object>arraylist=new ArrayList<>();
        arraylist.add("ahasan");
        arraylist.add("jeyaprskasj");
        arraylist.add(12123);//list la data add panrom
        arraylist.add('w');
        arraylist.add(323);
        arraylist.add("dvef");
        arraylist.remove(3);//list la data delete panrom

        arraylist.add(1,"sudhaaaaaaa");//list la add panrom withb index value

        arraylist.addFirst("ahsaaaaaaa");//listb la firsdt la add aaikum

        arraylist.addLast("jpppppppppppp");//list lahh last ahh add aaikum
        List<Object> ahasan = new ArrayList<>(Arrays.asList("ahasan", 123, 'j'));//arraylist cration new method
        arraylist.addAll(ahasan);//list kuklla list add panrathu
        List<Object> falaq = new ArrayList<>(Arrays.asList("ahghfhybcygusvn", 134423423, 'o'));
        arraylist.addAll(1,falaq);//new list ahh first lahh add panikalam
        arraylist.removeAll(arraylist); // list full ah remove panikalam!!!!
        arraylist.retainAll(falaq);
        for(Object n:arraylist){
            System.out.println(n); // printing statement
        }

    }
}
