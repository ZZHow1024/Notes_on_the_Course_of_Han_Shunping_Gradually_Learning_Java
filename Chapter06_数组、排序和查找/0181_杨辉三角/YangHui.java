//DNX写于2024年1月21日
public class YangHui
{
	public static void main(String[] args)
	{
		/*
		案例：使用二维数组打印一个10行杨辉三角。  
	    1    
	    1 1    
	    1 2 1   
	    1 3 3 1  
	    1 4 6 4 1  
	    ……
	    规律：
	    1. 第一行有1个元素，第 n 行有 n 个元素。
	    2. 每一行的第一个元素和最后一个元素都是 1。
	    3. 从第三行开始，对于非第一个元素和最后一个元素的元素的值arr[i]lj]。
	        arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
        */

		int[][] yangHui = new int[10][];

		for(int i = 0; i < yangHui.length; i++)
		{
			yangHui[i] = new int[i+1];

			for(int j = 0; j < yangHui[i].length; j++)
			{
				if(j == 0 || j == (yangHui[i].length - 1))
				{
					yangHui[i][j] = 1;
				}
				else
				{
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}

		for(int i = 0; i < yangHui.length; i++)
		{
			for(int j = 0; j < yangHui[i].length; j++)
			{
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}