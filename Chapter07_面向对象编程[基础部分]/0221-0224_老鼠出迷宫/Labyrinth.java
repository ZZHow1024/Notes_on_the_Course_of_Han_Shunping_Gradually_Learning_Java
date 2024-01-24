//DNX写于2024年1月23日
public class Labyrinth
{
	public static void main(String[] args)
	{
		/*
		案例：老鼠出迷宫。
		分析：
		1. 创建迷宫，用二维数组 map 表示。
		2. 规定 map 数组中0表示可以走，1表示障碍物。
		*/

		int[][] map1 = new int[8][7];
		D t = new D();

		//输出起始地图。
		t.setMap(map1);
		System.out.println("==起始地图==");
		t.printMap(map1);

		//使用findWay1给老鼠找路。
		System.out.println("==找路策略1：下 -> 右 -> 上 -> 左==");
		t.findWay1(map1, 1, 1);
		t.printMap(map1);

		//使用findWay1测试回溯现象。
		int[][] mapA = new int[8][7];

		t.setMap(mapA);
		mapA[2][2] = 1;
		System.out.println("==找路策略1的回溯现象==");
		t.findWay1(mapA, 1, 1);
		t.printMap(mapA);

		//使用findWay2给老鼠找路。
		int[][] map2 = new int[8][7];

		t.setMap(map2);
		System.out.println("==找路策略2：上 -> 右 -> 下 -> 左==");
		t.findWay2(map2, 1, 1);
		t.printMap(map2);
	}
}

class D
{
	//初始化地图。
	public void setMap(int[][] map)
	{
		//3. 将最上面一行和最下面一行全部设置为1（设置围墙）。
		for(int i = 0; i < 7; i++)
		{
			map[0][i] = 1;
			map[7][i] = 1;
		}

		//4. 将最左面一列和最右面一列全部设置为1（设置围墙）。
		for(int i = 1; i < 7; i++)
		{
			map[i][0] = 1;
			map[i][6] = 1;
		}

		//5. 设置障碍物（3,1）,(3,2)。
		map[3][1] = 1;
		map[3][2] = 1;
	}

	/*
	使用递归思想：
	1. findWay方法就是专门用来找出迷宫路径的。
	2. 如果找到返回true，否则返回false。
	3. map 就是二维数组，即表示迷宫。
	4. (i,j)就是老鼠的位置，初始化位置为(1，1)。
	5. 递归找路，先规定map中0表示可以走，1表示障碍物，
		2表示可以走，3表示走过，但是走不通是死路。
	6. 当map[6][5] = 2 时说明找到通路，可以结束，否则就继续找。
	7. 先确定老鼠找路策略，下 -> 右 -> 上 -> 左。
	*/

	//找路策略1：下 -> 右 -> 上 -> 左
	public boolean findWay1(int[][] map, int i, int j)
	{
		if(map[6][5] == 2) // 已经找到。
		{
			return true;
		}
		else
		{
			if(map[i][j] == 0) // 0，可以走。
			{
				//先假定可以走通。
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通。
				if(findWay1(map, i+1, j)) // 向下探测。
				{
					return true;
				}
				else if(findWay1(map, i, j+1)) // 向右探测。
				{
					return true;
				}
				else if(findWay1(map, i-1, j)) // 向上探测。
				{
					return true;
				}
				else if(findWay1(map, i, j-1)) // 向左探测。
				{
					return true;
				}
				else
				{
					map[i][j] = 3;
					return false;
				}
			}
			else // 走不了或已经探测过了。
			{
				return false;
			}
		}
	}

	//找路策略2：上 -> 右 -> 下 -> 左
	public boolean findWay2(int[][] map, int i, int j)
	{
		if(map[6][5] == 2) // 已经找到。
		{
			return true;
		}
		else
		{
			if(map[i][j] == 0) // 0，可以走。
			{
				//先假定可以走通。
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通。
				if(findWay2(map, i-1, j)) // 向上探测。
				{
					return true;
				}
				else if(findWay2(map, i, j+1)) // 向右探测。
				{
					return true;
				}
				else if(findWay2(map, i+1, j)) // 向下探测。
				{
					return true;
				}
				else if(findWay2(map, i, j-1)) // 向左探测。
				{
					return true;
				}
				else
				{
					map[i][j] = 3;
					return false;
				}
			}
			else // 走不了或已经探测过了。
			{
				return false;
			}
		}
	}

	//打印地图。
	public void printMap(int[][] map)
	{
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