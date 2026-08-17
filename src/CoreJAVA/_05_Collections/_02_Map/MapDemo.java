package _05_Collections._02_Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer , String> userMap=new HashMap<>();
        userMap.put(1,"Ashutosh");
        userMap.put(2,"Satish");
        userMap.put(3,"maan");
        userMap.put(4,"Om");
        userMap.remove(4);
        System.out.println(userMap.get(3));
        for (Map.Entry<Integer ,String>entry:userMap.entrySet()){
            System.out.println(entry.getKey() +": "+entry.getValue());
        }

    }
}
