package exercise2;

import java.util.*;

public class Matrix {

	public void sizeMatrix() {
		System.out.println("Digite os Valores A B C D para geração das matrizes: ");
		Scanner readMatrixSize = new Scanner(System.in);
		int a = readMatrixSize.nextInt();
		int b = readMatrixSize.nextInt();
		int c = readMatrixSize.nextInt();
		int d = readMatrixSize.nextInt();
			//cria as matrizes
		int[][] matrix = new int[a][b];
		int[][] matrixTwo = new int[c][d];
		Scanner readMatrixNumber = new Scanner(System.in);
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println("Digite o valor na posição [" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
				matrix[i][j] = readMatrixNumber.nextInt();
			}

		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				System.out.println("Digite o valor na posição [" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
				matrixTwo[i][j] = readMatrixNumber.nextInt();
			}

		}
		
		System.out.println("Diagonal principal da primeira matriz: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == j) {
					System.out.print("" + matrix[i][j] + "] ");
				}

				else {
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}

		System.out.println("Diagonal secundária da primeira matriz: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (j == (a - 1 - i)) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(" * ");
				}

			}
			System.out.print(" \n ");
		}

		System.out.println("Diagonal principal da segunda matriz: ");
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				if (i == j) {
					System.out.print(matrixTwo[i][j]);
				} else {
					System.out.print(" * ");
				}
			}
			System.out.print(" \n ");
		}

		System.out.println("Diagonal secundária da segunda matriz: ");
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				if (j == (c - 1 - i)) {
					System.out.print(matrixTwo[i][j]);
				} else {
					System.out.print(" * ");
				}

			}
			System.out.print(" \n ");
		}

		int[][] matrixTrans = new int[b][a];

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				matrixTrans[i][j] = matrix[j][i];
			}
		}
		System.out.println("Matriz Transposta de AxB: ");
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(matrixTwo[i][j]);
			}
			System.out.print("\n");
		}

		int[][] matrixTransTwo = new int[d][c];

		for (int i = 0; i < d; i++) {
			for (int j = 0; j < c; j++) {
				matrixTransTwo[i][j] = matrixTwo[j][i];
			}
			System.out.print("\n");
		}
		System.out.println("Matriz Transposta de CxD: ");
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrixTransTwo[i][j]);
			}
			System.out.print("\n");
		}

		int[][] matrixSum = new int[a][b];
		if ((a == c) && (b == d)) {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					matrixSum[i][j] = matrix[i][j] + matrixTwo[i][j];
				}
			}
		} else {
			System.out.println("Não é possivel realizar a soma pois são de ordens diferentes. ");
		}

		System.out.println("Soma das matrizes AxB e CxD: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(matrixSum[i][j]);
			}
			System.out.print("\n");
		}
		
		
		int[][] matrixMulti = new int[a][d];
		if (b == c) {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < d; j++) {
					for (int k = 0; k < b; k++) {
						matrixMulti[i][k] += matrix[i][k] * matrixTwo[k][j];
					}

				}
			}
		}
		else {
			System.out.println("não é possivel realizar a multiplicação");
		}
			System.out.println("Multiplicação das matrizes AxB e CxD: ");
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < d; j++) {
					System.out.print(matrixMulti[i][j]);
				}
				System.out.print("\n");
			}

		}

	}


