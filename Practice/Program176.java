import java.util.Scanner;

class Program176
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iArr[] = {10, 20, 30, 40, 50};

        System.out.println(iArr.length);

        for(int icnt = 0; icnt < iArr.length; icnt++)    
        {
            System.out.println(iArr[icnt]);
        }
    }
}