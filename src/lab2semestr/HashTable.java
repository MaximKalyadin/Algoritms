package lab2semestr;

public class HashTable {
    private static Item[] table;
    private int count;
    private static int size;
 
    public HashTable(int size)
    {
        this.size = size;
        table = new Item[size];
    }
    
    private static int hash(String key)
    {
      int hash = 0;
 
      for(int i = 0; i < key.length(); i++)
         hash = (31 * hash + key.charAt(i)) % size;
 
      return hash;
    }
    
    static void insert(String key)
    {
        Item item = new Item(key);
        int hash = hash(key);
        while(table[hash] != null)
        {
            hash++;
            hash %= size;
        }
        table[hash] = item;
    }
    
    public void print()
    {
        for(int i = 0; i < size; i++)
            if(table[i] != null)
                System.out.println(i + " " + table[i].getKey());
    }
    public Item find(String key)
    {
        int hash = hash(key);
        while(table[hash] != null)
        {
            if(table[hash].getKey().equals(key))
                return table[hash];
            hash++;
            hash = hash % size;
        }
        
        return null;
    }
}
