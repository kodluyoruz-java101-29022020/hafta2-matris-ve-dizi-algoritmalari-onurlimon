package com.onurlimon.homework2;

import java.util.ArrayList;

public class QuestionFour {

	public static int[] fillArray(int size) {

		int[] myArray = new int[size];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);
		}

		return myArray;
	}

	public static int[] printArray(int[] array) {

		System.out.print("My array => ");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		return array;
	}

	public static void findSameElement(int[] array) {

		ArrayList<Integer> sameElements = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					System.out.println("Repetitive Number : " + array[i]);
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] myArray = fillArray(5);

		printArray(myArray);
		System.out.println();
		findSameElement(myArray);
	}

}
