import java.util.Scanner; // type 3

class Numberx
{
    public int SumFactors(int iNo)
    {
        int icnt =0 ;
        int iSum =0 ;

        for(icnt=1 ; icnt <= (iNo / 2) ; icnt++)
            {
                if(iNo % icnt ==0)
                {
                    iSum = iSum + icnt;
                }
            }
            return iSum;
        }
}

class program99
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;
        int iRet =0;

        System.out.println("Enter number");
        iValue=sobj.nextInt();

        Numberx nobj = new Numberx();

        iRet = nobj.SumFactors(iValue);
        System.out.println("Summation of factors is : "+iRet);
    }
}
// Time complexity : O(N/2)
// Where n >= 0