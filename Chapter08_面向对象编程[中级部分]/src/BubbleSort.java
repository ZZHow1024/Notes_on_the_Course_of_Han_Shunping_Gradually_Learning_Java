//DNX写于2024年1月24日
public class BubbleSort
{
    public static void main(String[] args)
    {
        //案例：使用IDEA开发一个Java项目，创建一个类MyTools，编写一个方法，可以完成对int
        //数组冒泡排序的功能。
        MyTools mt = new MyTools();
        int[] arr = {10,-1,21,312,2};

        System.out.println("==排序前的arr==");
        mt.printArr(arr);

        mt.bubble(arr);

        System.out.println("==排序后的arr==");
        mt.printArr(arr);
    }
}

class MyTools
{
    public void bubble(int[] arr)
    {
        int temp;

        for (int i = 0; i < (arr.length - 1); i++)
        {
            for (int j = 0; j < (arr.length - i - 1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printArr(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + "  ");
        }
        System.out.println();
    }
}