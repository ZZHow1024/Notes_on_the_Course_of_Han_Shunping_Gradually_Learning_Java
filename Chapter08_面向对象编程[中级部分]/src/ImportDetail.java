import java.util.Arrays;

//ZZHow写于2024年1月24日
public class ImportDetail {

    public static void main(String[] args)
    {
        //案例：用系统提供的Arrays完成数组排序。
        int[] arr = new int[]{43, 543, -12, 3, 54};
        System.out.println("==排序前==");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        Arrays.sort(arr);

        System.out.println("\n==排序后==");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}