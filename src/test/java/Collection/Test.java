package Collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Safron");
        list.add('y');
        list.remove(1);
        System.out.println(list);
        Iterator iterator = list.iterator();
        for(Object o : list){
            System.out.println(o);
        }
        Set set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);



    }
}
