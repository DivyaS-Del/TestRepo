import java.util.*;  

public class TestJavaCollection1 {  
    public static void main(String[] args) {  
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();  
        
        // Adding objects to the ArrayList
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        
        // Traversing the list through an Iterator
        Iterator<String> itr = list.iterator();  
        while (itr.hasNext()) {  
            System.out.println(itr.next());  
        }  
    }  
}
