package lab2semestr;

public class HashMap {
	private final static int TABLE_SIZE = 10;
    LinkedHashEntry[] table;

   public HashMap() {
          table = new LinkedHashEntry[TABLE_SIZE];
          for (int i = 0; i < TABLE_SIZE; i++) {
                table[i] = null;
          }
    }

    public void get(int key) {
          int hash = (key % TABLE_SIZE);
          if (table[hash] == null) {
                System.out.println(-1);
          }
          else {
        	  String n = "";
        	  LinkedHashEntry entry = table[hash];
        	  while (entry != null) {
        		  n += entry.getValue() + "\n";
        		  entry = entry.getNext();
        	  }
        	  System.out.println(n);
          }
    }

    public void put(int key, int value) {
          int hash = (key % TABLE_SIZE);
          if (table[hash] == null)
                table[hash] = new LinkedHashEntry(key, value);
          else {
                LinkedHashEntry entry = table[hash];
                while (entry.getNext() != null) {
    				entry = entry.getNext();
    			}
                entry.setNext(new LinkedHashEntry(key, value));
               
          }
    }

    public void remove(int key) {
          int hash = (key % TABLE_SIZE);
          if (table[hash] != null) {
                LinkedHashEntry prevEntry = null;
                LinkedHashEntry entry = table[hash];
                while (entry.getNext() != null && entry.getKey() != key) {
                      prevEntry = entry;
                      entry = entry.getNext();
                }
                if (entry.getKey() == key) {
                      if (prevEntry == null)
                    	  table[hash] = entry.getNext();
                      else
                           prevEntry.setNext(entry.getNext());
                }
          }
    }
}
