import java.util.Scanner;

class Program48
{
    public static int CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;
        iRemainder = iNo % 2;
        
        return iRemainder;
    }
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = CheckEvenOdd(iValue);

        if(iRet == 0)
        {
            System.out.println(iValue +" " + "Number is Even");
        }
        else
        {
            System.out.println(iValue +" " + "Number is Even");
        }
    }
}