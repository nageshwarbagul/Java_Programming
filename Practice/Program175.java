import java.util.Scanner;

class Program175
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iArr[] = {10, 20, 30, 40, 50};

        int icnt = 0;

        System.out.println(iArr.length);

        for(icnt = 0; icnt < iArr.length; icnt++)
        {
            System.out.println(iArr[icnt]);
        }
    }
}