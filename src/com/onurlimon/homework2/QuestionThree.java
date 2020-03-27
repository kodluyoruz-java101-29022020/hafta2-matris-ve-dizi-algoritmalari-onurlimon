package com.onurlimon.homework2;

public class QuestionThree {
	
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
	
	public static int[][] multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice) {

		int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];

		for (int i = 0; i < firstMatrice.length; i++) {

			for (int j = 0; j < secondMatrice[0].length; j++) {

				for (int k = 0; k < firstMatrice[0].length; k++) {

					resultMatrice[i][j] += firstMatrice[i][k] * secondMatrice[k][j];
				}

			}

		}

		return resultMatrice;
	}

	public static void main(String[] args) {

		int[][] matrix1 = fillMatrix(2, 2, 10);
		int[][] matrix2 = fillMatrix(2, 2, 10);
		
		printMatrix(matrix1);
		System.out.println();
		printMatrix(matrix2);
		System.out.println();
		
		int[][] multiplyResultMatrice  = multiplyMatrices(matrix1, matrix2);
		
		printMatrix(multiplyResultMatrice);
		
		
		
	}
}
