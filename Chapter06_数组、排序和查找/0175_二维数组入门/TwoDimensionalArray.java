//DNX写于2024年1月21日
public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
		/*
		案例：请用二维数组输出如下图形。   
	    0 0 0 0 0 0	    
	    0 0 1 0 0 0	    
	    0 2 0 3 0 0	
	    0 0 0 0 0 0
	    */

	    int[][] arr = {{0, 0, 0, 0, 0, 0},{0, 0, 1, 0, 0, 0},
	    				{0, 2, 0, 3, 0, 0},{0, 0, 0, 0, 0, 0}};

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}