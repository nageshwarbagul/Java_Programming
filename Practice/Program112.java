import java.util.Scanner;
class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                break;
            }  
        }
        if(iCnt < (iNo / 2))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
class program112
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int ivalue = 0;
        boolean bRet = false;

        System.out.println("Enter number :" );
        ivalue = sobj.nextInt();

        NumberX nobj = new NumberX();
        
        bRet = nobj.CheckPrime(ivalue);
        if(bRet == true)
        {
            System.out.println("It is prime ");
        }
        else
        {
            System.out.println(" It is not prime ");
        }
    }
}

// Time Complexity : O(N/2)
// Where N >= 0