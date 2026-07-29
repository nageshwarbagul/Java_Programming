import java.util.Scanner;

class Program46
{
   static void CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;
        if(iRemainder == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
    public static void main(String A[])
    {
        int iValue = 0;
        
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        CheckEvenOdd(iValue); // error --> solve
    }
}