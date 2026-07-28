import java.util.Scanner;
class Program38
{
    public static void main(String A[])
    { 
        float iValue1 = 0;    // To Strored First input 
        float iValue2 = 0;    // To Stored second input
        float iResult = 0;   //  To stroed the Result 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter firts number :");
        iValue1 = sobj.nextFloat();

        System.out.println("Enter second number");
        iValue2 = sobj.nextFloat();

        iResult = iValue1 + iValue2;

        System.out.println("Addition is : "+ iResult);

    }

}