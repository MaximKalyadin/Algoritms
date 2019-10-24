package lab2semestr;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import com.sun.javafx.collections.MappingChange.Map;

public class lab6Collections {
	
	public void CollQueue() { //очередь при помощи коллекции  LinkedList
		Queue<String> queue = new LinkedList<>();
		queue.add("банан");
		queue.add("яблоко");
		queue.add("ананас");
		while (queue.isEmpty()) { 
		    System.out.println(queue.poll());
		}
	}
	
	public void CollStack() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while (!stack.empty()) {
		    System.out.println(stack.pop());
		}
	}
	
	public void CollDek() {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		while (!stack.isEmpty()) {
		    System.out.println(stack.pop());
		}
	}
	
	public void CollSet() {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("яблоко");
		hashSet.add("яблоко"); // дубль
		hashSet.add("ананас");
		hashSet.add("банан");
		System.out.println(hashSet);
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
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
		System.out.println(treeSet);
	}
	
	
}
