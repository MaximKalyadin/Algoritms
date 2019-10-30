package lab2semestr;

public class MainHash {
	public static void main(String[] args) {
		HashM hashmap = new HashM();
		hashmap.Put(3, 1);
		hashmap.Put(4, 2);
		hashmap.Put(5, 3);
		hashmap.Put(6, 4);
		hashmap.Put(16, 5);
		hashmap.Put(25, 6);
		hashmap.Put(15, 7);
		hashmap.Put(35, 8);
		
		hashmap.Get(6);
	}
}
