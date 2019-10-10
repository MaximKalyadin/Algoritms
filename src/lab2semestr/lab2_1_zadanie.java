package lab2semestr;

import java.util.Scanner;

public class lab2_1_zadanie {
	static int n = 2;
	static int m =5;
	static int [][] mass = new int [n][m];
	
	public static void vvod() {
		System.out.println("введите массу по порядку");
		int k =0;
		for (int i = 0 ; i < n; i++) {
			for (int j = 0; j < m ; j++) {				
				Scanner sc = new Scanner(System.in);
				try {
					mass[i][j] = sc.nextInt();
				} catch(Exception e) {
					System.out.println("ошибка");
					}
			}
			if (k == 0) {
				System.out.println("введите стоимость по порядку");
			}
			k++;
		}
	}
	
	public static int Imlement() {
		int W = 0;
		System.out.println("введите ограничение по массе");
		Scanner s = new Scanner(System.in);
		try {
			W = s.nextInt();
		} catch(Exception e) {
			System.out.println("ошибка");
			}
		for (int i = 0 ; i < n; i++) {
			for (int j = 1; j < m ; j++) {
				if (mass[1][j] > mass[1][j-1] ) {
					for (int y = 0; y < n; y++) {
						int t = mass[y][j];
						mass[y][j] = mass[y][j-1];
						mass[y][j-1] = t;
					}
				}
			}
		}
		int Velue = 0;
		int massa = 0;
		for (int i = 0; i < m; i++) {
			if (massa + mass[0][i] <= W) {
				Velue += mass[1][i];
				massa += mass[0][i];
			}
		}
		System.out.println("Вывод");
		return Velue;
	}
}
