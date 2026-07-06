package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtry5 {
    public static void main(String[] args){
        List<Object> ahasan = new ArrayList<>(Arrays.asList("ahasan", 123, 'j',"ahasan"));
        Object n=ahasan.get(1);
        System.out.println(n);
        Object nn=ahasan.indexOf("ahasan");
        System.out.println(nn);
        Object nnn=ahasan.lastIndexOf("ahasan");
        System.out.println(nnn);

    }
}
//************** this all are access methods*****************************************