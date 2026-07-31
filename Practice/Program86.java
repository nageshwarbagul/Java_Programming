import java.util.Scanner;  

class program86
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;
        int iAge = 0;
        float fMarks=0.0f;

        System.out.println("Enter your Name : ");
        sName = sobj.nextLine();

        System.out.println("Enter your Age : ");
        iAge = sobj.nextInt();

        System.out.println("Enter your Marks : ");
        fMarks = sobj.nextFloat();

        System.out.println("name : " + sName);

        System.out.println("age : " + iAge);

        System.out.println("marks : " + fMarks);

        
    }
    
}
