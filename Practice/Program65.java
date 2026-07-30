import java.util.Scanner;

class Program65
{
   public static void Display(int iNo)
    {
        int iCnt = 0;

        // Iteraion
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...!");
        }
    }
    public static void main(String arg[])
    {
        int iCnt = 0;
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Fequency: ");
        iValue = sobj.nextInt();
        
        Display(iValue);

    }
}