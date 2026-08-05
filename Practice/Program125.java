import java.util.Scanner;

class DigitX
{
    public void CountEvenOddDigit(int iNo)
    {
        int iDigit = 0;
        int iCountEven = 0, iCountOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
            iNo = iNo / 10;
        }
        System.out.println("Number of Even digit : "+ iCountEven);
        System.out.println("Number of Even digit : "+ iCountOdd);
    }
}
class program125
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         DigitX nobj = new DigitX();
        
        int iValue = 0;
        
        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        nobj.CountEvenOddDigit(iValue);
    }
}
