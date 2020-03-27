package com.onurlimon.homework2;

import java.util.Random;

public class QuestionOne {

	// Canl� ve �l� h�cre k�sm�nda 'a��r�' static bir kontrol yapabildim ama do�ru
	// de�ildi ve zaten ho� olmad� o y�zden kald�rd�m. Tekrar deneyece�im.
	// Dinamik bir kontrol i�in sizin kodunuzu incelemeyi �ok isterim :)

	public static int[][] fillMatrix(int rowCount, int columnCount, int size) {

		int[][] matrix = new int[rowCount][columnCount];

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = (int) (Math.random() * size);
			}
		}

		return matrix;
	}

	public static int[][] printMatrix(int[][] matrix) {

		for (int[] row : matrix) {
			System.out.println();
			for (int cell : row) {

				System.out.print(cell + " ");
			}
		}

		return matrix;

	}

	public static void main(String[] args) {

		int[][] myMatrix = fillMatrix(5, 5, 2);
		printMatrix(myMatrix);
	}

}
