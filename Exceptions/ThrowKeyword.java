//throw keyword enables us to throw exceptions

class ThrowKeyword
{
    public static void main(String a[])
    {
        int i = 0;
        int j = 0;

        try
        {
             j = 18/i;
            if(j == 0)
            //    throw new ArithmeticException();
            //    throw new Exception();

            //you can also pass a msg when throwing new exceptions
               throw new ArithmeticException("Throwing arithmetic error");

        }catch(ArithmeticException e)
        {
            System.out.println(e);
            //you can then redirect or reconnect (its not comulsory to print an exception)
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

      }
    }
