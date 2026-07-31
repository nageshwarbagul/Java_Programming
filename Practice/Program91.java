// Type 2
import java.util.Scanner;

class program91
{
    static void CheckDivisible(int iNo)           
    {
         if((iNo % 3 == 0) && (iNo % 5 == 0))
         {
            System.out.println("Number is divisible by 3 ans 5");
         }
         else
         {
            System.out.println("number is not divisible by 3 and 5");
         }
        
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter Number:");
         iValue = sobj. nextInt();

         CheckDivisible(iValue);

        
    }
    
}
