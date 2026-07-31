
import java.util.Scanner;

class NumberX
{
    public void  SumFactors(int iNo)
    {
        int iCnt = 0 ;
        int iSum = 0 ;

        for( iCnt=1 ; iCnt <= (iNo / 2) ; iCnt++)
        {
            if(iNo % iCnt ==0)
            {
                iSum = iSum + iCnt;

            }
        }
        System.out.println("Sumation of factors is : "+iSum);
    }
}
class program98
{
    public static void main(String args [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0;

        System.out.println("enter a number: ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);  
     }
}
