
abstract class A 
{
    public abstract void show();
}

class Demo
{
    public static void main(String a[])
    {
        //when we want to access the abstract methods atleast once 
        //we can use anounyousinner fn to do so
        //without anounymous inner class we will get the following error
        //error: A is abstract; cannot be instantiated

        A obj = new A()
        {
           public void show()
           {
            System.out.println("In new show");
           } 
        }
        ;
        obj.show();
    }
}