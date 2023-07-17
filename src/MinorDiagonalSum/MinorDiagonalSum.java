package MinorDiagonalSum;

import java.util.Scanner;

public class MinorDiagonalSum {
	
	public static int minorDiagonalSum(int[][] mat)
	{
		int i=0;
		int j=mat.length-1;
		int sum =0;
		while(i<mat.length && j>=0)
		{
			sum += mat[i][j];
			i++;
			j--;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] mat = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 mat[i][j] = scan.nextInt();
			}
		}
		int result = minorDiagonalSum(mat);
		System.out.println(result);

	}

}
