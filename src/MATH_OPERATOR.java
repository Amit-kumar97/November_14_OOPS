class MATH_OPERATOR
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum=0;
        try
        {
            for (var i=0;i< arr.length;i++)
            {
                arr[i] = Integer.parseInt(args[i]);
            }
            for (var j=0;j<arr.length;j++)
            {
                System.out.println(arr[j]);
                sum = sum + arr[j];
            }
            System.out.println(sum);
            System.out.println(sum/(arr.length));
        }
        catch (ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }
        finally {
            System.out.println("End of program.");
        }
    }
}
