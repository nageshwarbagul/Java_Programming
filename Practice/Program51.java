import java.util.Scanner;

class NumberX
{
    public boolean CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;
        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program51
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean iRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter Number to check  it is Even or Odd  :");
        iValue = sobj.nextInt();

        iRet = nobj.CheckEvenOdd(iValue);

        if(iRet == true)
        {
            System.out.println(iValue +" " + "Number is Even");
        }
        else
        {
            System.out.println(iValue +" " + "Number is Even");
        }
    }
}