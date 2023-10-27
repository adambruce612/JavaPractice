import java.util.Scanner;

public class SumAB
{
    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = input.nextInt();

        System.out.print("Enter integer b: ");
        int b = input.nextInt();

        System.out.println("The sum of a + b is " + sum(a,b));
    }

}
