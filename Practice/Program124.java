 import java.util.Scanner;
class DigitX
{
    public int CountOddDigit(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit  % 2 != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;   
        }
        return iCount;
    }
    
}
class program124
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;
        
        System.out.println("Enter number");
        iValue = sobj.nextInt();

       iRet = dobj.CountOddDigit(iValue);
       
       System.out.println("number of odd digit are :" + iRet);
    }
}