import java.util.Scanner;

class Program177
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iArr[]={10, 20, 30, 40, 50};

        System.out.println(iArr.length);

        // Bad Programming practice
        for(int icnt = 0; icnt < iArr.length; icnt++)
        {
            System.out.println(iArr[icnt]);
        }
        
        System.out.println(iCnt);  // Error

    }
}