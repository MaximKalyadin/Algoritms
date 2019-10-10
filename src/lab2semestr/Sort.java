package lab2semestr;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	static int n = 5;
	static int []mass = new int[n];
	
	public void Kolelementov() {
		Scanner sc = new Scanner(System.in);
		try {
			n = sc.nextInt();
		} catch(Exception e) {
			System.out.println("ошибка");
			}
	}
	
	public static void ZapolnenieMass() {
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			try {
				mass[i] = sc.nextInt();
			} catch(Exception e) {
				System.out.println("ошибка");
				}
		}
	}
	
	public static void Pyzir() {
		int chek = 0;
		while (chek < n) {
			for (int i = 0; i < n-1; i++) {
				if (mass[i] > mass[i+1]) {
					int t = mass[i+1];
					mass[i+1] = mass[i];
					mass[i] = t;
				}
			}
			chek++;
		}
	}
	
	public static void Vstavkami() {
		for (int i = 1; i < n; i++) {
			int k = mass[i];
			int j = i;
			while ((j>0)&&(mass[j-1]>k)) {
				mass[j] = mass[j-1];
				j--;
			}
			mass[j] = k;
		}
	}
	
	public static void StartSliyanie() {
		System.out.println(Arrays.toString(sort(mass)));
	}
	
	public static int[] sort(int[] mas){
		if(mas.length < 2) return mas;
		int seredina = mas.length / 2;
		int[] mas1 = Arrays.copyOfRange(mas, 0, seredina);
		int[] mas2 = Arrays.copyOfRange(mas, seredina, mas.length);
		return Alg(sort(mas1), sort(mas2));
	}
	
	public static int[] Alg(int[] mas1,int mas2[]){
		int dlina = mas1.length + mas2.length;
		int[] arr = new int[dlina];
		int i1=0;
		int i2=0;
		for(int i=0;i<dlina;i++){
			if(i1 == mas1.length){
				arr[i] = mas2[i2++];				
			}else if(i2 == mas2.length){
				arr[i] = mas1[i1++];
			}else{
				if(mas1[i1] < mas2[i2]){
					arr[i] = mas1[i1++];
				}else{
					arr[i] = mas2[i2++];
				}
			}
		}
		return arr;
	}
	
	public static void quick() {
		int start = 0;
		int end = n - 1;
		Rapid (start, end);
	}
	
	public static void Rapid(int start, int end) {
		if (start>=end) {
			return;
		}
		int i = start, j = end;
        int Opora = i - (i - j) / 2;
        while (i < j) {
            while (i < Opora && (mass[i] <= mass[Opora])) {
                i++;
            }
            while (j > Opora && (mass[Opora] <= mass[j])) {
                j--;
            }
            if (i < j) {
                int temp = mass[i];
                mass[i] = mass[j];
                mass[j] = temp;
                if (i == Opora) {
                	Opora = j;
                }
                else if (j == Opora) {
                	Opora = i;
                }
            }
        }
        Rapid(start, Opora);
        Rapid(Opora+1, end);
	}
	
	public static void Exit() {
		for (int i = 0; i < n; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println();
	}
	
}
