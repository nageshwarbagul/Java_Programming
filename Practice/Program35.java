import java.util.Scanner;
class Program35
{
    public static void main(String A[])
    {
        int i,j,k;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter firts number :");
        i = sobj.nextInt();

        System.out.println("Enter second number");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is : "+ k);

    }

}