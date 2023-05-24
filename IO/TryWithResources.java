import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//this will close resources automatically
//define the resourec in try()

class A 
{
    public static void main(String a[])
    {
        System.out.println("Enter a number");
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}