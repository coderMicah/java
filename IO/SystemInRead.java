import java.io.IOException;
//Taking user input with System.in.read()will return an integer in ASCII values

class Demo
{
    public static void main(String a[])
    {
        int num;
        System.out.println("Please enter a number");
        try
        {
            num = System.in.read();
            System.out.println(num);
            
        }catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
}