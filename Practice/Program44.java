/*
    START
        accept number as No 
        if No is completely divisible by 2
            then print Even
        otherwise
            print as Odd
    STOP

    START 
        accept number as No
        Divide No by 2
        if remainder is 0
            then print as Even
        otherwise
            print as  Odd
    STOP
*/
import java.util.Scanner;

class Program44
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRemainder = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRemainder = iValue % 2;
        
        if(iRemainder == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}