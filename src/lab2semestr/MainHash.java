package lab2semestr;

public class MainHash {
	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put(3, 1);
		hashmap.put(4, 2);
		hashmap.put(5, 3);
		hashmap.put(6, 4);
		hashmap.put(6, 5);
		hashmap.put(5, 6);
		hashmap.put(5, 7);
		hashmap.put(5, 8);
		
		hashmap.get(3);
	}
}
