
class MyException extends Exception
//class MyException extends RuntimeException(this works too since Runtime Exception is child of Exception)
{
   public MyException(String str)
   {
        //if you want ur exception to throw also a message
        //accept the message and utiliz the super() i.e constructor of Exception
        super(str);
   }
}
class CustomException
{
    public static void main(String a[])
    {
        int i = 0;
        int j = 0;

        try
        {
             j = 18/i;
            if(j == 0)
               throw new MyException("Throwing arithmetic error");

        }catch(MyException e)
        {
            System.out.println(e);
            //you can then redirect or reconnect (its not comulsory to print an exception)
        }
       

        System.out.println(j);

      }
    }
