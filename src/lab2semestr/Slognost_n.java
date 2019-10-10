package lab2semestr;

import java.util.Scanner;

public class Slognost_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int [] mass = new int [n];
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			try {
				mass[i] = sc.nextInt();
			} catch(Exception e) {
				System.out.println("ошибка");
				}
		}
		int max = mass[0];
		for (int i = 0; i < n; i++) {
			if(mass[i] > max) {
				max = mass[i];
			}
		}
		System.out.println(max);
	}

}
