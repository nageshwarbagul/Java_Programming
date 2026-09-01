import java.util.*;
class StringX
{
    public int CountCapital(String str)
    {
        int i = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i]<= 'Z')
            {
                iCount++;
            }
        }

        return iCount;
    }  

    public int CountSmall(String str)
    {
        int i = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int CountDigit(String str)
    {
        int i = 0, iCount = 0;

        char Arr[] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int Countspace(String str)
    {
        int i = 0, iCount = 0;

        char Arr[] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        return iCount;
    }
}
class Program310
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX(); 
        int iRet = 0;

        System.out.println("Enter string ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);

        System.out.println("Number of capital characters : "+iRet);

        iRet = strobj.CountSmall(data);

        System.out.println("Number of small characters : "+iRet);

        iRet = strobj.CountDigit(data);

        System.out.println("Number of Digit are: "+iRet);

        iRet = strobj.Countspace(data);

        System.out.println("Number of Space are: "+iRet);

    }
}