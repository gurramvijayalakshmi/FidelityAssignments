package com.practicejava;
import java.util.*;

public class Collsetshash {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("John");
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("John");
        arrayList.add(null);
        System.out.println(arrayList);


        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("John");
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("John");
        linkedList.add(null);
        System.out.println(linkedList);


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("John");
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("John");
        hashSet.add(null);
        System.out.println(hashSet);


        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        for (Map.Entry<String, Integer> me : hm.entrySet()) {

            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

}
