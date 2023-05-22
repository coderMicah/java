

class MultipleExceptions
{
    public static void main(String a[])
    {
        int i = 9;
        int j = 0;
        int nums[] = new int[2];
        String str = null;

        try
        {
             j = 18/i;
             System.out.println(nums[3]);
             System.out.println(str.length());

        }catch(ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");
        }
        //when implementing multiple xceptions do not forget to have the default block
        //where you eill check for unaacounted exceptions(runtime errors)
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

      }
    }
