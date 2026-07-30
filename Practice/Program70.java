import java.util.Scanner;

class Program70
{
   static void Display(int iNo)
    {
        int iCnt = 0;
        
        // filter
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Fequency: ");
        iValue = sobj.nextInt();
        
        Display(iValue);

    }
}