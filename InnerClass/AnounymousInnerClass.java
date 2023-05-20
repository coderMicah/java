
class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}

//to overrride methods we basically do this
// class B extends A 
// {
//     public void show()
//     {
//         System.out.println("In new show");
//     }
// }

class Demo
{
    public static void main(String a[])
    {
        //we now override using a inner anounymous class
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In new show");
            } 
        };

        obj.show();
    }
}