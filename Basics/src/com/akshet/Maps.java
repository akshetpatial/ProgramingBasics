package com.akshet;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<String,Integer>();

        // Insertion
        maps.put("Akshet",1);
        maps.put("patial",2);
        maps.put("IITD",13);
        maps.put("ML",14);
        // Update
        maps.put("Akshet",11);
        //Search
        System.out.println(maps.containsKey("akshey"));
        System.out.println(maps.containsKey("Akshet"));
        //get the Value
       int ans_1 =  maps.get("Akshet").intValue();
//        int ans_2 = maps.get("akshet").intValue();
        System.out.println(ans_1);
//        System.out.println(ans_2);
        System.out.println(maps);

        // Tranverse the Maps

        for(Map.Entry<String,Integer> ele : maps.entrySet()){
            int a = ele.getValue();
            System.out.print("Keys: "+ ele.getKey()+" ,");
            System.out.println("Value: "+ ele.getValue());
        }

        System.out.println("Keys");
        for(String ele : maps.keySet()){
            System.out.print(ele+", ");
        }
        System.out.println();

        System.out.println("Value");
        for(Integer ele : maps.values()){
            System.out.print(ele+", ");
        }
    }
}
