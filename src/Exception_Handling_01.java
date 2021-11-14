import java.util.Scanner;

public class Exception_Handling_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array");
        int a = s.nextInt();
        int arr[] = new int[a];

        try
        {
            System.out.println("Enter the elements in the array");
            for (var i=0;i< arr.length;i++)
            {
                arr[i] = s.nextInt();
            }

            System.out.println("Enter the element of the array that you want to access");
            int index = s.nextInt();

            System.out.println("Array element at the index "+index+" = "+arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch (ArithmeticException | NumberFormatException obj)
        {
            System.out.println(obj.getCause());
        }
        System.out.println("End of program.");

    }
}
