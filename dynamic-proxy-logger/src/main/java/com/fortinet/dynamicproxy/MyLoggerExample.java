package com.fortinet.dynamicproxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyLoggerExample {
    public static void main(String[] args) {
        List<Integer> list = MyLogger.getProxy(new ArrayList<Integer>(), List.class);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(1);
        
        Map<Integer,String> names=MyLogger.getProxy(new HashMap<Integer, String>(), Map.class);
        names.put(1, "Ajay Modi");
        names.put(2, "Dhiren Panelia");
        System.out.println(names);

    }
}