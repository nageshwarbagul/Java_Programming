import java.util.Scanner;

class Program64
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...!");
        }
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Fequency: ");
        iValue = sobj.nextInt();

        Display(iValue);  //Error

    }
}