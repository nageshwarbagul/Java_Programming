import java.util.Scanner;

class Program63
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Fequency: ");
        iValue = sobj.nextInt();

        // Iteraion
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println("Jay Ganesh...!");
        }
        
    }
}