package Collection;

import java.util.*;

public class QueueInterface {

public static void main(String[] args) {

Queue<String> queue = new LinkedList<>();

queue.add("Apple");

queue.add("Mango");

queue.add("Grapes");

queue.add("Banana");

System.out.println(queue);

queue.remove("Grapes");

System.out.println(queue);

System.out.println("Queue total Size: " + queue.size());

System.out.println("Queue includes fruit 'Apple'? : " + queue.contains("Apple"));

queue.clear();

}

}
