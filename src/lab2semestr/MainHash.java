package lab2semestr;

public class MainHash {
	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put(3, 1);
		hashmap.put(4, 2);
		hashmap.put(5, 3);
		hashmap.put(6, 4);
		hashmap.put(17, 5);
		hashmap.put(8, 6);
		hashmap.put(6, 7);
		hashmap.put(3, 8);
		
		System.out.println(hashmap.get(1));
	}
}
