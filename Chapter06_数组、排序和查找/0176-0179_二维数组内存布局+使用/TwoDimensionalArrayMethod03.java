//DNX写于2024年1月21日
public class TwoDimensionalArrayMethod03
{
	public static void main(String[] args)
	{
		/*
		案例：动态创建下面的二维数组并输出。
    	1    
    	2 2  
    	3 3 3
    	*/

    	int[][] arr = new int[3][];
    	for(int i = 0; i < arr.length; i++)
    	{
    		arr[i] = new int[i + 1];

    		for(int j = 0; j < arr[i].length; j++)
    		{
    			arr[i][j] = i + 1;
    		}
    	}

    	System.out.println("==arr中的元素==");
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