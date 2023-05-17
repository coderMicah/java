//by default every constructor has a method called super() even if we cant see it mostly
//the super method executes first before any statement in constructor 

//Super method basiccaly calls the constructor(default not parameteried) of the super
//class if it exists

//the below example shows that even when a parameterized constructor is present in both classes 
// the super() coming from the B parameterized constructor will only call the default constructor
// in super class when object with int arg is instantiated

//if we want to use parameterized constructor for super class we must pass the parameter
//in super()

class A
{
    public A()
    {
        super();
        System.out.println("In A default connstructor");
    }
    public A(int a)
    {
        super();
        System.out.println("In A parameterized connstructor");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B default connstructor");
    }
    public B(int a)
    {
        //to make the super use parameterized constructor and not default constructor
        // super(a)
        super();
        System.out.println("In B parameterized connstructor");
    }
}

class Super
{
    public static void main(String a[])
    {
        B b = new B();
        B obj = new B(5);
    }
}