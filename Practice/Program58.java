import java.util.Scanner;
class TicketPrice 
{
    public int CalculateTicketPrice(int iAge)
    {
        // Input Filter
        if(iAge < 0)
        {
            return -1;
        }
        if(iAge >= 0 && iAge <= 5)
        {
            return 0;
        }
        else if(iAge >= 6 && iAge <= 18)
        {
            return 500;
        }
        else if(iAge >= 19 && iAge <= 50)
        {
            return 900;
        }
        else
        {
            return 400;
        }
    }
}
class Program58
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        TicketPrice tobj = new TicketPrice ();

        System.out.println("Please enter your age to calculate ticket prices : ");
        iValue = sobj.nextInt();

        iRet = tobj.CalculateTicketPrice(iValue);
        
        if(iRet == -1)
        {
            System.out.println("Please enter positive Age :");
        }
        else
        {
          System.out.println("Your ticket price will be"+" "+ iRet+" "+"ruppes\n");
        }
    }
}