/*
    Algorithm : Addition of 2 numbers

    START
         Accept first number as no1;
         Accept second number as no2;
         Perform addition of no1 nad no2
         Display the result

    STOP
*/
import java.util.Scanner;
class Program37
{
    public static void main(String A[])
    {

        // Variable creation with default values
        float i =0.0f,j =0.0f,k =0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter firts number :");
        i = sobj.nextFloat();

        System.out.println("Enter second number");
        j = sobj.nextFloat();

        k = i + j;

        System.out.println("Addition is : "+ k);

    }

}