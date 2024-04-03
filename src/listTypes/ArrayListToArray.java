package listTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToArray {
	
	public static void main(String[] args)
    {
 
        
        List<String> list =  List.of("Akhil","Pillamgolla","Spring","Developer");  // adding elements in single line

        
        System.out.println(list);   
 
        // Converting List to array using toArray() method
        String[] arr = list.toArray(new String[0]);
 
        // Printing elements of array
        // using for-each loop
        for (String x : arr)
            System.out.print(x + " ");
    }

}
