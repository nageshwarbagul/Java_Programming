import java.io.*;

class Program693
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");

            System.out.println(fobj.exists());
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}
