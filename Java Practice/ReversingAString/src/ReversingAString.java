import java.util.Scanner;

public class ReversingAString
{
    public static String reverse(String a)
    {
        String reverseString = "";
        for (int i = a.length() - 1; i >= 0; i--)
        {
            reverseString += a.charAt(i);
        }
        return reverseString;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        System.out.println(reverse(userString));


    }
}
