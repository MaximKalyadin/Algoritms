package lab2semestr;

import java.util.Scanner;

public class lab3_3_zadanie {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		 
        int n;
        n = input.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = input.nextInt();
            }
        }
 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(j != k && matrix[j][i] != -1 && matrix[i][k] != -1){
                        if(matrix[j][k] == -1) {
                            matrix[j][k] = matrix[j][i] + matrix[i][k];
                        }
                        else {
                            matrix[j][k] = Math.min(matrix[j][k], matrix[j][i] + matrix[i][k]);
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            	System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            	if (matrix[i][j] > 0) {
            		System.out.println("Кратчайший путь из " + (i + 1) +  " в " + (j + 1) + " = " + matrix[i][j]);
            	}
            }
        }
	}
}
