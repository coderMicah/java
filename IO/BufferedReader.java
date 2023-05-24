import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A 
{
    public static void main(String a[])
    {
        System.out.println("Enter a number");
        
        try{
            //we are taking input fro console
            InputStreamReader in = new InputStreamReader(System.in);

            //buffered reader reads from many resource and can be passed as in arg
            // in BufferedReadr constructor
            BufferedReader bf = new BufferedReader(in);

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }catch(IOException e)
        {
            System.out.println(e);
        }

        //do not forget to close the resource in the finally
        // bf.close();
       
    }
}