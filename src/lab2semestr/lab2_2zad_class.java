package lab2semestr;

import java.util.Arrays;
import java.util.Scanner;

public class lab2_2zad_class {
	static int [] mass;
	static int n;
	
	public static void vvod() {
		System.out.println("введите количество матриц");
		Scanner sc = new Scanner(System.in);
		try {
			n = sc.nextInt();
		} catch(Exception e) {
			System.out.println("ошибка");
			}
		System.out.println("введите размерность матрицы (Например 34 т.е. матрица размерностью 3х4");
		mass = new int [n+1];
		int k=0;
		for (int i = 0; i < n; i++) {
			Scanner sc1 = new Scanner(System.in);
			try {
				mass[i] = sc1.nextInt();
			} catch(Exception e) {
				System.out.println("ошибка");
				}
		}
		for (int i = 0; i < n; i++) {			
			if (k == n-1) {
				mass[i+1] = mass [i] % 10;
			}
			mass[i] = mass[i] / 10;
			k++;
		}
		System.out.println(Arrays.toString(mass));
		System.out.println("минимальное количество операций");
		System.out.println(multiplyOrder());
	}
	public static int multiplyOrder() {
		int dlina = mass.length - 1;
		int[][] dvmass = new int[dlina + 1][dlina + 1];
		for (int l = 2; l <= dlina; l++) {
			for (int i = 1; i <= dlina - l + 1; i++) {
				int j = i + l - 1;
				dvmass[i][j] = Integer.MAX_VALUE;
				for (int k = i; k <= j - 1; k++) {
					dvmass[i][j] = Math.min(dvmass[i][j],dvmass[i][k] + dvmass[k + 1][j] + mass[i - 1] * mass[k] * mass[j]);
				}
			}
		}
		return dvmass[1][dlina]; 
	}
}
