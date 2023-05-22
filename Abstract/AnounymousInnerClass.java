
class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show1()
    {
        System.out.println("In B show");
    }
}

class AnounymousInnerClass
{
    public static void main(String a[])
    {
        A obj = new B()
        {
            public void show1()
            {
                System.out.println("In new show");
            }
        };

        ((B)obj).show1();

    }
}