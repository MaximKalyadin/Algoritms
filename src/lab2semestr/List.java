package lab2semestr;
public class List {
	static Node head;
	public List() {
		head = null;
	}	
	public static void afterhead(Node Name) {
		if (head == null) {
			head = Name;
		} else {
			Node i = head;
			while (i.next != null) {
				i = i.next;
			}
			i.next = Name;
		}
	}
	public static String Out() {
		String out = "";
		Node i = head;
		
		while(i != null) {
			out = out + i.name  + "\n";
			i= i.next;
		}
		System.out.println(out);
		return out;
	}
	
	
}
