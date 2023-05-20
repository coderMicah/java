//outer classes can not be made static classes
class A 
{
    private int marks;

    public void show()
    {
        System.out.println("In A outer class");
    }

    //inner classes can be made static also
    class B 
    {
        
         public void config()
        {
            System.out.println("In B inner class");
        }
    }
}

class InnerClass
{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        //access config from obj object
        A.B obj1 = obj.new B();
        obj1.config();

        //creating a new object A and accessing config 
        A.B obj2 = new A().new B();
        obj2.config();

        //we can access inner static class
        // A.B obj3 = new A.B();
    }
}