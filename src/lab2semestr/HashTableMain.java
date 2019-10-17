package lab2semestr;

public class HashTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hashTable = new HashTable(97);
		 
		hashTable.insert("rhino");
		hashTable.insert("man");
		hashTable.insert("computer");
		hashTable.insert("home");
		hashTable.insert("basket");
		 
		hashTable.print();
		Item item = hashTable.find("manm");
 
		if(item != null)
			System.out.println("Элемент найден!");
		else
			System.out.println("Элемент не найден!");
	}

}
