import java.util.Scanner;

class program178
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter the number of elements :");
        int iLenght = sobj.nextInt();

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
    }
}