import java.util.*;

class Program809
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter String : ");
       String str = sobj.nextLine();

       char Arr[] = str.toCharArray();

       for(char ch : Arr)
       {
            System.out.println(ch);
       }
    }
}
