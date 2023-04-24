package Mapss;

import java.util.*;
import java.util.Map;

public class two {

	public static void main(String[] args) {

		 // Initialization of a Map
        // using Generics
        Map<Integer, String> hm1
            = new HashMap<Integer, String>();
 
        // Inserting the Elements
        hm1.put(new Integer(1), "Geeks");
        hm1.put(new Integer(2), "For");
        hm1.put(new Integer(3), "Geeks");
 
        for (Map.Entry<Integer, String> mapElement : hm1.entrySet()) {
            int key
                = (int)mapElement.getKey();
 
            // Finding the value
            String value
                = (String)mapElement.getValue();
 
            System.out.println(key + " : "
                               + value);
        }
    }

}
