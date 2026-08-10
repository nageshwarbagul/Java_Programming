import java.util.Scanner;

class program180
{
   public static int Summation(int Arr[])
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        
        return iSum;    
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter the number of elements :");
        int  iLenght = sobj.nextInt();

        // Brr = (int *) malloc(sizeof(int) * iLenght);
        int Brr[] = new int [iLenght];

        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Element of the array are :");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        int iRet = Summation(Brr);

        System.out.println("Summation is :" + iRet);
        
        Brr = null;
        System.gc();
    }
}