// Input :  5
// Output : *   #   *   #   *   #   *   #   *   #

import java.util.Scanner;

class Program210
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*"+"\t#\t");
        }
        System.out.println();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of Element :");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}