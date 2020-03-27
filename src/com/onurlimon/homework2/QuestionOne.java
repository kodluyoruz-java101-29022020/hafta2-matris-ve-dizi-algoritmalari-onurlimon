package com.onurlimon.homework2;

import java.util.Random;

public class QuestionOne {

	// Canlý ve ölü hücre kýsmýnda 'aþýrý' static bir kontrol yapabildim ama doðru
	// deðildi ve zaten hoþ olmadý o yüzden kaldýrdým. Tekrar deneyeceðim.
	// Dinamik bir kontrol için sizin kodunuzu incelemeyi çok isterim :)

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
