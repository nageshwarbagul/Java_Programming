import java.util.Scanner;

class Program66
{
   static void Display(int iNo)
    {
        int iCnt = 0;
        
        // Updator
        if(iNo < 0)
        {
            iNo = -iNo;
        }

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