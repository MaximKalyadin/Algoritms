package lab2semestr;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import com.sun.javafx.collections.MappingChange.Map;

public class lab6Collections {
	
	public static void CollQueue() { //очередь при помощи коллекции  LinkedList
		Queue<String> queue = new LinkedList<>();
		queue.add("банан");
		queue.add("яблоко");
		queue.add("ананас");
		while (queue.isEmpty()) { 
		    System.out.println(queue.poll());
		}
		
		queue.remove("банан");
		
		while (queue.isEmpty()) { 
		    System.out.println(queue.poll());
		}
		
		
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Barsik");
		linkedList.add("Murzik");
		linkedList.add("Ryzhik");
		/*Iterator<String> iterator = linkedList.iterator();
		String firstCat = iterator.next();
		String secondCat = iterator.next(); */
		
		 System.out.println(linkedList);
		 
		 linkedList.remove(1);
		 System.out.println(linkedList);
		 
	}
	
	/*public static void CollStack() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while (!stack.empty()) {
		    System.out.println(stack.pop());
		}
	}
	
	public static void CollDek() {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while (!stack.isEmpty()) {
		    System.out.println(stack.pop());
		}
	}*/
	
	public static void CollSet() {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("яблоко");
		hashSet.add("яблоко"); // дубль
		hashSet.add("ананас");
		hashSet.add("банан");
		System.out.println(hashSet);
		
		
		HashSet<String> h = new HashSet<String>();

        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");

        System.out.println(h);
        System.out.println("List contains India or not:" + h.contains("India"));

        h.remove("Australia");
        System.out.println("List after removing Australia:"+h);

        
        
        
        
        
		
		/*Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("яблоко");
		linkedHashSet.add("яблоко");
		linkedHashSet.add("ананас");
		linkedHashSet.add("банан");
		System.out.println(linkedHashSet);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("яблоко");
		treeSet.add("яблоко");
		treeSet.add("ананас");
		treeSet.add("банан");
		System.out.println(treeSet);*/
		
		
		
		

        HashMap<String, String> myHashMap = new HashMap<String, String>();
 
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        
        String lidiaName = myHashMap.get("Basil");
        System.out.println(lidiaName);
        
        myHashMap.remove("Basil");
        
        System.out.println(lidiaName);
	}
	
	
}
