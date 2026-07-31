// //Type 1
import java.util.Scanner;

class program89
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter Number:");
         iValue = sobj.nextInt();

         if(iValue % 3 == 0 && iValue % 5 == 0)
         {
            System.out.println("Number is divisible by 3 ans 5");
         }
         else
         {
            System.out.println("number is not divisible by 3 and 5");
         }
    }    
}
