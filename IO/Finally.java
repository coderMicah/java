//finally block executes irrespective an exception was thrown or not
//finally is used mostly to close resources

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A 
{
    public static void main(String a[])throws IOException
    {
        System.out.println("Enter a number");
        BufferedReader bf = null;
        
        // try{
        //     bf = new BufferedReader(new InputStreamReader(System.in));
        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println(num);
        // }catch(IOException e)
        // {
        //     System.out.println(e);
        // }finally
        // {
        //     bf.close();
        // }
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }finally
        {
            bf.close();
        }
    }
}