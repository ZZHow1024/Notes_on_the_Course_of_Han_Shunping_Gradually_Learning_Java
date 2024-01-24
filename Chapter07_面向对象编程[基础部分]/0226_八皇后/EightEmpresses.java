//DNX写于2024年1月23日
public class EightEmpresses
{
	public static void main(String[] args)
	{
		//案例：八皇后
		int[][] map = new int[8][8];
		Empresses myEmpresses = new Empresses();

		myEmpresses.findBlock(map, 0);
	}
}

class Empresses
{
	int count = 0;

	public void findBlock(int[][] map, int i)
	{
		if(i == 8)
		{
			printMap(map);
		}
		else
		{
			for(int k = 0; k <= 7; k++)
			{
				if(isOk(map, i, k))
				{
					map[i][k] = 1;
					findBlock(map, i+1);
					map[i][k] = 0;
				}
			}
		}
	}

	public boolean isOk(int[][] map, int i, int j)
	{
		boolean pass = true;
		int x;
		int y;

		for(int k = 0; k < 8; k++)
		{
			if(map[i][k] == 1 && k != j)
			{
				pass = false;
			}
			if(map[k][j] == 1 && k != i)
			{
				pass = false;
			}
		}

		x = i;
		y = j;
		while(++x <= 7 && ++y <= 7)
		{
			if(map[x][y] == 1)
			{
				pass = false;
			}
		}

		x = i;
		y = j;
		while(--x >= 0 && --y >= 0)
		{	
			if(map[x][y] == 1)
			{
				pass = false;
			}
		}

		x = i;
		y = j;
		while(++x <= 7 && --y >= 0)
		{	
			if(map[x][y] == 1)
			{
				pass = false;
			}
		}

		x = i;
		y = j;
		while(--x >= 0 && ++y <= 7)
		{	
			if(map[x][y] == 1)
			{
				pass = false;
			}
		}

		return pass;
	}

	public void printMap(int[][] map)
	{
		++count;
		System.out.println("  ===Map" + count + "===");
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[i].length; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}