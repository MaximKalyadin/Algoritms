package lab2semestr;

public class lab5Class {
	
    public static void moveRing(char a, char b, char c, int count) {
    	if (count==1){
		    System.out.println(String.format("from %s to %s",a,b));
	    }else {
		    moveRing(a, c, b, count - 1);
		    System.out.println(String.format("from %s to %s",a,b));
	        moveRing(c,b,a,count-1);
    	}

    }
}
