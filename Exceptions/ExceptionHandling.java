

class ExceptionHandling
{
    public static void main(String a[])
    {
        int i = 9;
        int j = 0;

        try
        {
             j = 18/i;
        }catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

    }
}