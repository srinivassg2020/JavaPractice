package collection;
import java.util.*;
import java.lang.*;
import java.io.*;
public class TreeMapExample {
    // This function prints ordering of all elements
    static void insertAndPrint(AbstractMap<Integer, String> map)
    {
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (Map.Entry<Integer, String> k: map.entrySet())
        {
            System.out.print(k.getKey() + ", "+k.getValue());
            System.out.print(" \n");
        }
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        insertAndPrint(map);
        System.out.println("+++++++++++++++++++++++++++++++");
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        insertAndPrint((AbstractMap<Integer, String>) hashmap);
        System.out.println("+++++++++++++++++++++++++++++++");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        insertAndPrint(linkedHashMap);
    }
}
