import java.util.Scanner;

class Program303
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        String str = new String();

        System.out.println(str.length());

        System.out.println("Enter string ");
        str = sobj.nextLine();

        System.out.println("Strint is : "+str);

        System.out.println(str.length());

    }
}