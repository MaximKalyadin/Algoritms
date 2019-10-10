package lab2semestr;

import java.util.ArrayList;
import java.util.Scanner;

public class lab3_2_zadanie {
		private static int vNum; // количество вершин
		private static int eNum; // количество ребер
		static boolean[][] graph; // матрица смежности
		static boolean[] used; // массив пометок
		static int count;
		
		public static void Input() {
			Scanner scanner = new Scanner(System.in);
	        vNum = scanner.nextInt();
	        eNum = scanner.nextInt();
	        int v = scanner.nextInt() - 1;
	        graph = new boolean[vNum][vNum];
	        for (int i = 0; i < vNum; i++) {
	        	for (int j = 0; j < vNum; j++) {
	        		graph[i][j] = scanner.nextBoolean();
	        	}
	        }
	        justDFS(v);
	        Output();
		}
		
		static void justDFS(int v) {
			used[v] = true; // помечаем вершину
			for (int nv = 0; nv < vNum; nv++) // перебираем вершины
			     if (!used[nv] && graph[v][nv]) { // если вершина не помечена, и смежна с текущей
			    	 count++;
			    	 justDFS(nv);// рекурсивно запускаем от нее DFS
			     }
		}
		
		public static int Output() {
			return count;
		}
	}
