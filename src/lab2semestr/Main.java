package lab2semestr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	 private static int count = 0;
	 
	    private static void dfs(ArrayList<Integer>[] adj, boolean[] was, int v) {
	        count++;
	        System.out.print("V" + (v + 1) + " ");
	        for (int e: adj[v]) {
	            if (!was[e]) {
	                was[e] = true;
	                dfs(adj, was, e);
	            }
	        }
	    }
	 
	    private static void dfs(ArrayList<Integer>[] adj, int v) {
	        boolean[] was = new boolean[adj.length];
	        was[v] = true;
	        dfs(adj, was, v);
	    }
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int v = scanner.nextInt() - 1;
	        ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[n];
	        for (int i = 0; i < n; i++) {
	            adj[i] = new ArrayList<>();
	            for (int j = 0; j < n; j++) {
	                int d = scanner.nextInt();
	                if (d == 1) {
	                    adj[i].add(j);
	                }
	            }
	        }
	        dfs(adj, v);
	        System.out.println();
	        System.out.println(count);
	    }

}
