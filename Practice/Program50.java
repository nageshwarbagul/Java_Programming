import java.util.Scanner;

class NumberX
{
    public int CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;
        iRemainder = iNo % 2;
        
        return iRemainder;
    }
}

class Program50
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter Number to check  it is Even or Odd  :");
        iValue = sobj.nextInt();

        iRet = nobj.CheckEvenOdd(iValue);

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